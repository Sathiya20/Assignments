package week1.day2.Assignments;

public class IsPrime {
public static void main(String arg[])
{
	int num=10;
	for(int i=2;i<=num;i++)
	{
		boolean isPrime=true;
		for (int j=2;j<=i/2;j++) {
			if(i%j==0)
			{
				isPrime=false;
				break;
				//System.out.println(i+"is not prime");
			}
		}
		if(isPrime)
		{
			System.out.println(i+" is a prime number");
		}
		else {
			System.out.println(i+" is not a prime number");
		}
	}
}
}
