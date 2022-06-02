package j10_클래스기본정리;

import j10_클래스기본정리.controller.UserManagementController;

public class UserManagementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserManagementController userManagementController
		= new UserManagementController();						//상속 : 생성해서 넘겨준다;
//		회원가입3명
		userManagementController.createUser();
		userManagementController.createUser();
//		2명을 배열에 담았기 때문에 추가할 수 없다
		userManagementController.createUser();
	
	}

}

//UserManagementApplication(1번)-> UserManagementController (2번) -> USer(3번)순서대로 흘러간다