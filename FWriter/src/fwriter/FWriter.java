/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fwriter;

/**
 *
 * @author Yogesh
 */
import java.io.*;
import java.io.File;
import java.io.FileWriter;
class FWriter//Test
{
 public static void main(String[] args)
 {
  try 
  {
   File fl = new File("d:/myfile.txt");
   String str="À";
   FileWriter fw = new FileWriter(fl) ;
   //int i=146;
   fw.write(str);
   fw.close();
   
   }
  catch (IOException  e)
  { e.printStackTrace(); }
 }
}