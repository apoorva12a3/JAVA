import java.util.Scanner;
public class compoundintrest{
public static void main(String args[]){
int p,n,t,r;
Scanner sc = new Scanner(System.in);
p = sc.nextInt();
n = sc.nextInt();
t = sc.nextInt();
r = sc.nextInt();
int y,x,z;
x = n*t;
y = 1+(r/n);
z = p*y;

System.out.println(Math.pow(z,y));}}
