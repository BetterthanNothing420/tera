import java.util.*;
public class solid {
    
    static public  void csa ()
    {  
    try (Scanner ob = new Scanner(System.in)) {
        System.out.println("_____________________________");
            System.out.println("enter a");
            int a = ob.nextInt();
            double vol , csa ,tsa, dia;
            vol = a*a*a;
            csa= 4*(a*a);
            tsa = 6*(a*a);
            dia= Math.sqrt(3)*a;
            System.out.println("vol="+vol);
            System.out.println("csa="+ csa);
            System.out.println("tsa="+tsa);
            System.out.println("diagonal="+dia);
            System.out.println("______________________________________");
            
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