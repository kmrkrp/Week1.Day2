package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnMethods lm = new LearnMethods();
		lm.printCarName();
		int registrationNumber = lm.getRegistrationNumber();
		String carVariant = lm.getCarVariant();
		int multiplyTwoNumbers = lm.multiplyTwoNumbers(5, 250);		
		System.out.println("registrationNumber :"+registrationNumber);
		System.out.println("carVariant :"+carVariant);
		System.out.println("multiplicationResult :"+multiplyTwoNumbers);
	}	
	public void printCarName()
	{
		System.out.println("Car Name is: SWIFT");
	}
	public int getRegistrationNumber()
	{
		int registrationumber = 5676;
		return registrationumber;
	}
	public String getCarVariant()
	{
		String carVariant = "DIESEL";
		return carVariant;
	}
	public int multiplyTwoNumbers(int a, int b)
	{
		int result = a*b;
		return result;
	}

}
