package j17_static;

//일반 	 : 	복제 ex) 각자의 휴대폰
//static : 	공유
//			메모리 주소가 고정 ex) 1개의 휴대폰

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		Test t2 = new Test();
		Test t3= new Test();
		
		
		t.count = 10;
		t2.count = 20;
		t3.count = 30;
		
		
		t.method();
		t2.method();
		t3.method();
		
		StaticTest st = new StaticTest();
		StaticTest st2 = new StaticTest();
		StaticTest st3 = new StaticTest();
		//생성은 되었지만 메소드는 없다
		
		st.count = 10;
		st2.count = 20;
		st3.count = 30;
		
		StaticTest.count = 100;
		//생성과 상관없다
		
		st.staticMethod();
		st2.staticMethod();
		st3.staticMethod();
		
		StaticTest.staticMethod();
		

	}

}
