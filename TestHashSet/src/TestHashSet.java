import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Programmer: Marissa
 * Date: November 9, 2018
 */

public class TestHashSet 
{

   
    public static void main(String[] args) 
    {
        
        Set<String> set = new HashSet<>();
        
        
        set.add("London");
        set.add("Paris");
        set.add("New York");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("New York");
        
        
        System.out.println(set);
        
        
        for (String s: set)
        {
            System.out.print(s.toUpperCase() + " ");
        }
        
        
        System.out.println();
        System.out.println();
        
        
        
        
       
       Set<String> linkedSet = new LinkedHashSet<>();
        
        
        linkedSet.add("London");
        linkedSet.add("Paris");
        linkedSet.add("New York");
        linkedSet.add("San Francisco");
        linkedSet.add("Beijing");
        linkedSet.add("New York");
        
        
        System.out.println(linkedSet);

        
        
        for (String s: linkedSet)
        {
            System.out.print(s.toLowerCase() + " ");
        }
        
        
        
        
        System.out.println();
        System.out.println();
        
        
        
        
        
        Book[] array = { new Book("Fairy Tales", "Grimm", 1000), new Book("Doors", "Jim", 300), 
                         new Book("Who Are You?", "Pete", 440), new Book("Goals", "Marissa", 500),
                         new Book("Goals", "Marissa", 500) };
         
        
         
        
        Set<Book> bookSet = new LinkedHashSet<>(Arrays.asList(array));         
        
        
        
        for (Book object: bookSet)
        {
            System.out.println(object);
        }
        
    
        
        
        
        TreeSet<Book> bookTreeSet = new TreeSet<>(bookSet);
        
        
        System.out.println(bookTreeSet);
        System.out.println();
        System.out.println("First: \n" + bookTreeSet.first());
        System.out.println("Last: \n" + bookTreeSet.last());
        System.out.println("Head Set: \n" + bookTreeSet.headSet(new Book("Who Are You?", "Pete", 440)));
        System.out.println("Tail Set: \n" + bookTreeSet.tailSet(new Book("Who Are You?", "Pete", 440)));
        

        System.out.println("Lower: \n" + bookTreeSet.lower(new Book("Who Are You?", "Pete", 440)));
        System.out.println("Higher: \n" + bookTreeSet.higher(new Book("Who Are You?", "Pete", 440)));
        System.out.println("Floor: \n" + bookTreeSet.floor(new Book("Who Are You?", "Pete", 440)));
        System.out.println("Ceiling: \n" + bookTreeSet.ceiling(new Book("Who Are You?", "Pete", 440)));
        System.out.println("Poll First: \n" + bookTreeSet.pollFirst());
        System.out.println("Poll Last: \n" + bookTreeSet.pollLast());
        System.out.println(bookTreeSet);
        
        
        
    }
    
}
