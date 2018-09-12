package numberCalc;

public class CalculateFactorial {

	private  int  factNum;

	public int getFactNum() {
         
		return factNum;
	}

	public void setFactNum(int factNum) {
		this.factNum = factNum;
	}
	
	public int calcFact(int factNum)
	{
		 int result = 1;
		 
	        while(factNum != 0){
	            result = result*factNum;
	            factNum--;
	        }
	        return result;
	}
	
	
}
