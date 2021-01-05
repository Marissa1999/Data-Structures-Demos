import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Programmer: Marissa
 * Date: November 14, 2018
 */

public class ClientDemo 
{

   
    public static void main(String[] args)
    {
      
        Client client1 = new Client(394, "Joss Stone", "76 Main Avenue");
        Client client2 = new Client(9492, "Barbara Ann", "23 Main Avenue");
        Client client3 = new Client(12, "Paul Newman", "90 Main Avenue");
        Client client4 = new Client(589, "Sam Bogeyman", "13 Main Avenue");
        
        
        
        Map<Integer, Client> hashMap = new HashMap();
        
         
        hashMap.put(client1.getIdNumber(), client1);
        hashMap.put(client2.getIdNumber(), client2);
        hashMap.put(client3.getIdNumber(), client3);
        hashMap.put(client4.getIdNumber(), client4);
        
        
        
        System.out.println("Entries in hashMap: ");
        System.out.print(hashMap + "\n");
        
        
        Map<Integer, Client> treeMap = new TreeMap<>(hashMap);
        System.out.println("Entries in treeMap: ");
        System.out.print(treeMap + "\n");
        
    }
    
}
