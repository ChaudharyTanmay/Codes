import java.util.*;
class crcj
{
  static String tobin(int num)
        {
            return Integer.toString(num,2);
        }
        static int todec(String bin)
        {
            return Integer.parseInt(bin,2);
        }
        public static void main(String[] args)
        {
           String s,s1,ss1,c1,gen,cw,rem2,codw;int l,p,p1,q,r,r1,rem1;String bit="";
            Scanner ob = new Scanner(System.in);
            System.out.println("enter the data string");
            s=ob.next();
            System.out.println("enter the data generator");
            gen=ob.next();
            l=gen.length();
            for (int i=0;i<l-1;i++)
            {
             bit+="0";
            }
            cw=s+bit;
            p=todec(cw);
            q=todec(gen);
            r=p%q;
            s1=tobin(r);
            System.out.println("remainder is"+s1);
            codw=s+s1;
            System.out.println("string received is"+codw);
            System.out.println("do you want to insert the error?y/n");
            char ch=ob.next().charAt(0);
            if(ch=='y')
            {
                System.out.println("enter the position u want to insert the error");
                r1=ob.nextInt();
                int l1=codw.length();
                if(codw.charAt(r1)=='1')
                {
                    c1="0";
                    ss1=codw.substring(0,r1)+c1+codw.substring(r1+1,l1);
                    System.out.println("String after inserting error is"+ss1);
                }
                else{
                    c1="1";
                    ss1=codw.substring(0,r1)+c1+codw.substring(r1+1,l1);
                    System.out.println("String after inserting error is"+ss1);
                }
                    p1=todec(ss1);
                    rem1=p1%q;
                    rem2=tobin(rem1);
                    System.out.println("remainder is"+rem2);
                    System.out.println("error is received");

                }
            
            else{
                System.out.println("remainder is 0");
                System.out.println("codeword is"+codw);
            }

        }
    }
