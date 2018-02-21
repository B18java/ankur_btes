package src1;
public class Employee {
	int id;
	String name;
	final static String company="Bebo";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee();
e1.id=1;
e1.name="Ankur Choudhary";
System.out.println(e1.id);
System.out.println(e1.name);
System.out.println(Employee.company);
Employee e2=new Employee();
e2.id=2;
e2.name="Deepa Saini";
System.out.println(e2.id);
System.out.println(e2.name);
System.out.println(Employee.company);
Employee e3=new Employee();
e3.id=3;
e3.name="Zaroon";
System.out.println(e3.id);
System.out.println(e3.name);
System.out.println(Employee.company);
	}

}
