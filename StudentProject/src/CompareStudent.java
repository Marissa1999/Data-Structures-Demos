import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class CompareStudent implements Comparator<Student>
{

    @Override
    public int compare(Student object1, Student object2) 
    {
       return object1.getName().compareTo(object2.getName());
    }
    
}
