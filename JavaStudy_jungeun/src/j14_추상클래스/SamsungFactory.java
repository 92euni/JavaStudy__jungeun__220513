package j14_추상클래스;

public class SamsungFactory extends Factory{
	
	//abstract가 하나라도 있으면 abstract class가 되어야 한다
	//아니면 오버라이딩 해야 한다
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("삼성 공장 가동");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("삼성 공장 멈춤");
	}

}

	//[자바 디자인 패턴]
	// ->싱글톤 패턴