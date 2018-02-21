package src1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Employe {
int emp_id;
java.lang.String emp_name;
float salary;
int emp_address;
int Mob_no;
int emp_designation;
final static java.lang.String company="Bebo";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Scanner s=new Scanner(System.in);




private void Employe()
{
	System.out.println("Enter id");
	emp_id=s.nextInt();
	System.out.println("Enter Name");
	emp_name=s.next();
	System.out.println("Enter salary");
	salary=s.nextFloat();
	System.out.println("Enter Address");
	emp_address=s.nextInt();
	System.out.println("Enter mobile no");
	Mob_no=s.nextInt();
	System.out.println("Enter designation");
	emp_designation=s.nextInt();
}
void display()
{
	System.out.println(emp_id);
	System.out.println(emp_name);
	System.out.println(Employee.company);
	System.out.println(Mob_no);
}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
Employe e1=new Employe();
Employe e2=new Employe();
Employe e3=new Employe();
System.out.println("Enter the emp_id to update");
int id=s1.nextInt();
if(id==e1.emp_id)
	e1.employeUpdate(e1);
else if(id==e2.emp_id)
	e2.employeUpdate(e2);
else
	e3.employeUpdate(e3);
System.out.println(Employe.company);
e1.display();
e2.display();
e3.display();
	}
	
	
	
	void employeUpdate(Employe e)throws IOException
	{
		char choice='n';
		do
		{
			System.out.println("Enter yur choice for updation\n 1.mobile number\n 2.Name");
			int ch=Integer.parseInt(br.readLine());
			switch(ch)
			{
			case 1:
				System.out.println("enter new mobile number");
			java.lang.String mob_no;	
				e.Mob_no =s.nextInt();
				break;
			case 2:
				System.out.println("enter new designation");
				e.emp_designation=s.nextInt();
				break;
			}
			System.out.println("Any more updations Y/N");
			choice=s.next().charAt(0);
		}
		while( choice=='Y');
	}

				
			
		
	}


