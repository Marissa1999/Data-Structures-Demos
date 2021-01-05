/**
 * Programmer: Marissa
 * Date: October 10, 2018
 * @param <E>
 */

public class MyBST<E extends Comparable<E>> implements MyTree<E>
{
   

    private TreeNode<E> root;
    private int size;
    
    
    
    
    public MyBST()
    {  
        this.size = 0;
        this.root = null;        
    }
    
    

    
    public MyBST(E[] objects)
    {
        
        for (E element : objects)
        {     
             insert(element);
        }

    }

    
    
    
    
    public MyBST(int[] array) 
    {
       
        for(int i = 0; i < array.length; i++)
        {  
              insert((E)(Integer)array[i]);
        }
        
        
    }

  
    
    
    public int compareTo(Object t) 
    {
        return 0;
    }

    
    
    
    
    public int sumLeftBranch()
    {
        
        TreeNode<E> current = this.root;
        int totalSum = 0;
        
        
        if (this.root == null)
        {
            return 0;
        }
     
        
        while(current != null)
        {            
            totalSum += (Integer) current.element;
            current = current.left;
        }
                 
        
        return totalSum;

        
    }
    
    
    
    
    
    public E getElemAtLevel_LeftBranch(int theLevel)
    {
        
        TreeNode<E> current = this.root;
        
        
        if (this.root == null)
        {
            return null;
        }
        
        
        for (int i = 1; i < theLevel; i++)
        {
            current = current.left;   
        }
        
        
        return current.element;

    }
    
    
    
    
    
    
    public E getMax()
    { 
        
        TreeNode<E> current = this.root;
        
        
        while(current.right != null)
        {  
            current = current.right;   
        }
                 
        
        return current.element; 
        
    }
    
    
    
    
    
    
    @Override
    public boolean isEmpty()
    {      
        return this.size == 0;   
    }
    
    
    
    
    
    @Override
    public boolean search(E e) 
    {
       
        TreeNode<E> current = this.root;
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                current = current.right;
            }
                    
            else
            {
                return true;
            }
            
        }
        
        return false;
        
    }

    
    
    
    
    
    
    @Override
    public boolean insert(E e) 
    {
       
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
        if(this.root == null)
        {
            this.root = new TreeNode(e);
        }
        
 
     else
     {
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            else if (e.compareTo(current.element) > 0)
            {
                 parent = current;
                 current = current.right;
            }
                    
            else
            {
                return false;
            }
            
        }
        

        
        if(e.compareTo(parent.element) < 0)
        {
            parent.left = new TreeNode(e);
        }
        
        else
        {
            parent.right = new TreeNode(e);
            this.size++;
        }
        
     } 
        
        return true;

        
    }

    
    
    
    
    
    
    @Override
    public boolean delete(E e)
    {   
       
        TreeNode<E> current = this.root;
        TreeNode<E> parent = current;
        
        
        while(current != null)
        {
            
            if(e.compareTo(current.element) < 0)
            {
                parent = current;
                current = current.left;
            }
            
            
            else if (e.compareTo(current.element) > 0)
            {
                parent = current;
                current = current.right;
            }
            
            else
            {
                break;
            }
           
        }  
            
        
          if(current == null)
          {        
              return false;          
          }
          
          
          //Case 1: Current Has No Left Child
          if(current.left == null)
          {
              
              if(parent == null)
              {
                  this.root = current.right;
              }
              
              else
              {
                  if(e.compareTo(parent.element) < 0)
                  {             
                      parent.left = current.right;   
                  }
                  
                  else
                  {
                      parent.right = current.right;
                  }
              }
              
          }
          
          
          //Case 2: Current Has Left Child
          else
          {
              
              TreeNode<E> parentOfRightMost = current;
              TreeNode<E> rightMost = current.left;
              
              
              
              while(rightMost.right != null)
              {  
                  parentOfRightMost = rightMost;
                  rightMost = rightMost.right;
              }
              
              
              current.element = rightMost.element;
              
              
              if(parentOfRightMost.right == rightMost)
              {
                  parentOfRightMost.right = rightMost.left;
              }
              
              //Special Case: If Parent of Most Right is Equal to Current
              else
              {
                  parentOfRightMost.left = rightMost.left;
              }
              
              
          }
           
          
        this.size--;
        return true;  
        
        
    }

    
    
    
    
    
    
    @Override
    public void inOrder() 
    {  
        inOrder(this.root);       
    }
    
    
    
    
    
    @Override
    public void inOrder(TreeNode<E> node)
    {
        if (node == null)
        {
            return;
        }
        
        inOrder(node.left);
        System.out.println(node.element + "");
        inOrder(node.right);
       
    }

    
    
    
    @Override
    public void preOrder() 
    {  
        preOrder(this.root);       
    }
    
    
    
    @Override
    public void preOrder(TreeNode<E> node) 
    {
        
        if(node == null)
        {
            return;
        }
        
         System.out.println(node.element + "");
         preOrder(node.left);
         preOrder(node.right);
            
        
    }

    
    
    @Override
    public void postOrder() 
    {  
        postOrder(this.root);       
    }
    
    
    @Override
    public void postOrder(TreeNode<E> node) 
    {
       
        if(node == null)
        {
            return;
        }
        
        
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.element + "");
        
        
    }

    
    
    
    
    
    @Override
    public int getSize() 
    {
        return this.size;
    }
    
    
    
    
    
    

    @Override
    public void clear() 
    {
        this.root = null;
        this.size = 0;
    }

  
    
}
