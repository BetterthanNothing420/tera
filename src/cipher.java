import java.util.*;
public class cipher{
    
    static public  void encrypt ()
    {  
    try (Scanner ob = new Scanner(System.in)) {
        System.out.println("_____________________________");
            System.out.println("enter a satement");
            String st = ob.nextLine();
            String nst = "";
            char ch;int i;
            st=st.toUpperCase();
            for(i=0;i<= st.length()-1;i++)
            {
                ch= st.charAt(i);
                if(ch=='A')
                nst+= "@";
                else if (ch== 'E')
                nst+= "!";
                else if (ch== 'I')
                nst+= "#";
                else if (ch== 'O')
                nst+= "*";
                else if (ch== 'U')
                nst+= "^";
                else if (ch== ' ')
                nst+= "?";
                else if (ch== 'K')
                nst+= "}";
                else if (ch== 'S')
                nst+= "{";
                else if (ch== 'D')
                nst+= "+";
                else if (ch== 'I')
                nst+= "]";
                else if (ch== 'C')
                nst+= "`";
                else if (ch== 'B')
                nst+= "~";
                /////////
                else if (ch== '1')
                nst+= "<";
                else if (ch== '2')
                nst+= ">";
                else if (ch== '4')
                nst+= "/";
                else if (ch== '5')
                nst+= "-";
                else if (ch== '9')
                nst+= "%";
                else if (ch== '7')
                nst+= ":";
                else if (ch== '0')
                nst+= "&";
                else
                nst+= ch;
            }
            System.out.println(nst);
            System.out.println("______________________________________");
            
        System.out.println("press 1 to return");
        System.out.println("press 2 to decipher");
            int q= ob.nextInt();
            if(q==1)
            arp.ret();
            else if(q==2)
            decipher.decrypt();
    }
    }
    
    public static void ret(){
        System.out.print('\u000C');
        ujw.ter();
    }
}