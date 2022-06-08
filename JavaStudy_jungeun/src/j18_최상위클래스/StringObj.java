package j18_최상위클래스;

import java.util.Scanner;

public class StringObj {
	public static void main(String[] args) {
		String name = "김땡";
		String name2 = "김땡";							//리터럴 : 주소값이 같다
		
		System.out.println(name == name2);
		
		Scanner scanner = new Scanner(System.in);		//생성이 되므로 주소값이 달라서 false
		
		System.out.println("이름1 : ");
		name = scanner.nextLine();
		
		System.out.println("이름2 : ");
		name2 = scanner.nextLine();
		
		System.out.println(name == name2);
		
		name = new String("김땡");						//생성이 되므로 주소값이 달라서 false
		name2 = new String("김땡");
		
		System.out.println(name == name2);				//주소값비교
		System.out.println(name.equals(name2));			//값비교
		
	}

}