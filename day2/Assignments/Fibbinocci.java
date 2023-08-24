package week1.day2.Assignments;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNum=0,secNum=1,sum=0;
		System.out.println(firstNum);
		for (int i=1;i<=11;i++)
		{
			sum=firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
			//System.out.println(sum);
		}
	}

}
