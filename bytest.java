import java.util.*;
class bytest
{
    public static void main(String[] args)
    {
    Scanner ob=new Scanner(System.in);
    String s,s1,flag,p,st,s2,s3,q;
    System.out.println("enter the string");
    s=ob.next();
    System.out.println("enter flag character");
    flag=ob.next();
    System.out.println("enter stuffed character");
    st=ob.next();
    p=st+flag;
    q=st+st;
    s1=s.replaceAll(st,q);
    s3=s1.replaceAll(flag,p);
    System.out.println("Stuffed string is---->"+flag+s3+flag);
    s2=s1.replaceAll(q,st);
    s3=s2.replaceAll(p,flag);
    System.out.println("destuffed string is---->"+s2);

}}