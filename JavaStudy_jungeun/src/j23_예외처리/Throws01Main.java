package j23_예외처리;

public class Throws01Main {
	
	public void test() throws Exception{
		Throws01 throws01 = new Throws01();
		
		throws01.printArray(new int[]{1,2,3,4,5,6,7,8,9});

	}

	public static void main(String[] args) {
		Throws01Main main = new Throws01Main();
		try {
			main.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
//at j23_예외처리.Throws01.printArray(Throws01.java:7)
//at j23_예외처리.Throws01Main.test(Throws01Main.java:8)
//at j23_예외처리.Throws01Main.main(Throws01Main.java:14)

//문제가 있는 예외가 제일 위에 뜬다
//throws Exception -> 예외 미루기
//main전에는 무조건 처리해줘야 한다