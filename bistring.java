import  java.util.*;
class bistring
{
    public static void main(String[] args)
    {
        String s,s1,s2;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        s=ob.next();
        s1=s.replaceAll("011111","0111110");
        System.out.println("Stuffed data"+s1);
        s2=s1.replaceAll("0111110","0111111");
        System.out.println("Destuffed data"+s2);
    }
}