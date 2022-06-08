package j20_컬렉션.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> name = new HashSet<String>();
		
		name.add("이름");
		name.add("이름1");
		name.add("이름2");
		name.add("이름3");
		name.add("이름4");
		name.add("이름5");
		
		System.out.println(name);
	
		Iterator<String> iterator = name.iterator();		//생성아니고 주소를 담고있다
															//String는 한번 생성하고 버려짐
		
		//iterator -> 줄을 세운다 / 위에서 부터 하나씩 값을 가져온다
		while(iterator.hasNext()) {
			//값이 없으면 false
			
			 String name2 = iterator.next();				//생성 하고 값 없어짐
			 												//next()가 다음의 값을 끄집어 낸다
			if(name2.equals("이름3")){
				System.out.println(name2);					//iterator.next()는 다음의 값이기 때문에 무조건 생성해야 한다
			}
			
		}
		
		
		//[값 지워라]
		name.remove("이름5");								//수정해라 - set으로 안된다
															//값을 지우고 수정해야 한다
		System.out.println(name);

	}

}