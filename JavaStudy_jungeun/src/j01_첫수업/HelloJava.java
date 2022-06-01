package j01_첫수업;

public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello, Java");
		System.out.println("Hello, Java");					//	ln뒤에서 줄바꿔진다
		
		System.out.println(10 + 5);
		System.out.println();

//	-------------------------------------------------		
		
		int age = 29;
		
//		앞전 변수는 다시 선언하지 않는다
//		동일한 변수명을 쓸 수 없다
//		double age=29;  -> 안됨
		
		System.out.print("이름 : ");
		System.out.println("김준");
		System.out.print("직업 : ");
		System.out.println("강사");
		System.out.print("나이 : ");
		System.out.println(29);
		System.out.println(age);
				
		age = 30;
		
		System.out.print("이름 : ");
		System.out.println("김준");
		System.out.print("직업 : ");
		System.out.println("강사");
		System.out.print("나이 : ");
		System.out.println(29);
		System.out.println(age);
		
		age = age + 1;										//	대입(=)
		System.out.println(age);
		
	}

}