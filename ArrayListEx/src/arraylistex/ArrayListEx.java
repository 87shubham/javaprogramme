/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Yogesh
 */
public class ArrayListEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList<Integer> intarr=new ArrayList<Integer>();
        intarr.add(5);
        intarr.add(14);
          
        Iterator it = intarr.iterator();
 
        while(it.hasNext()) 
        {
            Integer obj = (Integer)it.next();
            System.out.println(obj);
        }
        
        ListIterator litr=intarr.listIterator();
 
        System.out.println("Traversing the list in forward direction:");
        while(litr.hasNext())
        {
            System.out.println(litr.next());
        }
        System.out.println("\nTraversing the list in backward direction:");
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
    }
    }
    
}
