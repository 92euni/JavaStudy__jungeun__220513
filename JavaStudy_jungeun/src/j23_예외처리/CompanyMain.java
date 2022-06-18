package j23_예외처리;

import java.io.PrintStream;
import java.util.ArrayList;

public class CompanyMain {
	

	/*
	 * [문제1]
	 * 1. printCompanies()메소드에서 예외를 미룬다(throws)
	 * 2. printCompanies() 메소드를 호출한 지점에서 예외 처리를 한다
	 * 3. nullPointException 처리를 한다
	 * 		메세지 내용 : 해당 주소에는 Company객체가 존재하지 않습니다
	 * 4. finally 회사 정보 출력 완료
	 * 
	 */
	//예외를 미루고 예외처리를 하고 finally에 적어야 함

	public void printCompanies(ArrayList<Company> companies) throws Exception {
		
		for(Company c : companies) {
			System.out.println("회사명 :" + c.getAddress());
			System.out.println("주소 : " +c.getAddress());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CompanyMain companyMain = new CompanyMain();
		ArrayList<Company> companies = new ArrayList<>();
		

		companies.add(new Company("LG", "구미"));
		companies.add(new Company("삼성전기", "부산"));
		companies.add(new Company("apple", "실리콘벨리"));
		companies.add(null);
		companies.add(new Company("google", "실리콘벨리"));
		
		try {
			companyMain.printCompanies(companies);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("해당 주소에는 Company객체가 존재하지 않습니다");
			e.printStackTrace();
			
		}finally{
			System.out.println("회사 정보 출력 완료");
		}
		
		
		System.out.println("프로그램 종료");
	}

}

