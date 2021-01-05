import java.util.Objects;

/**
 * Programmer: Marissa
 * Date: September 7, 2018
 */

public class Book implements Comparable<Book>
{
    
    private final String title;
    private final String author;
    private final int pages;
    
    
    
    public Book(String title, String author, int pages)
    {
        this.title = title;    
        this.author = author;
        this.pages = pages;
    }
    
    
    
    public String getTitle()
    {
        return this.title;
    }
    
    
    
    
    public String getAuthor()
    {
        return this.author;
    }
    
    
    
    
    public int getPages()
    {
        return this.pages;
    }
    
    
    
    
    @Override
    public String toString()
    {
         return "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "Pages: " + getPages() + "\n";
    }

    
    
    @Override
    public int compareTo(Book object)
    {
        return this.getPages() - object.getPages();
    }
    
    
    
    
    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.author);
        return hash;
        
    }

    
    
    
    @Override
    public boolean equals(Object obj)
    {
        
        if (this == obj) 
        {
            return true;
        }
        
        if (obj == null) 
        {
            return false;
        }
        
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        
        final Book other = (Book) obj;
        
        if (!Objects.equals(this.title, other.title))
        {
            return false;
        }
        
        return Objects.equals(this.author, other.author);
        
    }
    
    
    
    
}
