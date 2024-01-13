import java.util.*;
public class gst{
    
    static public  void cgst (){
        
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("_____________________________");
            System.out.println("enter MRP");
            int mrp= ob.nextInt();
            System.out.println("enter discount");
            int dis=ob.nextInt();
      System.out.print("enter gst percentage");
            int gst= ob.nextInt();
            double disprice;
            double cgst;
            if (dis ==0)
            disprice=0;
            else
             disprice =mrp - ( mrp* dis/100.0);
            if(disprice ==0)
             cgst =  (mrp * gst/100.0);
             else
              cgst =  (disprice * gst/100.0);
            double tbill = mrp-disprice + cgst + cgst;
            System.out.println("_____________________________");
            System.out.println("MRP=" + mrp);
            System.out.println("discounted amount ="+disprice);
            System.out.println("gst amount ="+ (cgst + cgst));
            System.out.println("taotal bill inclusive of gst ="+ tbill);
            System.out.println("total savings ="+ disprice);
            System.out.println("_____________________________________________________");

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