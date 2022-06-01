package j06_반복;

public class Continue {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   
//continue를 만나면 여기까지만 실행하고 다음으로 넘어간다.
//continue랑 같은 공간안에 있는 아래에 코드는 실행되지 않는다.    
	   
//	  [문제1] 
	  for(int i = 0; i < 10; i++ ) {
         if(i == 5) {
            continue;
//          System.out.println(i);		//오류남
         }
        
      }
	   
//--> 5를 만나면 continue를 만나 밑에 코드를 실행시키지 않고 다음 반복으로 넘어가라     
      
      
      
//		[문제2]        
	   	for(int i = 0; i < 10; i++ ) {
         if(i % 2 == 0) {
            continue;
         }
         System.out.println(i);
      }
//--> 짝수를 만나면 continue를 만나 밑에 코드를 실행시키지 않고 다음 반복으로 넘어가라 
      
   }

}

//	break : 반복문 탈출
//	art+ 방향키위아래  : 위치 변경