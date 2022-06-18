package j23_예외처리;

public class ThrowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("프로그램 실행중...");
			int i = 1;
			
			if(i == 0) {
				throw new ValidationCustomeException("예외 발생");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("예외가 발생하더라도 무조건 실행");
		}
		

	}

}
