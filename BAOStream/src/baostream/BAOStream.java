/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baostream;

/**
 *
 * @author Yogesh
 */
import java.io.*;  
class BAOStream
{  
 public static void main(String args[])throws Exception{  
  FileOutputStream fout1=new FileOutputStream("d:/f1.txt");  
  FileOutputStream fout2=new FileOutputStream("d:/f2.txt");  
  
  ByteArrayOutputStream bout=new ByteArrayOutputStream();
  String s="India is great";
  byte []b=s.getBytes();
  bout.write(b);  
  bout.writeTo(fout1);  
  bout.writeTo(fout2);  
  
  bout.flush();  
  bout.close();//has no effect  
  System.out.println("success...");  
 }  
}   