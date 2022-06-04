package j17_static.싱글톤;

import j07_메소드.Method02;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 싱글톤
		 * 1. 유일한 객체(인스턴스)를 생성해야 한다
		 * 2. static변수에 들어가있어야 한다 -> static 메소드 때문이다
		 * 3. 인스턴스가 null
		 */
		
		Method02.test1();
		
		Singleton singleton = Singleton.getInstance();			//get메서드를 가져와서 쓴다
//		Singleton singleton = new Singleton();
		singleton.setCount(10);
		singleton.printInfo();
		
		Singleton singleton2 = Singleton.getInstance();
		singleton2.setCount(10);
		singleton2.printInfo();

	}

}
