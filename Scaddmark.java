import java.util.Scanner;
class Scaddmark{
public static void main(String[]args){
int physics,chemistry,math,bio,marathi; 
int sum;
float percentage;
Scanner sc=new Scanner(System.in);
System.out.println("Enter marks of student:");
System.out.println("Enter physics marks :");
physics=sc.nextInt();
System.out.println("Enter chemistry marks :");
chemistry=sc.nextInt();
System.out.println("Enter math marks :");
math=sc.nextInt();
System.out.println("Enter bio marks :");
bio=sc.nextInt();
System.out.println("Enter marathi marks :");
marathi=sc.nextInt();
sum=physics+chemistry+math+bio+marathi;
System.out.println("Total marks  :- "+sum);
percentage=(sum/5.0f);
System.out.println("Percentages  :- "+percentage+" %");

if (percentage >= 90)
 {
   System.out.println("Grade: A+");
 } 
   else if (percentage >= 80) 
{
   System.out.println("Grade: A");
} 
   else if (percentage >= 70)
{
   System.out.println("Grade: B+");
}  
   else if (percentage >= 60) 
{
   System.out.println("Grade: B");
}  
   else if (percentage >= 50) 
{
   System.out.println("Grade: C");
}  
   else if (percentage >= 40)
{
   System.out.println("Grade: D");
} 
   else
{
   System.out.println("Grade: Fail");
}
  if (!(percentage>=35&&percentage<=100))
{
  System.out.println("fail");
} 
   else
{
   System.out.println("pass");
}

}
}