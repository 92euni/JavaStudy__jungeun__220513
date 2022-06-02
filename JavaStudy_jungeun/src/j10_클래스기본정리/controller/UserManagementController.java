package j10_클래스기본정리.controller;

import j10_클래스기본정리.repository.User;
import j10_클래스기본정리.service.UserService;

public class UserManagementController {

	
	private UserService userService;									//전역변수
	private User[] users;												//1. 배열추가!
	
	
	 public UserManagementController() {
	      userService = new UserService();								//2. 전역변수를 사용하기 위해서 생성
	      users = new User[2];											//3. users 주소 2개의 공간 추가!
	   }
	   
	//   상속을 배우면 아래와 같이 코드를 쓸수있다.
	//   public UserManagementController(UserService userService) {
	//	      this.userService = userService;
	//   }
	
	 
	 
	public void createUser() {

		int indexResult = findEmptyInUsers();							//indexResult 변수 추가!
		if(indexResult != -1) {
//			UserService userService = new UserService();				//공통으로 쓰는 것은 전역으로 빼야된다
			users[indexResult] = userService.insertUser();				//User class의 메모리의 주소값을 담아야 한다-> 생성자가 주소값을 리턴해준다 -> 주소값을 담을 수 있는 변수를 생성해준다 
			
			System.out.println("새로 추가된 사용자");
			System.out.println(users[indexResult].toString());			//모든 변수 출력 역할
		}else {
			System.out.println("더 이상 사용자를 추가할 수 없습니다");
		}

		
	}
	private int findEmptyInUsers() {									//findEmptyInusers 메서드 추가!
		for(int i =0; i < users.length; i++) {
			if(users[i] ==null) {
				return i;
			}
		}
		return -1;
	}
	public void updateUser() {
		
	}
}