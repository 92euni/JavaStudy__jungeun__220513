package j04_입력;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
//		과제 : scanner로 윤년
//		 * 윤년은 4의 배수이면서, 100의 배수가 아닐 때 or 400의 배수일 때
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 값 : ");
		
		int num = scanner.nextInt();
		String result = num % 4 == 0 && num % 100 !=0 || num % 400 == 0 ? "윤년" : "윤년이 아님";

		System.out.println("입력한 값 : " + num);
		System.out.print(num + "년도는 : " + result);

	}

}