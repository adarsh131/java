import java.io.*;
import java.util.*;
import java.util.Scanner;
class cpu1
{
    
int price=12000;
class processor
{
    int ncore=8;
    String mname="intel";
    void display()
    {
        System.out.println("Manufacture name:" + mname);
        System.out.println("Number of cores:" + ncore);
    }
}
 static class ram
{
    int msize=32;
    String rmname="adata";
    void display1()
    {
        System.out.println("Ram");
        System.out.println("Ram size:" + msize);
        System.out.println("Manufacture name:" + rmname);
    }
}

}
public class cpu
{
    public static void main(String[] args)
    {
        System.out.println("system details");
        cpu1 ob1=new cpu1();
        cpu1.processor ob2=ob1.new processor();
        cpu1.ram ob3=new cpu1.ram();
        ob2.display();
       
        System.out.println("processor price: "+ ob1.price  );
         ob3.display1();
    }
}