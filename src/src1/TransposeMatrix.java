package src1;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m,n,i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number of rows and colums of matrix");
m=s.nextInt();
n=s.nextInt();
int matrix[][]=new int[m][n];
System.out.println("Enter the elements of matrix");
for(i=0;i<m;i++)
	for(j=0;j<n;j++)
		matrix[i][j]=s.nextInt();
int transpose[][]=new int[m][n];
for(i=0;i<m;i++)
{
	for(j=0;j<n;j++)
		transpose[i][j]=matrix[i][j];
}
System.out.println("Transpose of entered matrix");
for(i=0;i<n;i++)
{
	for(j=0;j<m;j++)
		System.out.println(transpose[i][j]+"\t");
	System.out.println("\n");
		
}
	}

}
