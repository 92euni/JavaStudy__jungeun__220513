package j06_반복;

import java.util.Scanner;

public class While03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int num = 0;
		 * 반복 횟수를 입력하세요 : 5
		 * 
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 
		 * */
		
		System.out.print("반복횟수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int i = 0;
		
		num = scanner.nextInt();
		
//		오름차순
		while(i < num ) {
			System.out.println(i+1);
			i++;
		}
		
		
//		내림차순
		i=0;
		
		while(i < num) {
			System.out.println(num - i);
			i++;
		}

	}

}