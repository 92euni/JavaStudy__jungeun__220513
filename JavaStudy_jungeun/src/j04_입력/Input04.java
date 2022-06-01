package j04_입력;

import java.util.Scanner;

public class Input04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		/*
		 * 개요 액션, 판타지, 모험 미국 126분 2022.05.04 개봉
		 * 감독 샘 레이미
		 * 등급 국내 12세 관람가
		 * 총평 누적관객 4,987,963명
		 * 줄거리 지금껏 본 적 없는 마블의 극한 상상력!<줄바꿈>
		 * 		  광기의 멀티버스가 깨어난다
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		String outline = null;
		String director = null;
		String rating = null;
		String review = null;
		String plot = null;
		char spacing = 0;
		//줄바꿈 enter는 따로 변수를 만들어서 넣어줘야 한다
		
		System.out.println("[영화정보 입력]");
		
		System.out.print("개요 : ");
		outline = scanner.nextLine();
		
		System.out.print("감독 : ");
		director = scanner.nextLine();
		
		System.out.print("등급 : ");
		rating = scanner.nextLine();
		
		System.out.print("총평 : ");
		review = scanner.nextLine();
		
		System.out.print("줄거리 : ");
		plot = scanner.nextLine();
		
		
		System.out.println("===================");
		System.out.println("[영화정보 출력]");
		System.out.println("개요 : " + outline);
		System.out.println("감독 : " + director);
		System.out.println("등급 : " + rating);
		System.out.println("총평 : " + review);
		System.out.println("줄거리 : " + plot);


	}
