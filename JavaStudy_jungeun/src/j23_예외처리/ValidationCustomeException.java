package j23_예외처리;

public class ValidationCustomeException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	//노란줄로 뜨면 그냥 적용 해라
	
	public ValidationCustomeException() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("우리가 만든 예외");
	}
	//						생성자에 메세지 전달↓
	public ValidationCustomeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
		System.out.println("우리가 만든 예외 메세지 있음");
	}

}
