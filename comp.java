import java.io.*;
import java.util.*;
import java.util.Scanner;
class comp1
{
   int r,i;
   Scanner c=new Scanner(System.in);
   public void get()
   {
      System.out.println("Enter the real part of complex no");
       r=c.nextInt();
       System.out.println("Enter the imaginary part of complex no");
       i=c.nextInt();
   } 
   public void display()
   {
       
System.out.println(r+" + "+i+"i");

   }
  
}


class comp
{
    public static void main(String[] args)
    {
        int r2,i2;
        /*int r,i,r1,i1,r2,i2;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the real part of complex no");
    r=c.nextInt();
System.out.println("Enter the imaginary part of 1 complex no");
 i=c.nextInt();
  System.out.println("Enter the real part of 2 complex no");
    r1=c.nextInt();
System.out.println("Enter the imaginary part of 2 complex no");
 i1=c.nextInt();
System.out.println("the complex no are");
System.out.println(r+" + "+i+"i");
System.out.println(r1+" + "+i1+"i");
 System.out.println("addition");
    r2=r1+r;
    i2=i1+i;
   System.out.println(r2+" + "+i2+"i");*/
comp1 ob1=new comp1();
comp1 ob2=new comp1();
System.out.println("complex no 1");
ob1.get();
System.out.println(" complex no 2");
ob2.get();
System.out.println("complex numbers are");
ob1.display();
ob2.display();
System.out.println("Sum of comples numbers ");
    r2=ob1.r+ob2.r;
    i2=ob1.i+ob2.i;
   System.out.println(r2+" + "+i2+"i");

    }
}