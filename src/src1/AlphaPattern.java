package src1;
public class AlphaPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y,k;
for(int i=1;i<=3;i++)
{
	x=97;
	for(int j=3;j>i;j--)
	{
		System.out.print("");
	}
	for(k=1;k<=i;k++)
	{
		System.out.print((char)x);
		x++;
	}
	y=x-2;
	for(k=1;k<i;k++)
	{
		System.out.print((char)y);
		y--;
	}
	System.out.println();
}
	for(int i=2;i>=1;i--)
	{
		x=97;
		for(int j=2;j>=i;j--)
		{
			System.out.print("");
			
		}
		for(k=i;k>=1;k--)
		{
			System.out.print((char)x);
			x++;
		}
		y=x-2;
		for(k=1;k>i;k--)
		{
			System.out.print((char)y);
			y--;
		}
		System.out.println();
	}
	}
}
