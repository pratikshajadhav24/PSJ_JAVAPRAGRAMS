import java.util.Scanner;
class String2{
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
sum=sum+a[i];
}
System.out.println("addition is"+sum);
}
}

