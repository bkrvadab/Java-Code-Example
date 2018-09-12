package numberCalc;
import java.util.Scanner;

import numberCalc.CalculateFactorial;
public class FindFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      int factRes = 0;
		      CalculateFactorial num = new CalculateFactorial();
		      num.setFactNum(getInputNumber());
		      factRes = num.calcFact(num.getFactNum());
		
		      //finding factorial of a number in Java using recursion - Example
		      System.out.println("Factorial of " + num.getFactNum() + " is: " + factRes);
		      
	  }	  
	public static int getInputNumber()
	{
		Scanner inpNum = new Scanner(System.in);
		System.out.print("Enter a Number for Factorial -");
		return(inpNum.nextInt());
		
	}
	}

		