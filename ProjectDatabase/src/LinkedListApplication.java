/**
 * Programmer: Marissa
 * Date: August 29, 2018
 */

public class LinkedListApplication 
{
    
    public static void main (String[] args)
    {
        
        MyLinkedList<String> list1 = new MyLinkedList();
        
        
        list1.addFirst("First");
        list1.addFirst("Second");
        list1.addFirst("Third");
        list1.addFirst("All!");
        list1.addFirst("Hello");
        list1.addLast("The End");
       
        
        
        for (int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i));
        }
        
        
        System.out.println();
           
        System.out.println("The Ouput:");
        
        String[] myArray = {"Hello", "dear", "students"};
        
        MyLinkedList<String> list2 = new MyLinkedList<>(myArray);
        
        
        for (int i = 0; i < list2.size(); i++)
        {
            System.out.println(list2.get(i));
        }
        
        
        System.out.println();
    
        
        
        System.out.println("The first removed: " + list2.removeFirst());
        
        System.out.println("The last removed: " + list2.removeLast());
        
        
        for (int i = 0; i < list2.size(); i++)
        {
            System.out.println("The final list: " + list2.get(i));
        }
        
        
        System.out.println("The word, " + list2.remove(0) + " is removed from the list.");
        
        
        
        
        String[] myArray2 = {"Boys", "and", "Girls", "..."};
        
        MyLinkedList<String> list3 = new MyLinkedList<>(myArray2);
        
        
        System.out.println("It is " + list3.contains("and") + " that the array contains this element.");
        
        
        
        
        System.out.println("This element is found in index " + list3.indexOf("and") + ".");
          
        
        
        
        
        list3.set("Musicians", 2);
        
        
        for (int i = 0; i < list3.size(); i++)
        {
            System.out.println("The final list: " + list3.get(i));
        }
       
        
        
    }
    
       
}
