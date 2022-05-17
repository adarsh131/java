import java.io.*;
import java.util.*;
import java.util.Scanner;
class empl
{
    int eno,s;
    String name;
     void et()
    {
        Scanner b=new Scanner(System.in);
       System.out.println("enter employe name");
        name=b.nextLine();
        System.out.println("enter employe number");
        eno=b.nextInt();
         System.out.println("enter salary");
        s=b.nextInt();
    }
    public void dis()
    {
        System.out.println("employe name:"+name); 
         System.out.println("employe number: "+eno);
          System.out.println("salary:"+s);
    }
}
class Emp
{
public static void main(String[] args)
{ 
    Scanner c=new Scanner(System.in);
     int n,i=0;
     System.out.println("enter number of employees");
     n=c.nextInt();
     empl d[]=new empl[5];
     System.out.println("");
     System.out.println("-------------------------------------------------------------------------------------------------------");
     System.out.println("ENTER    EMPLOYEE       DETAILS");
     System.out.println("--------------------------------------------------------------------------------------------------------");
    // d[0].get();
     for(i=0;i<d.length;i++)
     // System.out.println(i+"  EMPLOYEE--------------------------------------------------------------------------------------------------------");
         {
             d[i].et();
         }
     //System.out.println("--------------------------------------------------------------------------------------------------------");
     
/*System.out.println("");
     System.out.println("-------------------------------------------------------------------------------------------------------");
     System.out.println("   EMPLOYEE       DETAILS");
     System.out.println("--------------------------------------------------------------------------------------------------------");
     for(i=1;i<=n;i++)
     {
      System.out.println(i+"  EMPLOYEE------------------------------------------------------------------------------");
         d[i].dis();
     System.out.println("--------------------------------------------------------------------------------------------------------");
     }*/
}
}