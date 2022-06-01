package j03_연산;

import java.util.Scanner;

public class Operation08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * num = 10
		 * 
		 * num이 짝수면 짝수
		 * 홀수면 홀수를
		 * 출력하는 프로그램을 작성하세요
		 * 
		 * */
		
		
//		int num = 10;
//		System.out.println(num % 2 == 0 ? "짝수" :"홀수");
			
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int num = scanner.nextInt(); 
		
		String result = num % 2 == 0 ? "짝수" :"홀수"; 
		System.out.println("입력한 값 : " + num);
		System.out.println(num + "는 " + result + "입니다" );
		

	}

}