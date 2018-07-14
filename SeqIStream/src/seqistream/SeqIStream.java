/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seqistream;

/**
 *
 * @author Yogesh
 */

import java.io.*;  
public class SeqIStream {
  public static void main(String args[])throws Exception{  
   FileInputStream fin1=new FileInputStream("d:/f1.txt");  
   FileInputStream fin2=new FileInputStream("d:/f2.txt");  
  
   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);  
   int i;  
   while((i=sis.read())!=-1){  
    System.out.print((char)i);  
   }  
   sis.close();  
   fin1.close();  
   fin2.close();  
  }  
}  