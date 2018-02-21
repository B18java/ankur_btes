package src1;
import java.util.Scanner;
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rollno,math,eng,sci;
String name;
String grade;
double eng_marks,math_marks,sci_marks,total_marks;
float average;
Scanner s=new Scanner(System.in);
for(int i=1;i<=5;i++)
{
System.out.print("Enter Roll No");
 int roll=s.nextInt();
System.out.print("Enter name of student");
name=s.next();
System.out.print("Enter grade");
grade=s.next();
System.out.println("Enter the marks in eng,math,sci");
math=s.nextInt();
eng=s.nextInt();
sci=s.nextInt();
int total=math+eng+sci;
float average1=total/3;
float percentage=(float)total/300*100;
System.out.println("Roll number"+roll+"\tName"+name);
System.out.println("marks(maths,sci,eng)"+math+","+sci+","+eng);
System.out.println("Total" +total+"\tPercentage"+percentage);
}
	}
}
