/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

/**
 *
 * @author Yogesh
 */
class MThread extends Thread
{
    String name;
    ArrayList<Integer> list;
    MThread(String x,ArrayList<Integer> l)
    {
        list=l;
        name=x;
        start();
    }
    public void run()
    {
        try
        {
            ListIterator li=list.listIterator();
            while(li.hasNext())
            {
                System.out.println(name+" : "+li.next());
                Thread.sleep(500);
            }
        }
        catch(Exception e)
        {
            
        }
    }
}
        
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(45);
        list.add(46);
        list.add(47);
        list.add(48);
        list.add(49);
        list.add(50);
        list.add(51);
        list.add(52);
        list.add(53);
        list.add(54);
        list.add(55);
        list.add(56);
        list.add(57);
        list.add(58);
        list.add(59);
        list.add(60);
        list.add(61);
        MThread mt1=new MThread("List 1",list);
        list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        MThread mt2=new MThread("List 2",list);
        
        
    }
    
}
