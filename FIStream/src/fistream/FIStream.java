/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fistream;

/**
 *
 * @author Yogesh
 */
import java.io.*;  
class FIStream
{  
 public static void main(String args[])
 {  
  try{  
    FileInputStream fin=new FileInputStream("d:/abc.txt");  
    int i=0;  
    while((i=fin.read())!=-1){  
     System.out.print((char)i);  
    }  
    fin.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  