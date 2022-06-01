package j05_조건;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		[문제01]
		int num = 5;
		
		if(num > 5) System.out.println("5보다 큽니다");
		else System.out.println("5보다 크지 않습니다");
		

		
//		[문제02]
		int score = 85;
		
		if(score ==100) {
			System.out.println("만점입니다");
		}else if(score > 89){
			System.out.println("90점 이상입니다");
		}else if(score > 79) {
			System.out.println("80점 이상입니다");	
		}else {
				System.out.println("...");
		}
	}

}