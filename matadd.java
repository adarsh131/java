import java.io.*;
import java.util.*;
import java.util.Scanner;
class matadd
{
    public static void main(String[] args)
    {
        int i,j,n;
        int a[][]=new int[50][50];
        int c[][]=new int[50][50];
        int s[][]=new int[50][50];
        Scanner b=new Scanner(System.in);
        System.out.println("MATRIX  MATRIX MATRIX");
        System.out.println("enter the size:(2*2),(3*3)");
         n=b.nextInt();
         System.out.println("enter the elements of matrix 1");
         for(i=0;i<n;i++)
         {
             for(j=0;j<n;j++)
             {
                 a[i][j]=b.nextInt();
             }
         }
          System.out.println("enter the elements of matrix 2");
         for(i=0;i<n;i++)
         {
             for(j=0;j<n;j++)
             {
                 c[i][j]=b.nextInt();
             }
         }
        System.out.println("matrix1");
         System.out.println("");
         for(i=0;i<n;i++)
         {
             System.out.println(" ");
             for(j=0;j<n;j++)
             {
                 System.out.print("  ");
                 System.out.print( a[i][j]);
               
             }
         }
         System.out.println("");
         System.out.println("matrix2");
         System.out.println("");
         for(i=0;i<n;i++)
         {
             System.out.println(" ");
             for(j=0;j<n;j++)
             {
                 System.out.print("  ");
                 System.out.print( c[i][j]);
               
             }
         }
         System.out.println("");
         System.out.println("SUM OF MATRIX 1 && MATRIX 2");
         for(i=0;i<n;i++)
         {
             
             for(j=0;j<n;j++)
             {
                 
                s[i][j]=a[i][j]+ c[i][j];
               
             }
         }
         for(i=0;i<n;i++)
         {
             System.out.println(" ");
             for(j=0;j<n;j++)
             {
                 System.out.print("  ");
                 System.out.print( s[i][j]);
               
             }
         }

    }
}