package src1;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
String s1=new String();
String s =new String("CITY CHANDIGARH IS BEAUTIFUL");
for(int i=0;i<s1.length();i++)
{
	if(s1.charAt(i)=='a'||s1.charAt(i)=='i'||s1.charAt(i)=='e'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
	{
		count++;
		
	}
}
System.out.println("Vowels are"+""+count);
int a=0;
for(int i=s1.length()-1;i>=0;i--)
{
	a=a+s1.charAt(i);
	}
if(s1.equals(a))
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not a Palindrone");
}

}
	}


