package j15_인터페이스;

public class BeamProjector implements Hdmi{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("빔프로젝터 연결");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("빔프로젝터 연결 해제");
		
	}

}
