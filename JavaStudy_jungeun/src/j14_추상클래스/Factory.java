package j14_추상클래스;


/*
 * 추상(abstract) - 메소드에서 꼭 필요한 기능을 구현할려고
 * 
 * 추상 메소드 
 * 1. return type 앞에 abstract 키워드가 붙는다
 * 2. 추상 메소드는 일반 클래스 안에 선언할 수 없다
 * 3. 상속 or 구현된 클래스에서 무조건 override가 되어야 한다
 * 
 * 
 * 추상 클래스
 * 1. 클래스 type(class) 앞에 abstract 키워드가 붙는다
 * 2. 추상 클래스는 생성(new)할 수 없다 -> 단순히 틀의 역할만 한다
 * 3. 추상 메소드를 포함 할 수 있다 하지만 추상 메소드를 꼭 포함하지는 않아도 된다
 * 
 */

//추상 클래스
public abstract class Factory {
	
	//추상 메소드
	public  abstract void start();					//헤드
	
//	{					
//		System.out.println("공장을 가동합니다");	//바디
//	}
	
	//일반 메소드
	public void stop() {
		System.out.println("공장을 멈춥니다");
	}
	
	private void test() {
		
	}
	
	//start, stop메소드는 Factory에서 꼭 있어야 한다

}
