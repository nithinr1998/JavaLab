import java.util.*;

public class PriorityQueueDemo {
 public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
                	PriorityQueue<Integer> myqueue = new PriorityQueue<Integer>();
        
              	 for(int i=0;i<5;i++){
			int j = i + 1;
			System.out.println("Enter the Element "+ j + " : ");
			int var1 = sc.nextInt();
			myqueue.add(var1);
			}
        
               		 System.out.println("Queue: " + myqueue);
		
			System.out.println(myqueue.peek());
        
        			int removedElement = myqueue.poll();

       			System.out.println("Removed element: " + removedElement);
        
        			System.out.println("Queue after removal: " + myqueue);
    		}
}

