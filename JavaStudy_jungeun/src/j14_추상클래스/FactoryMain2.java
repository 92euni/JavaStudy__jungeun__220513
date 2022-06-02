package j14_추상클래스;

public class FactoryMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LGFactory lgfactory = new LGFactory();
		lgfactory.start();
		lgfactory.stop();
		
//		Factory factory = new Factory();  -> 추상클래스이기 때문에 생성 불가
		
		SamsungFactory samsungfactory = new SamsungFactory();
		samsungfactory.start();
		samsungfactory.stop();

	}

}
