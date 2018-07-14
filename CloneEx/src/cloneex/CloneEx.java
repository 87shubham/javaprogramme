h/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloneex;

/**
 *
 * @author Yogesh
 */
class Student18 implements Cloneable
{  
    int rollno;  
    String name;  
    
    Student18(int rollno,String name)
    {  
        this.rollno=rollno;  
        this.name=name;  
    }  
  
    public Object clone()throws CloneNotSupportedException
    {  
        Object o=super.clone();
        return o;  
    }  
}

public class CloneEx
{
    public static void main(String args[])
    {  
        try
        {  
            Student18 s1=new Student18(101,"amit");  
  
            Student18 s2=(Student18)s1.clone();  
  
            System.out.println(s1.rollno+" "+s1.name);  
            System.out.println(s2.rollno+" "+s2.name);  
  
        }
        catch(CloneNotSupportedException c){}  
  
}  
}  