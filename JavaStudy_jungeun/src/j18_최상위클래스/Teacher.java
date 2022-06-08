package j18_최상위클래스;

import java.util.Objects;

/*
 * Object클래스(최상위 클래스)
 * 
 */
public class Teacher  {									//extends Object 생략되어 있음
	
	private String name;
	private String subject;
	private int age;
	
	public Teacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name, subject);
	}


//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Teacher other = (Teacher) obj;
//		return age == other.age && Objects.equals(name, other.name) && Objects.equals(subject, other.subject);
//	}

	//다운캐스팅이유 : name, subject쓸 수 없기 때문에
	@Override
	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Teacher) {		
			Teacher teacher = (Teacher) obj;			//teacher로 들어오면 다운캐스팅해서 비교해라
			
			if(this.name.equals(teacher.name) & this.subject.equals(teacher.subject)
//					&& this.age == this.age
					) 
			{
				return true;
			}
		}
		return super.equals(obj);
	}



	@Override
	public String toString() {
		return "Teacher [name=" + name + ", subject=" + subject + "]";
	}
	
	public void classInfo() {
		System.out.println(Teacher.class.getSimpleName());
		System.out.println(this.getClass().getSimpleName());
	}									

}