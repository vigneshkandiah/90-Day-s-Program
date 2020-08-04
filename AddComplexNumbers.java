package java_Programs;

public class AddComplexNumbers {
	
	public static void main(String[] args) {
		String number1[]= "6+2i".split("[\\Q+-\\Ei]");
		String number2[]="7+3i".split("[\\Q+-\\Ei]");
		
		int sumOfReal=0;
		
		int sumofImaginary=0;
		
		sumOfReal=Integer.parseInt(number1[0])+Integer.parseInt(number2[0]);
		
		sumofImaginary=Integer.parseInt(number1[1])+Integer.parseInt(number2[1]);
		
		System.out.println(sumOfReal+"+"+sumofImaginary+"i");
		
	
		
	}
	
	
	

}
