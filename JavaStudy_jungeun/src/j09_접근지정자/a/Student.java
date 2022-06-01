package j09_접근지정자.a;

public class Student {

	private String name;
	private String schoolName;
	
	//setter - 값을 넣어주는 매개
	public void setName(String name) {
		this.name = name;
	}
	
	//getter - 값을 가지고오는 매개
	public String getName() {
		return name; 
	}
}