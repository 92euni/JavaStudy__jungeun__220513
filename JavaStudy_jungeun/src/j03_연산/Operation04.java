package j03_연산;

public class Operation04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * num1 num2 num3
		 * 
		 * num1의 값이 3의 배수이면서 
		 * num2의 값이 짝수 여야 하고
		 * num3의 값이 5의 배수이며
		 * num3의 값에 num1을 나눈 나머지가 1이면 또는 
		 * num3의 값에 num2의 값을 나눈 나머지가 0이면
		 * T를 출력하라
		 * */
		
		int num1 = 30;
		int num2 = 2;
		int num3 = 9;
		
//		boolean result1 = num1 % 3 ==0;
//		boolean result2 = num2 % 2 ==0;
//		boolean result3 = num3 % 5 ==0;
//		boolean result4 = num3 % num1 == 1 || num3 % num2 ==0;
		
//		boolean result = result1 && result2 && result3 && result4;
		
		boolean result = num1 % 3 ==0 
				&& num2 % 2 ==0 						//약속! 연산자 앞에서 줄바꿈 한다
				&& num3 % 5 ==0 
				&& num3 % num1 == 1
				|| num3 % num2 ==0;
		System.out.println(result);
		

	}

}