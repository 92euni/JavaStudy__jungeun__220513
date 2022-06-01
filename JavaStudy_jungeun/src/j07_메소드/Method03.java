package j07_메소드;

//메소드 오버로딩
//1. 매개변수가 다르다
//2. 리턴자료형이 다르다고 해서 오버로딩이 되지 않는다
//3. 호출이 중요하다

public class Method03 {
	
	public static void test1() {
		System.out.println("매개변수가 없는 test1 호출");
	}
	public static void test1(int num) {
		System.out.println("int 자료형 매개변수가 1개인 test1 호출");
	}
	public static void test1(int num, int num2) {
		System.out.println("int 자료형 매개변수가 2개인 test1 호출");
	}
	
//	[이녀석 왜 안되나요?]
//	public static void test1(int a) {
//		System.out.println("int 자료형 매개변수가 1개인 test1 호출");
//	}
//	변수명이랑 상관없다 자료형이 중요하다
//	그래서 자료형이 다르면 가능하다
	
	
	
	public static void test1(double a) {
		System.out.println("double 자료형 매개변수가 1개인 test1 호출");
	}
	public static void test1(int num, double num2) {
		System.out.println("int 자료형 다음에 double 자료형 매개변수가 2개인 test1 호출");
	}
	public static void test1(double num2, int num) {
		System.out.println("double 자료형 다음에 int 자료형 매개변수가 2개인 test1 호출");
	}

	
//	---------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test1(10);
		test1(11, 22);
		test1(2.2);
		test1(10, 3.88);
		test1(3.14, 77);
	}

}
