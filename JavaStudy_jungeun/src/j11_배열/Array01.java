package j11_배열;

public class Array01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// [참조자료형]
//		1. class
//		2. array

		
//-------------[기본 사용 방법]-------------------------------------------------		
// 		1. 배열의 공간(크기)을 정해서 생성

		int[] numbers = new int[10];
		//	int[] numbers = new int[10]; => 4byte(int)배열 자료형 10개의 공간을 만들고 하나로 묶어라		
		
//		2. 배열에 들어갈 값을 미리 정해서 생성
		int[] numbers2 = {10,20,30,40,50,60,70,80,90,100};
//		--[숫자] : 인덱스번호--
//		numbers[0] = 10;
//		numbers[2] = 20;
//		numbers[3] = 30;
//		System.out.println(numbers[0]);
		
		char[] characters = {'a', 'b', 'c', 'd', 'e'};
		boolean[] booleans = {true, true, true, false, false};
		
		String[] strArray = new String[5];
		String str = "test";									//문자열의 리터럴 주소
		
		System.out.println("numbers의 길이 : " + numbers.length);
		System.out.println("strArray의 길이 : "  + strArray.length);
		
		
		for(int i = 0; i< numbers.length ; i++) {				//.length => 배열의 크기를 가지고 온다 => 여기서는 10이다 => 10개공간
			System.out.println("i : "  + i);
			System.out.println("numbers :" + numbers[i]);		//공간만 만들어져 있어서 int의 기본값인 0이다
			System.out.println("numbers2 : " + numbers2[i]);
		}
		
		for(int i = 0; i< strArray.length; i++) {				//5번반복
			System.out.println(strArray[i]);					//null -> 0번째 주소값 : 값이 비어있다, 주소가 없다
		}
		
		
		
		//indexOutOfBoundsException ==> 길이가 없는데 배열 쓰려고 하면 생기는 에러

	}

}
