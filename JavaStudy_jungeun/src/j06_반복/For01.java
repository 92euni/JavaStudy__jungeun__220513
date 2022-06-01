package j06_반복;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[for]
//		for는 규칙적인 반복할 때 쓴다
		
//		[오름차순]
		
		for(int i =0; i < 10; i++) {
			System.out.println(i + 1);
		}
		
//		[내림차순]
		
		for(int i =0; i < 10; i++) {  	// <- 10번반복해라  반복횟수다!!
			System.out.println(10-i);
		}
		
//------------------------------------------------------------------------		
//		[while]
//		while 조건을 쟈유롭게 주고 싶거나 자유롭게 반복하고 싶을 때 쓴다
		
		
//		[오름차순]
		int i = 0;
		while(i < 10) {
			System.out.println(i+ 1);
			i++;
		}
		
//		[내림차순]
		int j=0;
		while(j < 10 ) {
			System.out.println(10-j);
			j++;
		}

	}

}