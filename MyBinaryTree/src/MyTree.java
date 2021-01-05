/**
 * Programmer: Marissa
 * Date: October 3, 2018
 * @param <E>
 */

public interface MyTree<E>
{
    
    
    public boolean search(E e);
    public boolean insert(E e);
    public boolean delete(E e);
    public void inOrder();
    public void preOrder();
    public void postOrder();
    public void inOrder(TreeNode<E> node);
    public void preOrder(TreeNode<E> node);
    public void postOrder(TreeNode<E> node);
    public int getSize();
    public boolean isEmpty();
    public void clear();
    
    
    
}
