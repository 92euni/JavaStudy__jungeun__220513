package J02_변수와_상수;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//형변환
		//[업캐스팅] : 문자 -> 정수 -> 실수   			//	묵시적 형변환
		char a = 'A';
		int b = a;
		
		System.out.println(a);							//	A
		System.out.println(b);							//	아스키코드 -> 65로 바뀜
												
		
		double c = b;								
		System.out.println(c);							//	65.0
		
//----------------------------------	
			
		int d = (int)c;
		System.out.println(d);							//	65 -> 형변환으로 소수점 날린다

		
		//[다운캐스팅] : 실수 -> 정수 -> 문자   		// 명시적 형변환
		char e = (char) d;
		System.out.println(e);							//	A
		
		

	}

}
