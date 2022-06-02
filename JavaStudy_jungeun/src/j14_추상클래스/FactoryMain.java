package j14_추상클래스;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory lg = new LGFactory();
		Factory samsung = new SamsungFactory();
		
		
		//	Factory 클래스를 상속받은 모든 클래스(인스턴스)를 담을 수 있는 공간 2개의 배열 생성
		Factory[] factorys = new Factory[2];
		
		factorys[0] = new SamsungFactory();				//업캐스팅
		factorys[1] = new LGFactory();					//업캐스팅
		
		//SamsungFactory만의 메소드를 쓸려면 다운캐스팅도 해 줘야 한다
		//지금 상황에서는 다운캐스팅 필요없다
		
		
		//foreach : 처음부터 끝까지 반복
		for(Factory factory : factorys) {
			factory.start();
		}
		for(Factory factory : factorys){
			factory.stop();
		}
		
	}

}