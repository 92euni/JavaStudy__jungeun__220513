package j04_입력;

import java.util.Scanner;

public class Input01 {

	public static void main(String[] args) {
				
				
				Scanner scanner = new Scanner(System.in);
				
//				[풀이1]
//				scanner.nextInt();  // -> 값을 입력받는 역할
				
//				int num1 = scanner.nextInt();  
//				int num2 = scanner.nextInt();
//				System.out.println("입력한 값 : " + num1);
//				System.out.println("입력한 값 : " + num2);
				
				
//				[풀이2]
				int num1 = scanner.nextInt();  
				int num2 = scanner.nextInt();
				System.out.println("입력한 값 : " + (num1 + num2));

				
//				[입력받는방법]
//				scanner.next();					//문자열(String)
//				scanner.nextLine();				//문자열(String)
//				scanner.next().charAt(0);		//문자(char)
//				scanner.nextInt();				//정수(int)
//				scanner.nextDouble();			//실수(double)
			}	

		}