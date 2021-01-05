import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class MyQueueDriver 
{

    
    public static void main(String[] args) 
    {
        
        MyQueue<String> queue1 = new MyQueue<>();
        
        
        queue1.enqueue("First");
        queue1.enqueue("Second");
        queue1.enqueue("Third");
        queue1.enqueue("Last");
        
        
        
        System.out.println(queue1);
        System.out.println(queue1.first());
        
        
        queue1.dequeue();
        System.out.println("After dequeue: " + queue1);
        
        
        queue1.dequeue();
        System.out.println("After dequeue again: " + queue1);
        
        
        
        
        
        
        String[] arrayList = { "Testing", "Testing", "Again", "!!!", "10", "4" };
        
        MyQueue<String> queue2 = new MyQueue<>(arrayList);
        
        System.out.println(queue2);
        
        
        
        
        
        
        List<String> list = new ArrayList<>(Arrays.asList(arrayList));
        
        MyQueue<String> queue3 = new MyQueue<>(list);
         
        System.out.println(queue3);
        
        
        /*
        int[] list2 = { 2, 3, 1, 0, 4 };
        System.out.println(Arrays.asList(list2).toString());
        Arrays.sort(list2);
        */
        
        
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Oklahoma");
        myQueue.offer("Indiana");
        myQueue.offer("Georgia");
        myQueue.offer("Texas");
        
        while(myQueue.size() > 0)
        {
            System.out.print(myQueue.remove() + " ");
        }
        
        
        System.out.println();

       
        
         
        Deque<String> myQueueTwo = new LinkedList<>();
        myQueueTwo.offer("Hello");
        
        
        
        
        
        
        PriorityQueue<String> myQueueThree = new PriorityQueue<>();
        myQueueThree.offer("Oklahoma");
        myQueueThree.offer("Indiana");
        myQueueThree.offer("Georgia");
        myQueueThree.offer("Texas");
        
        
        while(myQueueThree.size() > 0)
        {
            System.out.print(myQueueThree.remove() + " ");
        }
        
        
        
        System.out.println();
        
        
        
        
        PriorityQueue<String> myQueueFour = new PriorityQueue<>(Collections.reverseOrder());
        myQueueFour.offer("Oklahoma");
        myQueueFour.offer("Indiana");
        myQueueFour.offer("Georgia");
        myQueueFour.offer("Texas");
        
        
        while(myQueueFour.size() > 0)
        {
            System.out.print(myQueueFour.remove() + " ");
        }
        
        
        
        
        System.out.println();
        
        
        
        
        PriorityQueue<String> myQueueFive = new PriorityQueue<>(new CompareLength());
        myQueueFive.offer("Oklahoma");
        myQueueFive.offer("Indiana");
        myQueueFive.offer("Georgia");
        myQueueFive.offer("Texas");
        
        
        while(myQueueFive.size() > 0)
        {
            System.out.print(myQueueFive.remove() + " ");
        }
        
        
        
        
        
    }
    
}
