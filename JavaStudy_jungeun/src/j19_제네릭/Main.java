package j19_제네릭;

import j10_클래스기본정리.repository.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Controller controller = new Controller();
		System.out.println(controller.createUser());
		System.out.println(controller.updateUser());
																//다운태스팅↓
		System.out.println(((CMRespDto<User>) controller.getUser()).getDate());
		
		controller.getAnimal().getDate().move();
		
	}

}
