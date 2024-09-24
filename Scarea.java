import java.util.*;
class Scarea{
public static void main(String[]args){
double pi,r,Area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Value of pi  :");
pi=sc.nextDouble();
System.out.println("Enter the radius:");
r=sc.nextDouble();
Area=pi*r*r;
System.out.println("Area of circle is :"+Area);
}
}