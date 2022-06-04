package j16_인터페이스_활용.service;

public class OAuth2UserService implements UserService{
	//기존 시스템은 가만히 놔두고 새로운 클래스를 만든다
	
	@Override
	public void creat() {
		System.out.println("kakao 계정 정보로 회원가입");
		
	}
	@Override
	public void read() {
		System.out.println("kakao 계정 정보가 포함된 자회사 정보 가져오기");
		
	}
	@Override
	public void update() {
		System.out.println("kakao 계정 정보를 유지하며 정보 수정하기");
		
	}
	@Override
	public void deleate() {
		System.out.println("자회사 계정과 kakao계정 동기화 해제");
		
	}

}
