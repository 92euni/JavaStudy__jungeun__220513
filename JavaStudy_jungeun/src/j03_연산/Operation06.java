package j03_연산;

public class Operation06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//조건 연산자
		int num = 80;
		
		String result1 = num % 4 == 0 ? "4의 배수" : "4의 배수가 아님";				// ? : 참이니 참이면 :의 왼쪽
		System.out.println(result1);
//		System.out.println(num % 4 == 0 ? "4의 배수" : "4의 배수가 아님");
		boolean result2 = num % 4 ==0 ? true:false;
		System.out.println(result2);
		
//		삼항연산자의 결과는 동일한 자료형을 써야 한다
		int result3 = num % 4 ==0 ? 1:0;
		
//		결과값을 보고 해당결과의 자료형을 따라가야 한다
		
		
//		ctrl + alt + 방향키 위 아래  -> 복사
//		ctrl + shift + l -> 단축키 보기
//		ctrl + space
		
//		cpu는 연산저리장치


	}

}