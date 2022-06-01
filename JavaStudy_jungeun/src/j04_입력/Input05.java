package j04_입력;

import java.util.Scanner;

public class Input05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		백준문제
//		1. 입출력 : A+B
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		
		System.out.println("두 수를 입력하세요");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("두 수의 합은 : " + (a+b));
		
		
//		2. 두 수 비교
		System.out.println(a < b? "<" 
				: a > b ? ">":"==");
		

	}

}