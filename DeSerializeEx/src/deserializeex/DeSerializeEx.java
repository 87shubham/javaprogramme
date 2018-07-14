/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deserializeex;

import java.io.Serializable;

/**
 *
 * @author Yogesh
 */
import java.io.*; 


 //import SerClasses.Student;
class Student{
   public     int id;
   public     String name;
   public  Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}   
public class DeSerializeEx{  
 public static void main(String args[])throws Exception{  
    
     try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("d:/k.txt"))) {
         Student s=(Student)in.readObject();
         System.out.println(s.id+" "+s.name);
     }  
 }  
}  