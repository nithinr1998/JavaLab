import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                byte[] sendData;
                System.out.print("Client: ");
                String clientMessage = scanner.nextLine();
                sendData = clientMessage.getBytes();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length,    serverAddress, serverPort);
                socket.send(sendPacket);

                if (clientMessage.equals("done")) {
                    System.out.println("Client is exiting...");
                    break;
                }
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                

String serverMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server: " + serverMessage);

                if (serverMessage.equals("done")) {
                    System.out.println("Server is exiting...");
                    break;
                }
            }
            socket.close();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
