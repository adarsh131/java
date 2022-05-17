import java.io.*;
import java.util.*;
import java.util.Scanner;
class sortstr
{
   public static void main(String[] args)
   {
       String a,stemp;
       String t[]=new String[50];
       int i,m=0;
       int j;
       char d[]=new char[20];
        char c[]=new char[20];
        int k[]=new int[20];
       int n[]=new int[20];
       int temp,q;
       String arr[]=new String[50];
    Scanner b=new Scanner(System.in);
    /*System.out.println("enter string");
    a=b.nextLine();
    //int c=a.codePointAt(0);
    int strl=a.length();
    //System.out.println("1 char value: "+c);
    System.out.println("length: "+strl);
    for(i=0;i<strl;i++)
    {
       d[i]=a.charAt(i);
    }
     for(i=0;i<strl;i++)
    {
       k[i]=a.codePointAt(i);
    }
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
       System.out.println(d[i]);
    }
    for(i=0;i<strl;i++)
    {
       System.out.println(k[i]);
    }
      System.out.println("sort array");
    for(i=0;i<strl;i++)
    {
       for(j=0;j<strl;j++)
       {
         if(a.codePointAt(j)==k[i])
         {
            c[i]=a.charAt(j);
         }
       }
    }
       for(i=0;i<strl;i++)
    {
       System.out.println(c[i]);
    }*/
    
    System.out.println("enter the nameas wants to sort");
    for(i=0;i<5;i++)
    {
       t[i]=b.nextLine();
    }
    System.out.println("SORTED NAMES");
    for(i=0;i<5;i++)
    {
       for(j=i+1;j<5;j++)
       {
         if(t[i].codePointAt(0)>t[j].codePointAt(0))
         {
           stemp=t[i];
           t[i]=t[j];
           t[j]=stemp;
         }
       }
    }
     for(i=0;i<5;i++)
    {
      System.out.println(t[i]);
    }
    }
}
//m=a.codePointAt(i);
       //System.out.println(m);
      // m=0;
     // if(m>=65 && m<=90 || m>=97 && m<=122 ) 
     // {

     // }