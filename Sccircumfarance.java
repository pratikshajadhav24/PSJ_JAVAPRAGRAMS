import java.util.*;
class Sccircumfarance{
public static void main(String[]args){
Double pi,r,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter pi value:");
pi=sc.nextDouble();
System.out.println("Enter the radius");
r=sc.nextDouble();
c=2*pi*r;
System.out.println("Circumferance is :"+c);
}
}