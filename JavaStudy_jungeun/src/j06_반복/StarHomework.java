package j06_반복;

public class StarHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		과제
		/*
		 * [3번]
		 *     *
		 *    **
		 *   ***
		 *  ****
		 * *****
		 * 
		 * [4번]
		 * 
		 * *****
		 *  ****
		 *   ***
		 *    **
		 *     *
		 *     
		 *  [5번]   
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 * *********
		 * 
		 * */
		

		System.out.println("===3번문제===");
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}for(int k = 0; k < i+1; k++ ) {
				System.out.print("*");
			}System.out.println();
				
			
		}
		
		System.out.println("===4번문제===");
		for(int i =0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(" ");
			}for(int k = 0; k < 5-i; k++ ) {
				System.out.print("*");
			}System.out.println();
				
			
		}
		
		System.out.println("===5번문제===");
		for(int i =0; i < 5; i++) {
			for(int j = 0; j+1<5-i; j++) {
				System.out.print(" ");
			}for(int k = 0; k <2*(i+1)-1; k++ ) {
				System.out.print("*");
			}System.out.println();
				
			
		}
		

	}

}