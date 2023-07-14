


import java.util.Random;
import java.util.Scanner;

class Sele {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
 int p;
 String s;
 int n, w, i = 1, tt = 0;
 System.out.println("2060487");
System.out.println("Enter the Dataword: ");
s = sc.next();
p = s.length();
System.out.println("Enter the Window size: ");
 w = sc.nextInt();
 char[] v = s.toCharArray();
 int[] f = new int[100];
 while (i <= p) {
int z = 0;
 for (int k = i; k < i + w && k <= p; k++) {
System.out.println("Sending Frame " + k + "...");
tt++;
 }
 for (int k = i; k < i + w && k <= p; k++) {
 System.out.println("Enter Acknowledgement for frame" + k + " : ");
 f[k] = sc.nextInt();
 }
 for (int k = i; k < i + w && k <= p; k++) {
if (f[k] != 0) {
} else {
System.out.println("Frame : " + v[k - 1] + " Not Received");
 System.out.println("Retransmitting frame" + (k) + "...");

 }
 }

 System.out.println("");
i = i + z;
 }

 System.out.println("Quiting!!!");
 }
}