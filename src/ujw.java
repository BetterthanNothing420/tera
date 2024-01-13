import java.util.*;
public class ujw{
     /**
     * @param args
     */
    public static void ter(){
       
         try (Scanner ob = new Scanner(System.in)) {
          System.out.println("enter 1 for ap");
              System.out.println("enter 2 for csa");
              System.out.println("enter 3 to gst");
              System.out.println("enter 4 to cipher");
              System.out.println("enter 5 to decipher");
              System.out.println("enter 99 for terminate");
              int ch= ob.nextInt();
              if(ch ==1)
              arp.ap();
              else if(ch ==2)
              solid.csa();
              else if(ch ==3)
              gst.cgst();
              else if(ch ==4)
              cipher.encrypt();
              else if(ch ==5)
              decipher.decrypt();
              else if (ch == 99){
                  System.out.print('\u000C');
              System.exit(0);
             }
     }
     }
}
