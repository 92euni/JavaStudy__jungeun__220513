package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import j20_컬렉션.Entity.Student;

public class HashMapEx3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Student> students = new HashMap<Integer, Student>();
		students.put(20220001, new Student(20220001, "으니1", "부산대학교"));
		students.put(20220002, new Student(20220002, "으니2", "부경대학교"));
		students.put(20220003, new Student(20220003, "으니3", "동아대학교"));
		students.put(20220004, new Student(20220004, "으니4", "경상대학교"));
		students.put(20220005, new Student(20220005, "으니5", "경북대학교"));
		
		System.out.println(students);
		
		/*
		 * 1. 이름이 으니4인 학생의 대학을 서울대학교로 변경
		 * 2. 20220003의 학번 학생을 20220003, "롱이", "고려대학교"로 변경
		 * 3. 20220005의 학번 학생을 삭제
		 * 4. 20220002의 학번 학생을 출력
		 * 
		 */
		
		
//		1.[풀이1]
		Iterator<Integer> iterator = students.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			Student sutdent = students.get(key);
			if(sutdent.getName().equals("으니4")) {
				sutdent.setSchoolName("서울대학교");
				break;
			}
		}
//		[풀이2 : foreach로 간단하게]
		for(Student student : students.values()) {
			if(student.getName().equals("으니4")) {
				student.setSchoolName("서울대학교");
				break;
			}
		}
		
//		[풀이3 : 람다식]
		students.forEach(
				(k, v) -> {
			if(v.getName().equals("으니4")) {
				v.setSchoolName("서울대학교");
			}
		});
		
//		2. 
		
		students.replace(20220003, new Student(20220003, "롱이", "고려대학교"));
		
//		3. 
		students.remove(20220005);
		
//		4.
		System.out.println(students.get(20220002));
		
		System.out.println(students);
		
	}

}
