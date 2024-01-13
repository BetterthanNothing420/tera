import java.util.*;
public class arp{
    
    static public  void ap (){
        System.out.println("_____________________________");
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("enter first term of AP");
            int a= ob.nextInt();
            System.out.println("enter number of terms");
            int n=ob.nextInt();
      System.out.print("enter the second term");
            int s= ob.nextInt();
            int d = s-a;
            System.out.println("sum of terms");
            int sum = n/2*(2*a +(n-1)*d);
            System.out.println(sum);
            System.out.println("ap form");
            int cu=a;
            for(int i=a;i<=n;i++)
            {              
            System.out.print(" "+ cu);
            cu=cu+d;
             }
   System.out.println();
   System.out.println("__________________________________________________________________________________________");
   System.out.println("press 1 to return");
            int q= ob.nextInt();
            if(q==1)
            arp.ret();
        }
    }
    public static void ret(){
        System.out.print('\u000C');
        ujw.ter();
    }
}