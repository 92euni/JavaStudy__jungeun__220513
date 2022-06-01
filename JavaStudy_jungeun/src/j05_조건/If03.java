package j05_조건;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[문제]
//		0보다 작거나 100보다 크면 계산 할 수 없는 점수 입니다 출력
		
//		>= (이상), <= (이하)는 가능하면 지양한다 초과, 미만으로 쓴다
		

		int score = 0;
  		Scanner scanner = new Scanner(System.in);

 		
 		System.out.print("시험점수 입력  : ");
 		score = scanner.nextInt();
		
		if(score<0 || score > 100){
			System.out.println("계산할 수 없는 점수 입니다");
		}else if(score>89){
			System.out.println("A");
		}else if(score>79) {
			System.out.println("B");
		}else if(score>69) {
			System.out.println("C");
		}else if(score>59) {
			System.out.println("D");
		}else  {
			System.out.println("F");
		}

	}
}