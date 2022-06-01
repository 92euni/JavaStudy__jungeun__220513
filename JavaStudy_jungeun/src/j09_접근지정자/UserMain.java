package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Student student = new Student();
			Teacher teacher = new Teacher();
			
			student.setName("김OO");
			System.out.println(student.getName());
			
			teacher.setName("김OO");
			teacher.setAddress("부O");
			teacher.setPhon("010-1234-5678");
			teacher.showInfo();
			
			
//			student.//정보은닉 - 정보(값)를 숨긴 것
					//전 클래스가 가지고 있는 변수안에 있는 값들을 다른 클래스에서 가지고 올 수 없다.
					//즉, 접근지정자를 private을 쓰는 것이 정보은닉이다. 
			
//			student.name = "김OO";
//			student.schoolName = "코리아아이티";
//			
//			teacher.name = "김준이";
//			teacher.address = "부O";
					
		}

	}