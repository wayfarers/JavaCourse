package week2.lesson3;

public class Phone {
	private String myNumber;
	private static String[] numbers = new String[10];

	private Phone() {
		
	}
	
	public static Phone createPhone(String num) {
		Phone phone = new Phone();
		if (isNumberExist(num)) {
			System.out.println("Такой номер уже есть в базе");
		} 
		else {
			for(int i = 0; i < 10; i++) {
				if (numbers[i] == null) {
					numbers[i] = num;
					break;
				}
				else if (i == 9) {
					System.out.println("Phonebase is full, number won't be added.");
					return null;
				}
			}
		}
		phone.myNumber = num;
		return phone;
	}

	public static String[] getNumbers() {
		return numbers;
	}
	
	public static boolean isNumberExist(String number) {
		for (String num : numbers) {
			if (num == number)
				return true;
		}
		return false;
	}
	public void call(String number) {
		if (isNumberExist(number))
			System.out.println("Телефон " + myNumber + " звонит телефону " + number);
		else
			System.out.println("Телефона " + number + " нет в базе.");
	}
	public void sendSms(String number, String text) {
		if (isNumberExist(number))
			System.out.println("Сообщение телефону " + number + ":\n" + text);
		else
			System.out.println("Телефона " + number + " нет в базе.");
	}

}
