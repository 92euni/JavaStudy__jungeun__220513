package j10_클래스기본정리.service;

import j10_클래스기본정리.repository.User;
import java.util.Scanner;

public class UserService {	
   
   private Scanner scanner;							//전역변수 - scanner를 딱 1개만 생성해서 어디든지 쓴다
   
   public UserService() {							//지역변수
      scanner = new Scanner(System.in);				//생성될때 scanner 쓴다
   }
   
//  scanner scanner; vs  scanner scanner = new Scanner(System.in);
//  차이점 : 위에 존재하면 scanner를 안쓰고 있으면 메모리를 잡아먹고 있기 때문에
//  생성이 되었을 때 그때 scanner도 생성해서 대입해라

   	public User insertUser() {						//지역변수
	   
      shoInsertView();

      String usercode = null;
      String email = null;
      String name = null;
      String username = null;
      String password = null;
    
       System.out.print("사용자번호입력:");
       usercode = scanner.nextLine();
       System.out.println("이메일");
       email = scanner.nextLine();
       System.out.println("이름");
       name = scanner.nextLine();
       System.out.println("사용자이름");
       username = scanner.nextLine();
       System.out.println("비밀번호");
       password = scanner.nextLine();

      
      User user = new User(usercode, email, name, username, password);
      return user;
   }
   
   private void shoInsertView() {						//캡슐화  - private --> 다른 class에서 호출 못하게
      System.out.println("[사용자 추가]");
      System.out.println("아래의 양식에 맞게 정보를 입력하세요.");
   }
}

