package j17_static.student;

public class Student {
	/*
	 * student_code(정수)
	 * student_name(이름)
	 * student_year(학년)
	 * 
	 * 학생을 한명 생성할 때마다 자동으로 student_code의 값이
	 * 1씩 증가하여 부여될 수 있게 작성
	 * 
	 * 20220001
	 * 20220002 
	 * 자동으로 만들어져야 한다
	 * 
	 */
	
	private static int auto_increment = 20220000;
	private int student_code;								//기본값으로 넣어줌
	private String student_name;
	private int student_year;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String student_name, int student_year) {
		this.student_code = ++auto_increment;				//생성이 될때마다 자동으로 학번이 1씩 증가
		this.student_name = student_name;
		this.student_year = student_year;
	}

	public int getStudent_code() {
		return student_code;
	}


	public void setStudent_code(int student_code) {
		this.student_code = student_code;
	}


	public String getStudent_name() {
		return student_name;
	}


	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	public int getStudent_year() {
		return student_year;
	}


	public void setStudent_year(int student_year) {
		this.student_year = student_year;
	}

	
	public void showInfo( ) {
		System.out.println("학번 : " + student_code);
		System.out.println("이름 : " + student_name);
		System.out.println("학번 : " + student_year);
	}

}
