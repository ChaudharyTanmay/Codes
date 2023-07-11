import  java.util.*;
class bistring
{
    public static void main(String[] args)
    {
        String s,s1;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter the string");
        s=ob.next();
        s1=s.replaceAll("011111","0111110");
        System.out.println(s1);
    }
}