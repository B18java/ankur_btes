package src1;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j,k,count;
for(i=1;i<=7;i++)
{
	count=1;
	for(k=1;k<=i*2;k++)
	{
	boolean isPrime=true;
	for(j=2;j<k;j++)
	{
		if(k%j==0)
		{
			isPrime=false;
			break;
		}
	}
	if((isPrime==true)&& count<=i)
	{
		System.out.print(k);
		count++;
	}
	}
	System.out.println();
	
		}
	}
	

	}


