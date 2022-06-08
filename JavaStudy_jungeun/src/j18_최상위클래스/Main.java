package j18_최상위클래스;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher t1 = new Teacher("김땡땡","웹개발");
		Teacher t2 = new Teacher("김땡땡","웹개발");
		
		//
		System.out.println(t1);					//toString은 생략가능
		System.out.println(t2);		
		System.out.println(t1 == t2);			// == : 변수말고 주소값비교
		System.out.println(t1.equals(t2));		//부모가 가진 equals호출	이것도 주소값비교 -> teacher의 equals에서 내용 추가함!
		System.out.println(t1.hashCode() ==t2.hashCode());
		
		
		Object obj = t1;		//모든 클래스가 업캐스팅 가능(Object로 상속 또는 구현이 되었다)
		

	}
	public void test(Object obj) {
		System.out.println(obj.toString());
		if(obj instanceof Teacher) {
			Teacher teacher = (Teacher) obj;
		}
	}

}
