package j06_반복;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단2단
		
		/*
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * .
		 * .
		 * .
		 * 2 X 9 = 18
		 * 
		 * */
		
		int dan = 2;
		int num = 0;
		
		while(num < 9) {	
			System.out.println(dan + " X " + (num+1) + " ="  + dan * (num+1));
			num++;
			
		}
		
	}

}