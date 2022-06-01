package j03_연산;

public class Operation07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		 * 윤년은 4의 배수이면서, 100의 배수가 아닐 때 or 400의 배수일 때
		 * 참이면 윤년 거짓이면 윤년이 아님
		 * 
		 */
		
		int year = 2000;
		
		String result = null;
		
		//	선언은 딱 한번만
		//	이후부터는 변수만 쓰면 된다
		
		result = year % 4 == 0 
				&& year % 100 !=0 
				|| year % 400 ==0 ? "윤년": "윤년이 아님";
		
		System.out.println("결과 : " + result);
		
		//	삼항연산자는 중첩도 가능
		
		
//		문자열 - 여러 문자를 하나로 묶은 것
//		api는 -> jdk

	}

}