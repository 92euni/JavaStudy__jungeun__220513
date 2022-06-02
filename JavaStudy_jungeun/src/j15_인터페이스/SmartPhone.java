package j15_인터페이스;

public class SmartPhone {
	
	private final Hdmi hdmi;		//1. 상수이면
	
	public SmartPhone(Hdmi hdmi) {	//2. 생성될때
		// TODO Auto-generated constructor stub
		this.hdmi = hdmi;			//3. hdmi 사용(값을 무조건 넣어줘야 한다)
	}
	//생성할 때 인터페이스 구조를 바꿔준다
	
	public void powerOn() {
		System.out.println("스마트폰의 전원을 켭니다");
		hdmi.connect();
	}
	public void powerOFf() {
		System.out.println("스마트폰의 전원을 끕니다");
		hdmi.disconnect();
	}
	

}
