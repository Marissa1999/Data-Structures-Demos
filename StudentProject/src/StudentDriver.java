import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class StudentDriver
{

 
    public static void main(String[] args) 
    {
        
        List<Student> listOne = new ArrayList<>();
        
        listOne.add(new Student("12678", "Harry", 3.4));
        listOne.add(new Student("13679", "Eric", 2.9));
        listOne.add(new Student("14666", "Jean", 3.5));
        
        
        for (Student object : listOne)
        {
            System.out.println("GPA is " + object.getGpa());
        }
        
        
        
        System.out.println();
        
        
        
        System.out.println("Using Natural-Order Sort:");
        
        Collections.sort(listOne);
        
        
        
        
        for (Student object: listOne)
        {
            System.out.println("GPA is " + object.getGpa());
        }
        
        
        
       System.out.println();
        
       
       
       
       System.out.println("Comparator Sort: ");
       
       Collections.sort(listOne, new CompareStudent());
       
       
       
       for (Student object: listOne)
       {
           System.out.println("GPA is " + object.getName());
       }
          
        
    }
    
}
