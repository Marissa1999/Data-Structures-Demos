/**
 * Programmer: Marissa
 * Date: September 19, 2018
 */

public class Student implements Comparable<Student>
{
    
    private String idNumber;
    private String name;
    private double gpa;
    
    
    public Student(String i, String n, double g)
    {
        this.idNumber = i;
        this.name = n;
        this.gpa = g;
    }
    
    
    public double getGpa()
    {
        return this.gpa;
    }

    
    @Override
    public int compareTo(Student object) 
    {
        
        if (this.gpa > object.gpa)
        {
            return 1;
        }
        
        else if (this.gpa == object.gpa)
        {
            return 0;
        }
        
        else
        {
            return -1;
        }
        
    }
    
    
    
    public String getName()
    {
        return this.name;
    }
    
    
    
  
}
