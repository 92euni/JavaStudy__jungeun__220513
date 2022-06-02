package j13_다형성;

public class FactoryMain2 {

	public static void main(String[] args) {
//업캐스팅 하려면 상속이 되어야한다.
//다운캐스팅은 업캐스팅이 되어진 것을 다운캐스팅 가능
//자식이 없으면 다운캐스팅 불가
		
		
		Factory[] factorys = new Factory[100];
		

		for(int i = 0; i < factorys.length; i++) {
		
			factorys[i] = i % 2 == 0 ? new SmartPhoneFactory() : new ComputerFactry();
		}
		
		 for(Factory factory : factorys) {
			factory.start();
		}
		 
		 int i = 10;	
		 double d = i;					//i를 d로
		 int ii = (int) d; 				//d를 ii로
		
		 
		 System.out.println();
		 
		 
		 //instanceof - 생성된 객체
		 for(Factory factory : factorys) {						 		  	//스마트폰을 팩토리로 바꾸고
			 	if(factory instanceof SmartPhoneFactory) {					//factory로 생성된 SmartPhoneFactory라면 true 아니면 false
			 		SmartPhoneFactory spf = (SmartPhoneFactory)factory;		//팩토리를 스마트폰으로 바꿨다.
			 		spf.showSmartPhone();
			 		
			 	}else if(factory instanceof ComputerFactry) {				//factory로 생성된 ComputerFactory라면 true 아니면 false
			 		ComputerFactry cf = (ComputerFactry)factory;
			 		cf.showComputer();
			 		
			 	}else {
			 		System.out.println("다운캐스팅 할 수 없습니다.");
			 	}
		}
		
		 
//		Factory[] factory = new Factory[2];
//		
//		factory[0] = new SmartPhoneFactory();
//		factory[1] = new ComputerFactry();
//		
//		for(int i = 0; i < factory.length; i++) {
//			factory[i].start();
//		}

	}

}
