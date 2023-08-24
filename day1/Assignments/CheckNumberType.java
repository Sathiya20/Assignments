package week1.day1.Assignments;

public class CheckNumberType {

	public static void checkNumberType(int n)
	{
		if(n<0)
		{
			System.out.println(n +" is a negative number");
		}
		else if(n>0)
		{
			System.out.println(n +" is a posiive number");
		}
		else
		{
			System.out.println(n +" is neither positive nor a negative number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumberType(-24);
		checkNumberType(24);
		checkNumberType(0);
	}

}
