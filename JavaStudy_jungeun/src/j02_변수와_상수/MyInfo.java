package j02_변수와_상수;

public class MyInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//주석 : 메모, 필기
		
	
		/*[문제1]
		 *name1,name2,name3
		 *age
		 *phone
		 *address
		 */
			
		
		char name1 = '이';
		char name2 = '수';
		char name3 = '달';
		int age = 100;
		String phone = "010-1234-5678";
		String address = "OO시 O구 OO동";
		
		
		System.out.print("이름 : " );
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		System.out.println("이름 : " + name1+name2+name3);
		System.out.println("" + name1+name2+name3);						//(문자("")+ 문자열(name1) -> 문자열
		 
		
		System.out.print("나이 : ");
		System.out.println(age);
		System.out.println("나이 : " + age);
		
		System.out.print("전화번호 : ");
		System.out.println(phone);
		System.out.println("전화번호 : " + phone);
		
		System.out.print("주소 : ");
		System.out.println(address);
		System.out.println("주소 : " + address);
		
		System.out.println("세수의 합 : " + (10 + 20+ 30) );			//괄호한 곳을 먼저 하고 그다음에 문자열이랑 합쳐라	

	}

}