package week1.lesson1;

public class StringExmple {
	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		  String s = "abcdefg";
		  // ���������� ����� ������
		  int k = s.length();//7 
		  
		  // s.charAt( indexA) - ���������� ������ ������ s, ������� ��������� ��� �������� indexA 
		  char c1 = s.charAt(0);// 'a'
		  char c2 = s.charAt(2);// 'c'
		  
		  // s.indexOf( str) ���������� ������ �� ������ s , ��� ���������� ������ str  
		  int k1 = s.indexOf( "ab" ); //0
		  int k2 = s.indexOf( "de" ); // 3
		  int k3 = s.indexOf( "bf" ); //-1
		  
		  //s.substring(indexA, indexB) - ���������� ���������, ������� ���������� � indexA �� indexB �� ������������
		  String s1 = s.substring( 2, 6); // "cdef"
		  
		  //s.equals(s1) - ��������� �����
		  if(s1.equals(s)) System.out.println("������ ������");
		    else System.out.println("������ ������");
		 }

}
