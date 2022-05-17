import java.io.*;
import java.util.*;
import java.util.Scanner;
class p
{
    String k;
        int z,p;
    public void get()
    {
        
        
        Scanner n=new Scanner(System.in);
        System.out.println("enter the product name:");
         k=n.nextLine();
         System.out.println("enter product code:");
          z=n.nextInt();
          System.out.println("enter product price:");
          p=n.nextInt();

    }
    public void display()
    {
        System.out.print("product name:");
        System.out.println(k);
        System.out.print("product code:");
        System.out.println(z);
        System.out.print("product price:");
        System.out.println(p);
    }
}
class product
{
    public static void main(String[] args)
    {
        p  ob1=new p();
        p ob2=new p();
         p ob3=new p();
        ob1.get();
        
        
        ob2.get();
        

        ob3.get();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("product details:");
        System.out.println("product 1");
        ob1.display();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("product 2");
        ob2.display();
         System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("product 1");
        ob3.display();
        System.out.println(" ");
        System.out.println("LOWEST PRICE PRODUCT ");
    /*if(ob1.p < ob2.p)
    {
        if(ob1.p < ob3.p)
        {
            System.out.println("lowest price product :");
            System.out.print(ob1.k);
            System.out.print("price:");
            System.out.print(ob1.p);
        }
        else
        {
            System.out.println("lowest price product :");
            System.out.print(ob3.k);
            System.out.print("price:");
            System.out.print(ob3.p);
        }
    }
   else
   {
      System.out.println("lowest price product :");
            System.out.println(ob2.k);
            System.out.print("price:");
            System.out.print(ob2.p);
   }*/
   if(ob1.p < ob2.p && ob1.p < ob3.p )
   {
     System.out.println("lowest price product :");
            System.out.print(ob1.k);
            System.out.print("price:");
            System.out.print(ob1.p);
   }
   else if(ob2.p < ob1.p && ob2.p < ob3.p)
   {
       System.out.println("lowest price product :");
            System.out.print(ob2.k);
            System.out.println("price:");
            System.out.print(ob2.p);
   }
   else
   {
       System.out.println("lowest price product :");
            System.out.print(ob3.k);
            System.out.println("price:");
            System.out.print(ob3.p);
   }


    }
}