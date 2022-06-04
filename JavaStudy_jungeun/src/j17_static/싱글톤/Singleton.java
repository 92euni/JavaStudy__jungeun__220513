package j17_static.싱글톤;
/*
 * 1. 생성자는 private으로 지정하여 외부에서 생성할 수 없게 만들어야 한다
 * 2. 싱글톤으로 설계된 클래스의 유일한 객체(인스턴스)를
		return해줄 수 있는 getInstance() static 메소드가 존재해야 한다
 * 3. 싱글톤 인스턴스를 저장할 변수명이 instance인 static 변수가 존재해야 한다
 */

public class Singleton {
	private static Singleton instance = new Singleton();		//1번
	private int count;
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
			//		System.out.println(count);
			//		static 안에는 일반변수는 쓸 수 없다 - static변수만 쓸 수 있다 이게 아니면 생성하고 써야한다 그냥은 틀만 존재한다
		return instance;		//2. 메소드를 통해 외부로 가져다 준다 - singleton 생성된 주소를 리턴
	}
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void printInfo() {
		System.out.println("싱글톤 테스트 -> " + count);
		
		
	}

}
