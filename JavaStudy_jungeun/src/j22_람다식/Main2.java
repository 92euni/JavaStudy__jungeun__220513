package j22_람다식;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//인터페이스
		Math2 m2 = new Math2Impl();
		Math2 m2_2 = new Math2() {//익명	
		
		@Override
			public double calc(double value1, double value2) {
				// TODO Auto-generated method stub
				value1 += 2;
				value2 -= 1;
				return value1 * value2;
			}

		};
		
		
		//람다식을 바로 메소드 정의(구현)
		//결과가 return 밖에 없을 때 중괄호 ({}) 생략
		Math2 m2_3 = (v1, v2) -> v1 / v2;
		
		Math2 m2_4 = (v1, v2) -> {
			v1 += 2;
			v2 -= 1;		
			return v1 % v2;
			};
			
		double t = m2_3.calc(10, 3);
		System.out.println(t);
		
	}
}