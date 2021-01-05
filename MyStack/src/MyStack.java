import java.util.ArrayList;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 * @param <E>
 */


public class MyStack<E>
{
    
    private ArrayList<E> stack;
    
    
   
   
    public MyStack()
    {     
        this.stack = new ArrayList(); 
    }
     
    
    
    public int getSize()
    {
        return stack.size();
    }
    
    
    
    
    public E peek()
    {
        return stack.get(stack.size() - 1);   
    }
    
    
    
    
    public E pop()
    {
        return stack.remove(stack.size() - 1); 
    }
    
    
    
    
    public void push(E object)
    {   
        stack.add(object);
    }
    
    
    
    
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    
    
    
    
    @Override
    public String toString()
    {
        return "Stack: " + this.stack.toString();
    }
    
    
    
}
