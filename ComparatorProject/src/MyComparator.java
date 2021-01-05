import java.util.Comparator;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class MyComparator implements Comparator<String>
{

    @Override
    public int compare(String object1, String object2) 
    {
       return object1.length() - object2.length();
    }
    
    
    
}
