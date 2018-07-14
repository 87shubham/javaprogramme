/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genclassex;

/**
 *
 * @author Yogesh
 */
class GenClass<E>
{
    E arr[];
   
    GenClass(E arr[])
    {
        this.arr=arr;
    }
    
    void show()
    {
        //Code 
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
public class GenClassEx 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Integer arri[]={4,6,7,3,9};
        Double arrd[]={3.45,1.2,4.7,4.5};
        String arrs[]={"India","Yogesh","Shubham"};
        
        GenClass<Integer> obji=new GenClass<Integer>(arri);
        GenClass<Double> objd=new GenClass<Double>(arrd);
        GenClass<String> objs=new GenClass<String>(arrs);
        
        System.out.print("\nIntegers are: ");
        obji.show();
        System.out.print("\nDoubles are: ");
        objd.show();
        System.out.print("\nStrings are: ");
        objs.show();
        
        
        
        
        
        
    }
    
}
