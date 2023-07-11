import java.util.*;
class crcj
{
  static String tobin(int num)
        {
            return Interger.toString(num,2);
        }
        static int todec(String num)
        {
            return Integer.parseInt(num,2);
        }
        public static void main(String[] args)
        {
           String s,s1,gen,cw,codw;int l,p,q,r;String bin=" ";
            Scanner ob = new Scanner(System.in);
            System.out.println("enter the data string");
            s=ob.next();
            System.out.println("enter the data generator");
            gen=ob.next();
            l=gen.length();
            for (int i=0;i<l-1;i++)
            {
             bin=bin+0;
            }
            cw=s+bin;
            p=todec(cw);
            q=todec(gen);
            r=p%q;
            s1=tobin(r);
            codw=s+s1;
            System.out.println(codw);

        }
    }
