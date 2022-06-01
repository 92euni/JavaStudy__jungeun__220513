package j03_연산;

public class Operation03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * year = 1999
		 * result = F
		 * 년도가 4의 배수이면 T
		 * 아니면 F
		 * 
		 * 윤년이면 t
		 * 아니면 f
		 * 윤년은 4의 배수이면서, 100의 배수가 아닐 때 or 400의 배수일 때
		 * */
		
//		int year = 1999;
//		boolean result = year % 4 == 0;
//		System.out.println(result);
		
		int year = 2000;
		boolean result = ((year % 4 ==0) && !(year % 100 ==0 )) || year % 400 ==0;
		System.out.println(result);
		
//		int year1 = 2000;
//		boolean result1 = year % 4 ==0;
//		boolean result2 = year % 100 !=0;
//		boolean result3 = year % 400 == 0;
//		boolean result4 = result1 && result2 || result3;
//		

	}

}