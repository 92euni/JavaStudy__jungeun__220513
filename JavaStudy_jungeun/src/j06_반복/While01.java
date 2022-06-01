package j06_반복;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result = result +(i+1);
			i++;	//조건변화수식
		}
		
		System.out.println(result);
		
//---------------------------------------		

		while(i < 100) {
			i = i+1;
			result = result + i;
			System.out.println(result);
		}
	}
}

//------------------------------------------

//	1. 참일 때 반복하고 거짓이면 반복을 멈춘다
//	2. i가 1씩 증가하고 처음(조건식)으로 돌아간다
//	3. 100까지 반복한다

//	i = i+1; -> 아무숫자 넣어도 된다 but i++ -> 1씩만 증가한다
//	후증가가 기본이고 마지막에 쓴다