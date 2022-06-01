package j08_클래스;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		
		car1.company = "기아";
		car1.model = "k7";
		car1.color = "black";
			
//==============================================
		Car car2 = new Car();
		
		car2.company = "현대";
		car2.model = "소나타";
		car2.color = "white";
		
//==============================================		
		Car car3 = new Car();
		
		car3.company = "테슬라";
		car3.model = "model13";
		car3.color = "red";
		
//============================================		
		car1.showCompanyInfo();
		car2.showCompanyInfo();
		car3.showCompanyInfo();
		
		car1.showInfoAll();
		car2.showInfoAll();
		car3.showInfoAll();
		
		System.out.println(car1.getCar());
		System.out.println(car2.getCar());
		System.out.println(car3.getCar());
		
		car1.setColor("blue");
		car2.setColor("gray");
		car3.setColor("green");
		
		car1.showInfoAll();
		car2.showInfoAll();
		car3.showInfoAll();
		
	}

}