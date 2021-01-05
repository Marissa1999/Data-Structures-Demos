import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 * @param <E>
 */

public class MyQueue<E> 
{
    
    private LinkedList<E> queue;
    
    
    
    public MyQueue()
    {
        this.queue = new LinkedList();
    }
    
    
    
    public MyQueue(List queuelist)
    {
       this.queue = new LinkedList<>(queuelist);
    }
    
    
    
     public MyQueue(E[] array)
     {
         this(Arrays.asList(array));
     }
    
     
     
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    
    
    
    public E first()
    {
        return queue.getFirst();
    }
    
    
    
    public void enqueue(E object)
    {
        queue.addLast(object);
    }
    
    
    
    public E dequeue()
    {
        return queue.removeFirst();
    }
    
    
    
    public int getSize()
    {
        return queue.size();
    }
    
    
    
    @Override
    public String toString()
    {
        return "Queue: " + this.queue.toString();
    }
    
}
