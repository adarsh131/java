import java.io.*;
import java.util.*;
import java.util.Scanner;
class smat
{
    public static void main(String[] args)
    {
        int a[][]=new int[50][50];
        int t[][]=new int[50][50];
        int bi[]=new int[50];
        int l,i,j,size,x,m,f=0;
        Scanner b=new Scanner(System.in);
        System.out.print("enter the limit:");
        l=b.nextInt();
        System.out.println("enter the elements");
        for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
                a[i][j]=b.nextInt();
            }
        }
        System.out.println("MATRIX");
        for(i=0;i<l;i++)
        {
            System.out.println(" ");
            for(j=0;j<l;j++)
            {
                System.out.print("  ");
                System.out.print(a[i][j]);
            }
        }
        System.out.println("");
        System.out.println("transpose");
       
        
            
            
            for(j=0;j<l;j++)
            {
                System.out.println(" ");
                for(i=0;i<l;i++)
                {
                 System.out.print(a[i][j] + " ");
                 t[j][i]=a[i][j];

                }
             
            }
            System.out.println("");
            System.out.println("MATRIX transpose");
        for(i=0;i<l;i++)
        {
            System.out.println(" ");
            for(j=0;j<l;j++)
            {
                System.out.print("  ");
                System.out.print(t[i][j]);
            }
        }
        System.out.println("");
            System.out.println("");
            
     for(i=0;i<l;i++)
        {
            for(j=0;j<l;j++)
            {
               if(a[i][j]!=t[i][j])
               {
                   f=1;
               }
            }
        }
        if(f==1)
        {
            System.out.println("not symmetric");
        }
        else{
            System.out.println("Symmetric Matrix");
        }
        /*System.out.println("enter array limit");
        size=b.nextInt();
        for(i=0;i<size;i++)
        {
          bi[i]=b.nextInt();
        }
        System.out.println("ARRAY");
        for(i=0;i<size;i++)
        {
         System.out.print(" ");
         System.out.print(bi[i]);
        }
        System.out.println("prime check");
         for(i=0;i<size;i++)
        {
         
         
            x =bi[i]/2;
            for(i=1;i<=x;i++)
            {
               if(bi[i]%i==0)
               {
                   f=1;
               }
             
               if(f!=1)
               {
                   System.out.println(bi[i] +" not prime");
               }
               else{
                   System.out.println(bi[i]+"  is prime");
               }
               continue;
            }
         
        }*/


    }
}