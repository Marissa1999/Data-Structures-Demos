import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Programmer: Marissa
 * Date: November 14, 2018
 */

public class MapDemo 
{

    
    public static void main(String[] args) 
    {
        
        
        Map<String,Integer> hashMap = new HashMap();
        
        
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 30);
        hashMap.put("Levis", 29);
        hashMap.put("Cook", 29);
        
        
        System.out.println("Entries in hashMap: ");
        System.out.println(hashMap + "\n");
        
        
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Entries in treeMap: ");
        System.out.println(treeMap + "\n");
        
        
        //True: follows by access order
        //False: follows by insertion order
        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        
       
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 30);
        linkedHashMap.put("Levis", 29);
        
        
        //Replaced with the newest value
        linkedHashMap.put("Smith", 25);
        linkedHashMap.put("Cook", 29);
        
        
        System.out.println("The age for Levis is " + linkedHashMap.get("Levis"));
        System.out.println("The age for Anderson is " + linkedHashMap.get("Anderson"));
        System.out.println("Entries in linkedHashMap: ");
        System.out.println(linkedHashMap + "\n");
        
        
    }
    
}
