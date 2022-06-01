package j03_연산;

public class Operation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		증감연산자
		int num = 10;
		num = num+1;
		System.out.println(num++);				//선증가 -> 바로1증가 하고 출력 
												//후증가 -> 다음 명령에 1증가 현재는 그대로 쓰겟다
		System.out.println(num);
		
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(num);
		

	}	

}