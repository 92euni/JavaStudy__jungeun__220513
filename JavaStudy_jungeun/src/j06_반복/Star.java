package j06_반복;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		별찍기
		
//		[1번]		
//		*
//		**
//		***
//		****
//		*****
		
//		[2번]		
//		*****
//		****
//		***
//		**
//		*

		
	  System.out.println("[1번 별찍기]");
      for(int i = 0; i < 5; i++) {
      for(int j = 0; j < i + 1; j++) {
         System.out.print("*");
      }
     System.out.println();

  }
      
      System.out.println();
      
      
		
	 System.out.println("[2번 별찍기]");   
    for(int i = 0; i < 5; i++) {
       for(int j = 0; j < 5 - i; j++) {
          System.out.print("*");
       }
       System.out.println();
    }
		
		
	}

}
