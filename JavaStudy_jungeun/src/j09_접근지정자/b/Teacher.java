package j09_접근지정자.b;

public class Teacher {
	
	private String name;
	private String address;
	private String phone;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhon() {
		return phone;
	}
	public void setPhon(String phon) {
		this.phone = phone;
	} 
	

	public void showInfo() {
		String _address = createMassege(name, address);
		String _phone = createMassege(name, phone);
		
		System.out.println(_address);//_임시변수
		System.out.println(_phone);
	}
	
	//문자를 조합해줄 수 있는 기능 - 반복적인 작업
	private String createMassege(String name, String value) {
		return name + "님: " + value;
	}
		
	
}

 
