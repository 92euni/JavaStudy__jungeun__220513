package j08_클래스;

public class FishBun {
	
//	1. 변수선언
	String material;			
	String dough;
	
//	[생성자]
//	원래는 존재하지만 생략된다
//	대문자로 시작
	FishBun(){				
		System.out.println("생성자 호출");
		
	}
	
//	[메소드]
//	소문자로 시작
	void shwoInfo() {
		
//		2. 변수사용
		System.out.println("재료 : " + material);
		System.out.println("반죽 : " + dough);
	}
	
	

}
