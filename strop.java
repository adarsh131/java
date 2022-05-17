import java.io.*;
import java.util.*;
import java.util.Scanner;
class strop
{
    public static void main(String[] args)
    {
       int k[]=new int[20];
       int n[]=new int[20];
       int temp,q,i,j,strl=5;
    Scanner b=new Scanner(System.in);
    System.out.println("enter array");
     for(i=0;i<strl;i++)
    {
      k[i]=b.nextInt();
    }
    System.out.println("sort array");
    for(i=0;i<strl;i++)
    {
       for(j=i+1;j<strl;j++)
       {
         if(k[i]>k[j])
         {
            temp=k[i];
            k[i]=k[j];
            k[j]=temp;
         }
       }
    }
    for(i=0;i<strl;i++)
    {
       System.out.println(k[i]);
    }

    }
}