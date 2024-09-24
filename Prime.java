import java.util.Scanner;
class Prime{
public static void main(String[]args){
int n,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size:");
n=sc.nextInt();
System.out.println("Enter Element:");
int[] a=new int[10];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Array is");
for(int i=0;i<n;i++)
{
System.out.println(a[i]);
if(a[i]==2){
System.out.println("Number is prime":);
}
else{
System.out.println("Number is not prime":);
}
}
}
