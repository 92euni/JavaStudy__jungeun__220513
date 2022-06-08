package j20_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapEx {
	public static void main(String[] args) {
		
				//Key, value
	    HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
	      
	
	    //[값 추가]
		studentMap.put(1, "이름1");
		studentMap.put(2, "이름2");
		studentMap.put(3, "이름3");
		studentMap.put(4, "이름4");
		studentMap.put(5, "이름5");
		
		
		System.out.println(studentMap);
		
		
		//key값으로 value 가져오기
		//0번 key값
		System.out.println(studentMap.get(0));
		
		
		//key값이 없을 경우 추가가 됨
		studentMap.put(5, "이름6");
		
		//수정만으로는 replace
		studentMap.replace(5, "이름7");
		
		studentMap.remove(5);
		
		Iterator<Integer> iterator = studentMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String value = studentMap.get(key);
			
			//if를 없애면 전체출력
//			if(value.equals("이름4")) {
//				System.out.println(studentMap.get(key));
//			}
			
			System.out.println(value);
		}
		
		
		//람다식(함수형 프로그래밍) - 함수 그 자체를 값으로 넣는다
		studentMap.forEach(
				(k, v) -> {		//함수명 없기 때문에 입력함수라 한다
								//return이 없다
					
					System.out.println("key =" +  k);
					System.out.println("value = " + v);
				}
		);
//	원래 형태 :
//	void test(Integer k, String v) {
//		System.out.println("key =" +  k);
//		System.out.println("value = " + v);
//	}
		
		System.out.println(studentMap.containsKey(2));
		System.out.println(studentMap.containsValue("이름5"));
		
	}

}