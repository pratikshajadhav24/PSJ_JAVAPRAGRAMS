import java.util.Scanner;
class Vowles{
public static void main(String[]args){
char vowles;
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the character");
vowles=sc.next().charAt(0);
if(vowles=='a'||vowles=='e'||vowles=='i'||vowles=='o'||vowles=='u')
System.out.println("It is a vowel");
else
System.out.println("it is not vowel");
}
}