import java.util.*;
class Student{
int rollno;
String Name;
String collage;
Student( int r,String n,String c){
this.rollno=r;
this.Name=n;
this.collage=c;
}
void display(){
System.out.println(rollno+""+Name+""+collage);
}
}
public class Name11{
public static void main(String[]args){
Student S1=new Student(111,"Pratiksha","BJS");
Student S2=new Student(112,"Varsha","BJS");
S1.display();
S2.display();
}
}