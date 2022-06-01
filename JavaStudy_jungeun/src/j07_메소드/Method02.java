package j07_메소드;

//클래스 안에 정의된 함수를 메소드라고 한다

public class Method02 {
	
//	1. 매개변수가 없으면서 반환도 없는 메소드(void -> return할 것이 없다)
	public static void test1() {
		System.out.println("test1 메소드 실행");
	}

//	2. 매개변수가 있고 반환이 없는 메소드
	public static void test2(int age, int year) {
		System.out.println("나이 : " + age);
		System.out.println("출생년도 : " + year);
	}
//	3. 매개변수가 없고 반환이 있는 메소드(String만 return)		//string : 클래스 -> 클래스반환가능
	public static String test3() {
		return "해렁이"; 										//(return "해렁이") -> 자체가 값이다
	}
	public static int test4() {									//int : 일반자료형
		return 1000;
	}
//	4. 매개변수가 있고 반환도 있는 메소드
	public static String test5(String name, int num) {
		return name + num;
	}
	
//	5. 리턴자료형이 void일 때 메소드를 강제로 탈출하는 방법
	public static void test6() {
		for(int i =0; i < 10; i++) {
			System.out.println(i);
			if(i == 6) {
				System.out.println("메소드 탈출");
				return;
			}
		}
		System.out.println("test6가 정상 종료되었습니다");
	}	
//---------------------------------------------------------------
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인함수 시작");
		test1();//호출
		test2(29,1994);
		String name = test3();									//해렁이 -> 값이기 때문에 변수에다가 담을 수 있다   
		System.out.println(test3());
		System.out.println(test4());
		System.out.println(test5("해렁해렁", 2));
		test6();
		System.out.println("메인함수 끝");
	}

}
/*
 * [==========정리==========]
 * 
 * java : 클래스로딩 방식
 * but 클래스 안에 정의된 함수인 메서드를 쓰는 것이고
 * 
 * 
 * javaScript : 클래스 개념이 아니다
 * <script>
 * 		함수 선언
 * 			및
 * 		함수 호출
 * </script>
 *  * 
 * */


/*
 * [========break vs return========]
 * 
 * break : 반복문을 멈춘다
 * return : 메소드를 멈춘다 -> 어느위치에서든지 멈출 수 있다
 * */
