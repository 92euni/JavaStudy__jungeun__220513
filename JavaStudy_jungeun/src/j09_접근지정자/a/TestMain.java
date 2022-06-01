package j09_접근지정자.a;

import j09_접근지정자.b.Test2;

public class TestMain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Test1 t1 = new Test1();
			t1.aaa = "안녕";
			//t1.
			
			//new Te

			
			Test2 t2 = new Test2();
			//t2.
		
  
			
	// 자바의 접근 지정자
	// 자바도 클래스의 멤버 각각에 외부에서 접근할 수 있는 범위를 지정하는 점근 지정자를 둘 수 있다.		
	// 아래와 같이 4가지가 있다.		
			
	//접근지정자			접근 범위				    동일클래스 | 동일패키지 | 다른패키지의 자식클래스 | 다른패키지
	//public	   접근 제한 없음							o	   |	  o		|			o			  |		o	
	//protected	   동일 패키지와 상속 받은 클래스 내부		o	   |	  o		|			o			  |
	//default	   동일 패키지 내에서만						o	   |	  o		|						  |
	//private	   동일 클래스 내에서만						o	   |	  		|						  |
		
			
			
	//default 	기본(잘 안쓴다)	
	//* public 	공개 
//				공개 정도가 높고 어디에서든 자유롭게 접근할 수 있다.
	//* private	비공개		
		}

	}


