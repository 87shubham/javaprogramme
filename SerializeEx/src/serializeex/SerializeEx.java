/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
d * and open the template in the editor.
 */
package serializeex;

/**
 *
 * @author Yogesh
 */
//import SerClasses.Student;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student  implements Serializable{
   public     int id;
   public     String name;
   public  Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}   
public class SerializeEx{  
 public static void main(String args[])throws Exception{  
  Student s1 =new Student(211,"ravi");  
  
  FileOutputStream fout=new FileOutputStream("d:/f.txt");  
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1);  
  out.flush();  
  System.out.println("success");  
 }  
}  