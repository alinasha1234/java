import java.util.*;
import java.io.*;
import java.lang.*;
class num
{
    public static void main(String aa[])
    {
        Random r=new Random();
        int a=r.nextInt(6);
        for(int i=1;i<=5;i++)
        {
                
               Scanner scan=new Scanner(System.in);
               System.out.println("enter number:");
               int b=scan.nextInt();
               if(a==b)
               {
                 System.out.println("WIN");
               }
               else
                  System.out.println("sorry its wrong!");

        }
    }
}