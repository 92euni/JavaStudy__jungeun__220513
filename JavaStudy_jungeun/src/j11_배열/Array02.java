package j11_배열;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int size = 4;
//		int[] numbers = new int[size];			//인덱스번호랑 다르다
//		
//		System.out.println("numbers의 개수"+ numbers.length);
				
		
		/*
		 * for문으로 0부터 99까지 반복을 한다
		 * 변수 i의 값이 8의 배수이면
		 * 8의 배수 갯수만큼 배열을 생성하고
		 * 8의 배수를 모두 배열에 대입한다
		 * 배열에 들어있는 8의 배수들을 모두 출력하세요
		 * 
		 */

//[나]
//		for(int i =0; i<100; i++) {
//			if(i !=0 && i % 8 == 0) {
//				int[] count = new int[i];
//				System.out.println(count.length);
		
//			}
		
		
//[선생님]		
		
		int size = 0;							//전역변수
		
		for(int i = 0; i < 100; i++) {
			if(i !=0 && i % 8 == 0) {
				size++;							//8의배수 총 개수
			}
		}
		int [] numbers = new int[size];			//공간만 만들고
		for(int i = 0, j=0; i< 100; i++) {		//int i = 0, j=0; => 변수 여러개 만듦
												
			if(i !=0 && i % 8==0) {				//8의 배수면은
				numbers[j] = i;					//해당 배열에 집어 넣어라
				j++;							//배열에 넣었을때만 1씩 증가
			}
		}
	}
}



//for(int i = 0; i < numbers.length; i++) {
//   System.out.println(numbers[i]);
//}