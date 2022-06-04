package j17_static.싱글톤.Factory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KIA kiaFactory1 = KIA.getinstance();
		KIA kiaFactory2 = KIA.getinstance();
		KIA kiaFactory3 = KIA.getinstance();
		
		
		Car k5_01 = kiaFactory1.createCar("k5");
		Car k5_02 = kiaFactory1.createCar("k5");
		
		kiaFactory1.carInfo(k5_01);
		kiaFactory1.carInfo(k5_02);
		
		Car k7_01 = kiaFactory2.createCar("k7");
		Car k7_02 = kiaFactory2.createCar("k7");
		
		kiaFactory2.carInfo(k7_01);
		kiaFactory2.carInfo(k7_02);
	}

}
