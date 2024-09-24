import java.util.Scanner;
class Stringcases{
public static void main(String[]args){
String S1="Pratiksha";
String S2="JADHAV";
S1=S1.concat("Jadhav");

System.out.println(S1);
System.out.println("String Concat is :"+S1);

System.out.println("String Length is :"+S1.length());

String S1upper=S1.toUpperCase();
System.out.println(S1upper);

String S2lower=S2.toLowerCase();
System.out.println(S2lower);

String S3=S1.replace("P","J");
System.out.println(S3);

System.out.println(S3+"Democlass"+S3);
System.out.println(S2.Trim()+"Democlass");
}
}


