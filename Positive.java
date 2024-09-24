import java.util.Scanner;
class Positive{
public static void main(String[]args){
int n;
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
if(a[i]>0){
System.out.println("Number is positive:");
}
else if(a[i]<0){
System.out.println("Number is negative:");
}
else{
System.out.println("Number is Zero:");
}
}
}
}
