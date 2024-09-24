import java.util.*;
class Per{
public static void main(String[]args){
double a,b,c,d,e,sum;
double per;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value a");
a=sc.nextDouble();
System.out.println("enter a value b");
b=sc.nextDouble();
System.out.println("enter a value c");
c=sc.nextDouble();
System.out.println("enter a value d");
d=sc.nextDouble();
System.out.println("enter a value e");
e=sc.nextDouble();
sum=a+b+c+d+e;
System.out.println("addition is"+sum);
per=(sum/5)*100;
System.out.println("percentage is"+per);
}
}


