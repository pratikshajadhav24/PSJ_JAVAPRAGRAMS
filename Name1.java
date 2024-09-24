import java.util.*;
class Student{
int rollno;
String Name;
static String collage="BJS";
Student( int r,String n){
rollno=r;
Name=n;
}
void display(){
System.out.println(rollno+""+Name+""+collage);
}
}
public class Name1{
public static void main(String[]args){
Student S1=new Student(111,"Pratiksha");
Student S2=new Student(112,"Varsha");
S1.display();
S2.display();
}
}