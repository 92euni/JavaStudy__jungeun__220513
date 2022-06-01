package j04_입력;

import java.util.Scanner;

public class Input02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 문자열1 입력 : next(); 			안녕
		 * 문자열2 입력 : nextLine();		Hi
		 * 문자 입력 : next().charAt(0);	A
		 * 정수 입력 :nextInt();			10
		 * 실수 입력 : nextDouble();		3.14
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		
//		[풀이1]
//		System.out.print("1번째 입력 : ");
//		String num1 = scanner.next();
	
//		System.out.print("2번째 입력 : ");
//		String num2 = scanner.nextLine();
	
//		System.out.print("3번째 입력");
//		char num3 = scanner.next().charAt(0);
		
//		System.out.println("4번째 입력");
//		int num4 = scanner.nextInt();
		
//		System.out.println("5번째 입력");
//		double num5 = scanner.nextDouble();

//		System.out.println(num1+num2+num3+num4+num5);	
		
		
//		[풀이2]
		String num1 = null;
		String num2 = null;
		char num3 = 0;
		int num4 = 0;
		double num5 = 0.0;
		
		System.out.print("문자열 입력 : ");
		num1 = scanner.nextLine();
		
		System.out.print("문자열 입력 : ");
		num2 = scanner.nextLine();
		
		System.out.print("문자 입력 : ");
		num3 = scanner.next().charAt(0);
		
		System.out.print("정수 입력 : ");
		num4 = scanner.nextInt();

		System.out.print("실수 입력 : ");
		num5 = scanner.nextDouble();
		
		System.out.println(num1);	
		System.out.println(num2);
		System.out.println(num3);	
		System.out.println(num4);	
		System.out.println(num5);	

	}

}