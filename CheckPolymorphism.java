package polymorphismExample;
import polymorphismExample.NumOperation;
import polymorphismExample.NumOperation2;

public class CheckPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int num1 = 5;
     int num2 = 10;
     NumOperation opr1 = new NumOperation();
     NumOperation opr2 = new NumOperation2();
     System.out.println("Addition of 5 and 10 is : " + opr1.numCalc(num1, num2));
     System.out.println("Multiplication of 5 and 10 is : " + opr2.numCalc(num1, num2));	
		
	}

}
