package j08_클래스;

public class Car {
	
	/*
	 * 1. Car class 만든다
	 * 2. Car class의 속성(변수)
	 * 제조사(company), 모델(model), 색상(color)
	 * 3. Car Class의 기능(메소드)
	 * showCompanyInfo() -> xxx회사에서 제조된 차량 입니다
	 * showInfoAll() -> 
	 * 제조사 : xxx
	 * 모델 : xxx
	 * color : xxx
	 * getCar() -> return 제조사, 모델, color
	 * setColor() -> 매개변수에 색상을 받아서 color변수의 값을 변경
	 * 
	 * 차량3대 만들기!
	 * KIA K7 블랙 -> 블루
	 * 현대 소나타 화이트 -> 그레이
	 * 테슬라 model13 레드 -> 그린
	 * 
	 * */
	
	String company;
	String model;
	String color;
	
	void showCompanyInfo() {
		System.out.println(company + "회사에서 제조된 차량 입니다");
	}
	
	void showInfoAll() {
		System.out.println("제조사 : " + company);
		System.out.println("모델 : " + model);
		System.out.println("color : " + color);
	}
	String getCar() {
		return company + "_" + model + "_" + color;
	}
	void setColor(String color) {
		this.color = color;
	}
}
