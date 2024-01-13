import java.util.*;
public class decipher{
    
    static public  void decrypt ()
    {  
    try (Scanner ob = new Scanner(System.in)) {
        System.out.println("_____________________________");
            System.out.println("enter a satement");
            String str = ob.nextLine();
            String nstr = "";
            char ch;int i;
            str=str.toUpperCase();
            for(i=0;i<= str.length()-1;i++)
            {
                ch= str.charAt(i);
                if(ch=='@')
                nstr+= "A";
                else if (ch== '!')
                nstr+= "E";
                else if (ch== '#')
                nstr+= "I";
                else if (ch== '*')
                nstr+= "O";
                else if (ch== '^')
                nstr+= "U";
                else if (ch== '?')
                nstr+= " ";
                else if (ch== '}')
                nstr+= "K";
                else if (ch== '{')
                nstr+= "S";
                else if (ch== '+')
                nstr+= "D";
                else if (ch== ']')
                nstr+= "I";
                else if (ch== '`')
                nstr+= "C";
                else if (ch== '~')
                nstr+= "B";
                else if (ch== '|')
                nstr+= "Y";
                
                /////////////
                else if (ch== '<')
                nstr+= "1";
                else if (ch== '>')
                nstr+= "2";
                else if (ch== '/')
                nstr+= "4";
                else if (ch== '-')
                nstr+= "5";
                else if (ch== '%')
                nstr+= "9";
                else if (ch== ':')
                nstr+= "7";
                else if (ch== '&')
                nstr+= "0";
                else
                nstr+= ch;
            }
            System.out.println(nstr);
            System.out.println("______________________________________");
            
        System.out.println("press 1 to return");
        System.out.println("press 2 to cipher a text");
            int q= ob.nextInt();
            if(q==1)
            arp.ret();
            else if(q==2)
            cipher.encrypt();
    }
    }
    
    public static void ret(){
        System.out.print('\u000C');
        ujw.ter();
    }
}