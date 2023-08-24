package week1.day1.Assignments;

public class TwoWheeler {

	

	
		 public int noOfWheels =2;
		short noOfMirrors=32767;
		long chassisNumber = 233391831938l;
		
		boolean isPunctured =false;
		String bikeName = "Roller Coaster";
		double runningKM = 8989.2415;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheeler o1 = new TwoWheeler();
		
		
		System.out.println("No of wheels : " +o1.noOfWheels);
		System.out.println("No of mirrors : " + o1.noOfMirrors);
		System.out.println("Bike is Punctured : " + o1.isPunctured);
		System.out.println("Name of the Bike is : " + o1.bikeName);
		System.out.println("No of KM it travelled so far : " + o1.runningKM);
		
	}

}
