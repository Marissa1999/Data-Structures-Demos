/**
 * Programmer: Marissa Gonçalves
 * Date: August 22, 2018
 **/

public class LinkedLists 
{
  
    
     class Node
     { 
        String element;
        Node next;
        
                
         public Node(String o)
        {
           element = o;
        }
     }
         
     
     
      
    public static void main (String[] args)
    {
        
      class Node<E> 
      {
           E element;
           Node<E> next;
             
             
           public Node(E o)
           {
               element = o;
           }       
      }
        
      
      
        Node <String> head= null;
        Node<String> tail = null;
        
        
        head = new Node<>("Chicago");
        tail=head;
        
        
        tail.next = new Node<>("Denver");
        tail= tail.next;
        
        
        tail.next =new Node<>("Dallas");
        tail = tail.next;
        
        
        
        Node<String> current = head;
        while(current != null)
        {
            System.out.println(current.element);
            current = current.next;
        }
        
    }
    
    
    
}
      
    
    
    
        
         
        
             
             
         
       
         
         
         
         
    
         
         
         
         
    
    
    
    
    

