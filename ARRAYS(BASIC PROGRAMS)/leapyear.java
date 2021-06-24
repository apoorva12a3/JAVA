import java.util.Scanner;
public class leapyear{
public static void main(String args[]){
int a;
Scanner sc = new Scanner(System.in);

a = sc.nextInt();
if(a%4 == 0 && a%100 != 0){
System.out.println("LEAP YEAR");}
else{
System.out.println("NOT A LEAP YEAR");}}}