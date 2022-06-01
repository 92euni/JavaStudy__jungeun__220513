package j06_반복;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2단부터 9단까지 출력하세요
		
		
		for(int i = 0; i < 8; i++) {
			System.out.println((i +2) + "단");
			for(int j =0; j < 9; j++) {
				int result = (i +2) * (j + 1);
				System.out.println((i+2) + " X " + (j+1) + " = " + result);
				
			}
			System.out.println();
		}

	}

}