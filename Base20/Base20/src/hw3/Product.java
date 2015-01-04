package hw3;

public class Product {
	private int price;
	String code, storagePeriod;
	
	public Product() {
		code = "123";
		price = 10;
		storagePeriod = "till 2012";
	}
	
	 public void printPrice() {
		System.out.println(price);
	}
	 
	 public void printStoragePeriod() {
		System.out.println(storagePeriod);
	}
	 
	 public void printBarAndPrice() {
		System.out.println("Barcode: " + code + "; Price:" + price);
	}
}
