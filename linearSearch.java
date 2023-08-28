import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int elementToSearch = scanner.nextInt();

        int position = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == elementToSearch) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index " + position);
        } else {
            
System.out.println("Element not found in the array");
        }
    }
}
