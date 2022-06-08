package j18_최상위클래스.entity;

import java.time.LocalDate;
import java.util.Objects;

public class School {
	
	
	private String SchoolName;
	private String Address;
	private String tel;
	private LocalDate SchoolDate;
	private int numberStudents;
	private int numberProfessors;
	private String SchoolType;
	
	public School() {
		// TODO Auto-generated constructor stub
	}

	public School(String schoolName, String address, String tel, LocalDate schoolDate, int numberStudents,
			int numberProfessors, String schoolType) {
		super();
		SchoolName = schoolName;
		Address = address;
		this.tel = tel;
		SchoolDate = schoolDate;
		this.numberStudents = numberStudents;
		this.numberProfessors = numberProfessors;
		SchoolType = schoolType;
	}

	public String getSchoolName() {
		return SchoolName;
	}

	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public LocalDate getSchoolDate() {
		return SchoolDate;
	}

	public void setSchoolDate(LocalDate schoolDate) {
		SchoolDate = schoolDate;
	}

	public int getNumberStudents() {
		return numberStudents;
	}

	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}

	public int getNumberProfessors() {
		return numberProfessors;
	}

	public void setNumberProfessors(int numberProfessors) {
		this.numberProfessors = numberProfessors;
	}

	public String getSchoolType() {
		return SchoolType;
	}

	public void setSchoolType(String schoolType) {
		SchoolType = schoolType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Address, SchoolDate, SchoolName, SchoolType, numberProfessors, numberStudents, tel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(SchoolDate, other.SchoolDate)
				&& Objects.equals(SchoolName, other.SchoolName) && Objects.equals(SchoolType, other.SchoolType)
				&& numberProfessors == other.numberProfessors && numberStudents == other.numberStudents
				&& Objects.equals(tel, other.tel);
	}

	@Override
	public String toString() {
		return "School [SchoolName=" + SchoolName + ", Address=" + Address + ", tel=" + tel + ", SchoolDate="
				+ SchoolDate + ", numberStudents=" + numberStudents + ", numberProfessors=" + numberProfessors
				+ ", SchoolType=" + SchoolType + "]";
	}
	
	
	

}
