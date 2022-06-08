package j20_컬렉션.ArrayList;

import java.util.ArrayList;
import j20_컬렉션.Entity.Student;


public class ArrayListEx3 {
	
	public static void main(String[] args) {
		//1. student 자료형을 담을 수 있는 ArrayList 생성
		/*
		 * 2. 학생정보 추가
		 * StudnetCode	name		schoolName
		 * 20220001  	우니1 		부산교육대학원
		 * 20220002  	우니2 		부산대학교
		 * 20220003  	우니3  		부경대학교
		 * 20220004  	우니4  		동아대학교
		 * 20220005  	우니5  		연세대학교
		 * 
		 * 3.
		 * 전체 학생 정보 출력
		 * 
		 * 4. 인덱스 3의 위치에 삽입
		 * 20220006		우니우니	서울대학교
		 * 
		 * 5. 인텍스 2의 위치에 있는 학생의 학교명을 고려대학교로 바꾸기
		 * 
		 * 6. 인덱스 5의 위치에 있는 학생의 정보를
		 * 2022007	우니7		부산여중
		 * 
		 * 7. 인덱스 0의 위치에 있는 학생의 정보를 삭제
		 * 
		 */
		
	
//		1.
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student s = new Student(20220000, "우니0", "부산교육대학교");
		
//		2.
		studentList.add(s);
		studentList.add(new Student (20220001, "우니1", "부산교육대학교"));
		studentList.add(new Student (20220002, "우니2", "부산대학교"));
		studentList.add(new Student (20220003, "우니3", "부경대학교"));
		studentList.add(new Student (20220004, "우니4", "동아대학교"));
		studentList.add(new Student (20220005, "우니5", "연세대학교"));
		
		System.out.println(studentList.get(0).getName().equals(s.getName()));
		
//		3.
		System.out.println(studentList);
		
//		4.
		studentList.add(3, new Student(20220006, "우니우니", "서울대학교"));
		
//		5.
		studentList.get(2).setSchoolName("고려대학교");

//		6.
		studentList.set(5, new Student(20220007, "우니7", "부산여중"));
		
//		7.
		studentList.remove(0);
		
		
		System.out.println(studentList);
		
	}
	
}