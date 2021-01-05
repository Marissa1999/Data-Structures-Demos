import java.util.Arrays;

/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class SortStringByLength
{

    
    public static void main(String[] args) 
    {
        
        String[] cities = {"Atlanta", "Savannah", "New York", "Dallas"};
        
        
        
        Arrays.sort(cities);
        
        for (String defaultObject : cities)
        {
            System.out.println(defaultObject + " ");
        }
        
        
        
        System.out.println();
        
        
        
        
        Arrays.sort(cities, new MyComparator());
        
        for (String myObject : cities)
        {
            System.out.println(myObject + " ");
        }
        
       
     }
    
}
