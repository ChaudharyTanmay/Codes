import java.util.*;
class bytest
{
    public static void main(String[] args)
    {
    Scanner ob=new Scanner(System.in);
    String s,s1,flag,p,st;
    System.out.println("enter the string");
    s=ob.next();
    System.out.println("enter flag character");
    flag=ob.next();
    System.out.println("enter stuffed character");
    st=ob.next();
    p=st+flag;
    s1=s.replaceAll(p,flag);
    System.out.println(s1);

}}