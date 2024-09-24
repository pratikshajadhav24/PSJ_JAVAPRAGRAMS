import java.util.Scanner;
class Prime1{
public static void main(String[]args){
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of array:");
n=sc.nextInt();
System.out.println("Enter  the Element:");
int[] a=new int[10];
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Array is");
for(int i=0;i<n;i++)
{
if(a[i]%2==0){
System.out.println("Number is not prime:");
}
else{
System.out.println("Number is prime:");
}
}
}
}