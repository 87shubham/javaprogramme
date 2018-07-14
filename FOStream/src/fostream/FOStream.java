/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fostream;

/**
 *
 * @author Yogesh
 */
import java.io.*;  
public class FOStream
{  
  public static void main(String args[])
  {  
   try
   {  
     FileOutputStream fout=new FileOutputStream("d:/abc.txt");  
     String s="À";  
     byte b[]=s.getBytes();//converting string into byte array 
    /* int a=128;
     byte b=(byte)a;*/
     fout.write(b);  
     fout.close();  
     System.out.println("success...");  
    }
    catch(Exception e)
    {
       System.out.println(e);
    }  
  }  
}  