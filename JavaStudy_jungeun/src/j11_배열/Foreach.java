package j11_배열;

public class Foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {1,2,3,4,5,6,7,8};
		
		for(int i =0; i<numbers.length; i++) {
			System.out.print(numbers[i] + (numbers.length-1 != i ? ", " : ""));

			}
		System.out.println();
		
		
		for(int i =0; i< numbers.length; i++) {
			System.out.print(numbers[i]);
			if(numbers.length-1 !=i) {
				System.out.print(", ");
			}
		}System.out.println();
		
		
		for(int num : numbers) {
			System.out.println(num);
			
		}	//제일 처음부터 끝까지 반복
			//하나씩 넣고 출력
			//numbers를 num에 넣고 출력
		
		
//		배열의 자료형과 동일한 것을 써야 한다
		int i =0;
		for(int num : numbers) {
			System.out.print(num + (numbers.length-1 != i ? ", " : "" ));
			i++;
		}		
	}
		
}

//length -> 8    7이여야 하니까 length-1