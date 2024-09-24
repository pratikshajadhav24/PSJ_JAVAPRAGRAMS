import java.util.Scanner;
class Sumnumber {
public static void main(String[] args) {
int num; 
int sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter 20 numbers:");
//int num; 
//int sum=0;
//System.out.println("Enter 20 numbers:");
num=sc.nextInt();
while (num<=20) {
sum=sum+num;
num++;
//num=sc.nextInt();
}
System.out.println(+sum);
}
}