package src1;
import java.util.Scanner;
public class SmallestElementInArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int small,i,size;
int arr[]=new int[50];
Scanner scan=new Scanner (System.in);
System.out.print("enter array size");
size=scan.nextInt();
System.out.print("Searchingfor the smallest element");
small=arr[0];
for(i=0;i<size;i++){
	if(small>arr[i])
	{
		small=arr[i];
	}
}
System.out.print("smallest element="+small);

	}

}
