package j07_메소드;

import java.util.Scanner;

public class Method01 {

//	함수
//	1. 동작을 하는 장치
//	2. 동사로 변수를 지어줘라
	
	public static int clacformula1(int a, int b, int c, int d, int e) {		//2. 호출받고 입력된다
		int result = a + (b * c) - (d * e);									
	return result;															//3. 결과값을 들고 return(반환)해준다
	}

//	-------------------메인함수가 먼저 실행---------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scanner = new Scanner(System.in);
		
//		명사로 변수들을 지어줘라
		int a, b, c, d, e;
		int r1, r2, r3, r4 = 0; 
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		e = scanner.nextInt();
		
		
		r1 = clacformula1(a, b, c, d, e);									//1. r1~r4 순서대로 메서드 쪽으로 호출한다
		//사이에 소스코드 만줄
		r2 = clacformula1(10, 20, 5, 30, 2);									
		//사이에 소스코드 천줄
		r3 = clacformula1(a, b, c, d, e);
		//사이에 소스코드 이천줄
		r4 = clacformula1(a, b, c, d, e);									//4. r1~r4 순서대로 반환된값을 들고와서 저장
		
		
		System.out.println(r1);
		System.out.println(r2);												// 5. return값을 출력한다
		System.out.println(r3);
		System.out.println(r4);
		
		
//		정리!!
//		r1이 호출해서 메서드에서 호출받고 결과값을 들고 반환해주고 그반환된 값을 들고와서 저장하고 출력한다
//		r2~r4까지 순서대로 돌아간다

	}

}
