import java.util.Scanner;
public class remquo{
public static void main(String args[]){
int a,b,r,q;
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
r = a%b;
q = a/b;
System.out.println(r);
System.out.println(q);}}