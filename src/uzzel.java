import java.util.*;
public class uzzel 
    {
    static public  void play ()
    {  
            boolean a=false ;
            boolean b=false ;
            boolean c=false ;
            boolean d=false ;
            boolean e=false ;
            boolean f=false ;
            int num =0;
           try (Scanner ob = new Scanner(System.in)) {
            System.out.println("_____________________________");
            int o =0;
            System.out.println("keep a number from 1 to 63");
            
            System.out.println("is your number is in this list ?");
            System.out.println("1,3,7,9,11,13,15,17,19,21,23,25,27,\n 29,31,33,35,39,41,43,45,47,49,51,53,55,57,59,61,63");
            System.out.println("1 yes... 2 no");
            System.out.println("_____________________________");
             o= ob.nextInt();
            if (o==1)
            a=true;
            else if(o==2)
            a=false;
            o=0;
            System.out.println("is your number is in this list ?");
            System.out.println("2,3,6,7,10,11,14,15,18,19,22,23,26,27,30,31,34,35,38,39,42,43,46,47,50,51,54,55,58,59,62,63");
            System.out.println("1 yes... 2 no");
            System.out.println("_____________________________");
             o= ob.nextInt();
            if (o==1)
            b=true;
            else if(o==2)
            b=false;
            o=0;
            System.out.println("is your number is in this list ?");
            System.out.println("4,5,6,7,12,13,15,20,21,22,23,28,29,30,31,36,37,38,39,44,45,46,47,52,53,54,60,61,62,63");
            System.out.println("1 yes... 2 no");
            System.out.println("_____________________________");
             o= ob.nextInt();
            if (o==1)
            c=true;
            else if(o==2)
            c=false;
            o=0;
            System.out.println("is your number is in this list ?");
            System.out.println("8,9,10,11,12,13,14,15,24,25,26,27,28,29,30,31,40,41,42,43,45,46,47,56,57,58,59,60,61,62,63");
            System.out.println("1 yes... 2 no");
            System.out.println("_____________________________");
             o= ob.nextInt();
            if (o==1)
            d=true;
            else if(o==2)
            d=false;
            o=0;
            System.out.println("is your number is in this list ?");
            System.out.println("16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,48,49,50,51,52,53,54,55,56,58,57,58,59,60,61,62,63");
            System.out.println("1 yes... 2 no");
            System.out.println("_____________________________");
             o= ob.nextInt();
            if (o==1)
            e=true;
            else if(o==2)
            e=false;
            o=0;
            System.out.println("is your number is in this list ?");
            System.out.println("32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63");
            System.out.println("1 yes... 2 no");
            System.out.println("_____________________________");
             o= ob.nextInt();
            if (o==1)
            f=true;
            else if(o==2)
            f=false;
            o=0;
            //checking
            if(a)
            num+=1;
            if(b)
            num+=2;
            if(c)
            num+=4;
            if(d)
            num+=8;
            if(e)
            num+=16;
            if(f)
            num+=32;
            System.out.println("_____________________________");

            System.out.println("your number is "+ num);





            System.out.println("_____________________________");
            
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
