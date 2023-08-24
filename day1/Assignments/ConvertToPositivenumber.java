package week1.day1.Assignments;

public class ConvertToPositivenumber {
public static void convertToPositive(int n) {
	
	if(n<0)
	{
		n=n*(-1);
		System.out.println("n is converted to a positive number i.e " + n);
	}
}
	
	
	public static void main(String[] args) {
		convertToPositive(-78);
		
	}
}
