package j15_인터페이스;

public class Monitor implements Hdmi , VGA{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("모니터에 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("모니터 연결 해제");
	}
	@Override
	public void vgaConnect() {
		// TODO Auto-generated method stub
		System.out.println("VGA로 모니터 연결");
	}

}
