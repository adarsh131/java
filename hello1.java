import java.io.*;
import java.util.*;
import java.util.Scanner;
class a
{
    public  static void main(String[] args)
    {
          int a=10,i,j,l,li,z;
        System.out.println("hello world");
        
        Scanner b=new Scanner(System.in);
          System.out.println("enter the value");
          l=b.nextInt();
      
        for(i=0;i<l;i++)
        {
            System.out.println(" ");
            System.out.print(" ");
            for(j=1;j<=i;j++)
            {
                 System.out.print(" * ");
            }
           
        }
        for(i=l;i>0;i--)
        {
          System.out.println(" ");
          for(j=1;j<=i;j++)
          {
             System.out.print(" * ");
          }
        }
       System.out.println("enter  font size");
        li=b.nextInt();
        //l phase
        for(i=0;i<=li;i++)
        {
           System.out.println(" ");
          for(j=0;j<4;j++)
          {
            System.out.print("*");
          }
        }
        z=li/2;
        for(i=0;i<4;i++)
        {
          System.out.println("");
          for(j=0;j<li;j++)
          {
            System.out.print("*");
          }
        }
        System.out.println("hello");
      for(i=0;i<li;i++)
      {
        System.out.println(" * ");
        for(j=0;j<li;j++)
        {
           if(i==1 || i>=li-1 )
        {
          
          System.out.print("*");
          //if(j==li-1)
          //{
           // System.out.print("*");
          //}
        }
        }
      
      }
      System.out.println("array in java");
      int q[]=new int[50];
      int v,b1;

      System.out.println("enter the limit");
      b1=b.nextInt();
      System.out.println("enter the elements");
       for(v=0;v<b1;v++)
       {
         q[v]=b.nextInt();
       }
       System.out.println("elements are:");
        for(v=0;v<b1;v++)
       {
         System.out.print(q[v]);
         System.out.print("  ");
       }
    }
}