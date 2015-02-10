package interfaceCalc;

public abstract class AbstractProcessor implements Processorable {
	 private long result;
	 private long temp; 
	 
	 @Override
	 public void printResult() {
	  System.out.println("Result = " + result);
	 }
	 
	 public void setResult(long r) {
		result = r;
	}
	 
	 public long getResult() {
		return result;
	}
	 
	 public void setTemp(long tmp) {
		temp = tmp;
	}
	 
	 public long getTemp() {
		return temp;
	}
}
