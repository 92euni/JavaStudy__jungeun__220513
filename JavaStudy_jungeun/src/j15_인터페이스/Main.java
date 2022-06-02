package j15_인터페이스;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monitor monitor = new Monitor();
		BeamProjector beamprojector = new BeamProjector();
		
		SmartPhone smartphone = new SmartPhone(beamprojector);		//업캐스팅	
//		Hdmi hdmi = new Hdmi();										//추상이기 때문에 생성불가(구체화 되지 않았다)
		
		smartphone.powerOn();
		smartphone.powerOFf();

	}

}
