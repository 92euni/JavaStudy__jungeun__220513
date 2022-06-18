package j23_예외처리;

/*
 * 프로그램의 오류
 * 1. 예외 -> RuntimeException
 * - 잘 실행되다가 어떠한 조건이 맞지 않는 경우(프로그램이 실행 중 일 때)
 * 
 * 2. 컴파일 에러 -> IOException  ex) 드라이버
 * - 컴파일 과정속에서 오류
 * 
 * 3. 버그
 * - 전부다 완벽한데 외부로 부터 어떠한 작용을 받아서 프로그램 오작동하는 경우
 */

public class ArrayException01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		//오류가 날 부분은 try로 묶어준다
		try {
			for(int i = 0; i < numbers.length + 1; i++) {
				System.out.println("index" + i + ":" + numbers[i]);
			}
			
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("StringIndexOutOfBoundsException 예외가 발생하였음");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//			System.out.println("ArrayIndexOutOfBoundsException 예외가 발생하였음");
//		}catch(IndexOutOfBoundsException e) {
//			//상위로 갈수록 많은 예외를 수용할 수 있다
			
		}catch(Exception e) {
			//제일 최상위 : 왠만한 예외는 여기서 걸러준다
			//항상 밑에 넣어줘야 한다
			//이유는? 100% 예상할 수 없어서 사용자가 쓰면서 예외가 발생할 수 있는데
			//그 오류를 나중에 고쳐주기 위해서(유지보수)
			System.out.println(e);
		}
		
		System.out.println("지금까지 징행한 작업을 저장합니다");
		System.out.println("프로그램이 정상적으로 종료되었습니다");
		
			//catch로 받는다
			//예외처리 : 다음단계로 넘겨준다

	}

}
