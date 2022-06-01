package j02_변수와_상수;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int MAX_NUMBER = 100;     								//	운영체제에 저장
																		//	상수의 이름에는 중간에 _쓴다
																		//	대문자는 상수입니다 라는 뜻
																		//	변수명은 소문자로 시작하고 카멜표기법사용	
																		//	상수는 모두 대문자로
																		//	클래스명은 대문자로 시작
		final int MIN_NUMBER;
		MIN_NUMBER = 10;
		
//		MAX = 1000;
//		MIN = 100;
//		
//		System.out.println("최대값 : " + MAX);
//		System.out.println("최대값 : " + MIN);
		
		System.out.println(MAX_NUMBER);
		System.out.println(MIN_NUMBER);
		
																		//	유일하게 쓰는 값 : 상수로 딱 지정!!
																		//	ex) %, 경로
		final  String PATH = "C://junil//junil//workspace";
		final double PI = 3.14;
		
																		//	이미정해져 있는 상수 값 : 리터럴상수
																		//	이미정해져 있어서 변하지 않는다
	}
	
}