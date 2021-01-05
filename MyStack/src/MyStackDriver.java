import java.util.Stack;
import java.util.Vector;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */


public class MyStackDriver 
{

   
    public static void main(String[] args) 
    {
      
        MyStack<Integer> stack1 = new MyStack<>();
        
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        
        
        
        System.out.println(stack1);
        
        
        System.out.println(stack1.peek());
        System.out.println("After peek: " + stack1);
        
        
        stack1.pop();
        System.out.println("After pop: " + stack1);
        
        
        
        
        
       Stack<Integer> oneStack = new Stack<>();
      
        
        oneStack.push(5);
        oneStack.push(8);
        oneStack.push(100);
        
        
        while (!oneStack.isEmpty())
        {
            System.out.println(oneStack.pop());
        }
        
        
        Vector<String> oneStackTwo = new Vector<>();
        oneStackTwo.add("Hello");
     
          
        
    }
    
}
