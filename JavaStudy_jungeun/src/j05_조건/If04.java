package j05_조건;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	백준문제 -> 사분면 만들기

	Scanner scanner = new Scanner(System.in);
	
	int x = 0;
	int y = 0;


	System.out.print("x, y좌표를 입력하세요 : ");
	x = scanner.nextInt();
	y = scanner.nextInt();
	
	
	
	
	String result = (x > 1000 || y > 1000 || x < -1000 || y< -1000 ||x ==0 || y== 0)
		&& (x !=0 || y !=0)? "계산불가"
				: x > 0 && y > 0 ? "1사분면"
						:x > 0 && y > 0 ?" 2사분면"
								:x < 0 && y < 0 ? "3사분면"
										:x< 0 && y< 0 ? "4사분면" : "원점";
	System.out.println(result);
	}
	
}