package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;

public class HashSetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashSet<Student>
		 * 
		 * 20220001, "이름1", "부산대학교일까"
		 * 20220002, "이름2", "부경대학교일까"
		 * 
		 * 20220002의 코드를 가진 학생을 조회
		 * 20220001의 코드를 가진 학생을 삭제
		 * 
		 * */
		
		HashSet<Student> student = new HashSet<Student>();
		
		student.add(new Student (20220001, "이름1", "부산대학교"));
		student.add(new Student (20220002, "이름2", "부경대학교"));
		
		
		Iterator<Student> iterator = student.iterator();		//줄서라!!!
		while(iterator.hasNext()) {								//줄서있는 사람있니?
			
			 Student student2 = iterator.next();				//다음학생 나오세요
			 if(student2.getStudentCode() == 20220002) {
				 System.out.println(student2);
			 }
		}
		
		iterator = student.iterator();
		while(iterator.hasNext()) {								//비어있어서 쓸 수 없다  그래서 다시 줄서야 한다	
			 Student student2 = iterator.next();		
			 if(student2.getStudentCode() == 20220001) {
				 student.remove(student2);
				
			 }
		}
		
		System.out.println(student);

	}
}
