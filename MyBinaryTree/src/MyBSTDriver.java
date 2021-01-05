/**
 * Programmer: Marissa
 * Date: October 10, 2018
 */

public class MyBSTDriver 
{

    public static void main(String[] args) 
    {
        
        //Create a BST
        MyBST <String> tree = new MyBST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        
        
        //Traverse Tree
        System.out.println("InOrder(Sorted):");
        tree.inOrder();
        
        System.out.println();
        
        
        
        
        System.out.println("PostOrder(Sorted):");
        tree.postOrder();
        
        System.out.println();
        
        
        
        
        System.out.println("PreOrder(Sorted):");
        tree.preOrder();
        
        System.out.println();
        
        
        
        
        
        System.out.println("Total Number of Nodes: " + tree.getSize());
        
        System.out.println("Is Peter in the Tree?: " + tree.search("Peter"));
        
        
        
        
        
        System.out.println();
        
        
        tree.delete("George");
        
        
        System.out.println("InOrder(Sorted & Updated):");
        tree.inOrder();
        
        
        System.out.println();
        
        
        
    }
    
}
