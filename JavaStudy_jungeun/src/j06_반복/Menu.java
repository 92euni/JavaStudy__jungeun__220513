package j06_반복;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		boolean loopFlag = true;
		
		System.out.println("프로그램 시작");
		
		while(loopFlag) {
			char select = 0;
			
			System.out.println("===메뉴선택====");
			System.out.println("1. java");
			System.out.println("2. python");
			System.out.println("3. javascript");
			System.out.println("4. 프로그램종료");
			
			System.out.print("명령을 입력하세요 : ");
			select = scanner.next().charAt(0);					
			scanner.nextLine(); 			

			
			if(select == 'q') {
				break;
			}else if(select =='1') {
				System.out.println("java를 선택하셨습니다");
				while(true) {
					System.out.println("[java menu]");
					System.out.println("1. java란?");
					System.out.println("b. 뒤로가기");
					scanner.nextLine();
					
					System.out.print("명령을 입력하세요 : ");
					select = scanner.next().charAt(0);					
					scanner.nextLine();		
					
					if(select =='b') {
						break;
					}else if(select =='1') {
						System.out.println("자바란~~~입니다");
						System.out.println("계속하시려면 엔터를 눌러주세요");
						scanner.nextLine();
					}else {
						System.out.println("해당 명령은 보기에 없습니다");
						System.out.println("다시 입력하세요");
					}
						System.out.println();
				}
			}else if(select =='2') {
				System.out.println("python를 선택하셨습니다");
					while(true) {
						System.out.println("1. python란?");
						System.out.println("b. 뒤로가기");
						scanner.nextLine();
						
						System.out.print("명령을 입력하세요 :");
						select = scanner.next().charAt(0);
						scanner.nextLine();
						
						if(select =='b') {
							break;
						}else if(select == 'q') {
							loopFlag =false;
							break;
						}else if(select =='1') {
							System.out.println("파이썬이란~~~입니다");
							System.out.println("계속하시려면 엔터를 눌러주세요");
							scanner.nextLine();
						}else {
							System.out.println("해당명령은 보기에 없습니다");
							System.out.println("다시 입력하세요");
						}
						System.out.println();
					}
			}else if(select == '3') {
				System.out.println("javascript를 선택하셨습니다");
				while(true) {
					System.out.println("1. 자바스크립트란?");
					System.out.println("b. 뒤로가기");
					scanner.nextLine();
					
						if(select == 'b') {
							break;
						}else if(select =='1') {
							System.out.println("자바스크립트란~~~입니다");
							System.out.println("계속하시려면 엔터를 눌러주세요");
							scanner.nextLine();
						}else {
							System.out.println("해당명령은 보기에 없습니다");
							System.out.println("다시 입력해주세요");
						}
					
						System.out.println();
				}
			}else {
				System.out.println("해당 명령은 보기에 2없습니다");
				System.out.println("다시 입력하세요");
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
		//1. 실행될 일이 없다 그래서 오류남
		//2. 그러나 반복을 멈추는 조건과 break가 들어오면 반복을 끝낼 수 있어서 오류가 없어짐

	}

}

/*
 * scanner.nextLine 이녀석?
 * 	1. 문자열을 입력받는 역할
 * 	2. 버퍼 때문에 띄워쓰기까지 전부다 포함한다
 * 	3. 그래서 입력을 기다리는 역할도 할 수 있다
 * 	4. 입력을 기다리는 동안 반복을 멈춘다
 * 
 * 
 * select = scanner.next().charAt(0); 이녀석?
 * charAt(0)
 * -> 0번째 index다 그래서 문자 하나만 적으면 그 문자가 출력된다
 * 
 * 만약에 0이 아니고 다른 숫자면 'n'번째의 문자가 출력된다
 * 
 * */		
