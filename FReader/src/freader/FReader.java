/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freader;

/**
 *
 * @author Yogesh
 */
import java.io.*;  
class FReader{  
 public static void main(String args[])throws Exception{  
  FileReader fr=new FileReader("d:/myfile.txt");  
  int i;  
  while((i=fr.read())!=-1)  
  System.out.print((char)i);  
  
  fr.close();  
 }  
}  

