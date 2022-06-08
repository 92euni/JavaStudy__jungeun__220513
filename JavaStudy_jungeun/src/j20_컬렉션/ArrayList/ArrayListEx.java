package j20_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//[배열]
		String[] strArray = new String[5];
		strArray[0] = "a";
		strArray[1] = "a";
		strArray[2] = "a";
		strArray[3] = "a";
		strArray[4] = "a";
		
		//[forEach]
		for(String str : strArray) {
			System.out.println(str);
		}
		//public interface List<E> extends Collection<E> 
		//인터페이스(List)와 인터페이스(Collection)는 서로 상속해야 한다
		
		
		//length
		for(int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
//-----------[ArrayList]--------------------
//			값 추가할 때 : add
//			값 가지고 올 때 : get
//			값을 지울 때 : remove
		
		
		ArrayList<String> strArrayList = new ArrayList<String>();
		strArrayList.add("b1");
		strArrayList.add("b2");
		strArrayList.add("b3");
		strArrayList.add("b4");
		strArrayList.add("b5");
		strArrayList.add("b6");
		//ArrayList : 사이즈를 줄이지 않아도 유동적으로 움직인다
		//
		
		//size
		System.out.println(strArrayList.size());		//.length 아니다
		
		//ArrayList 값 지우기
		strArrayList.remove("b1");
		strArrayList.remove(0);
		
		
		//[forEach]
		for(String str : strArrayList) {
			System.out.println(str);
		}
		
		//size
		for(int i = 0; i < strArrayList.size(); i++) {
			System.out.println(strArrayList.get(i));
		}

	}

}