import java.io.*;
import java.util.*;
import java.util.Scanner;
class array
{
    public static void main(String[] args)
    {
        int a[]=new int[50];
        int n,i,j,f=0;
        Scanner b=new Scanner(System.in);
        System.out.println("enter the size");
         n=b.nextInt();
         System.out.println("enter array elements");
         for(i=0;i<n;i++)
         {
             a[i]=b.nextInt();
         }
         System.out.println("Array elements:");
         for(i=0;i<n;i++)
         {
             System.out.println(a[i]);
         }
         System.out.println("");
         System.out.println("");
         System.out.println("enter the required element:");
         j=b.nextInt();
         for(i=0;i<n;i++)
         {
             if(j==a[i])
             {
                 System.out.println(j + "  found in position "+ (i+1));
             }
             
         }
         

    }
}