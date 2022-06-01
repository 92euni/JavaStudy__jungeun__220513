package j08_클래스;

public class FishBunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
//		[1번 붕어빵]
		FishBun FishBun = new FishBun();					//FishBun -> 메모리 주소에 보관하고 있다			
															//new -> 객체 생성 -> 메모리 주소 가짐
															//FishBun() -> (붕어빵 하나 만들어주는) 생성자
															//생성하면 인스턴스가 된다
															//변수에 담아 참조하겠다
		
		FishBun.shwoInfo();									//-> 1. 처음은 값이 없으니 null 값
		FishBun.material = "팥";							//-> 2. 값 입력
		FishBun.dough = "부드러운 반죽";
		FishBun.shwoInfo();									//-> 3. 값을 가지고 있기 때문에 출력
		
		System.out.println("=============================");
		
		
//		[2번 붕어빵]	
		FishBun FishBun2 = new FishBun();			

		FishBun2.shwoInfo();						
		FishBun2.material = "슈크림";
		FishBun2.dough = "퍽퍽한 반죽";
		FishBun2.shwoInfo();
		FishBun.shwoInfo();									//즉 -> FishBun과 FishBun2는 다른 존재다
		
		System.out.println(FishBun);
		System.out.println(FishBun2);
		
	}

}
