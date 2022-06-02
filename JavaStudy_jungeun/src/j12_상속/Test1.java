package j12_상속;

public class Test1 extends Test {

	public Test1() {
		super();							//	부모클래스 생성자 생성(생략되어 있다)
											//	맨밑으로 내리면 오류난다 -> 부모가 태어나지 않았는데 자식이 태어나서
											//	그래서 가장 위에 쓴다
		
		System.out.println("T1 생성자 호출");
		System.out.println("T1에서 확인 : " + super.toString());
	}
}

//부모클래스를 먼저 생성해놓고 그다음 자식 클래스 생성한다
