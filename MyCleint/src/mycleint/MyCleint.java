/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycleint;

/**
 *
 * @author Yogesh
 */
import java.io.*;  
import java.net.*;  
public class MyCleint {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost",3306);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello Server");  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  