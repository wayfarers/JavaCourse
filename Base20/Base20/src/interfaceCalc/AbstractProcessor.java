package interfaceCalc;

public abstract class AbstractProcessor implements Processorable {
	 private int result;
	 private int temp; 
	 
	 @Override
	 public void printResult() {
	  System.out.println("Result = " + result);
	 }
	 
	 public void setResult(int r) {
		result = r;
	}
	 
	 public int getResult() {
		return result;
	}
	 
	 public void setTemp(int tmp) {
		temp = tmp;
	}
	 
	 public int getTemp() {
		return temp;
	}
}
