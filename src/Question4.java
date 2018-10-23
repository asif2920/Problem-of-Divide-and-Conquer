import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the value of Base:");
		int a=sc.nextInt();
		System.out.println("Please enter the value of exponent:");
		int b=sc.nextInt();
		System.out.println("Please enter the value of third integer:");
		int m=sc.nextInt();
	int x= modularExponentiation(a,b,m);
	System.out.println("Result is: "+x);

	}
/**
 * Using recursive algorithm, it solves the problem of modular exponent.
 * if the exponent value is 0 or 1, this will give the base case
 * basevalue is calulculated by the modulus operation with the number.
 * if the exponent is even, it is divied by 2 and the base value is multiplied 
 * with the modulus of the base number
 * if the exponent is odd, base value is multiplied with the recursive call of the method
 * in the recursive call
 * @param baseValue
 * @param exponentValue
 * @param number
 * @return
 */
	private static int modularExponentiation(int baseValue, int exponentValue, int number) {
		baseValue = baseValue%number;

		 if (exponentValue == 0)
		 return 1;

		 else if (exponentValue == 1)
		 return baseValue;

		 else if (exponentValue%2 == 0)
		 return modularExponentiation(baseValue*baseValue%number, exponentValue/2, number);

		 else
		 return baseValue*modularExponentiation(baseValue, exponentValue-1, number)%number; 
	
	}

}
