package j20_컬렉션.ArrayList;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컬랙션은 toString지원하고 있다
	      ArrayList<String> nameList = new ArrayList<String>();
	      ArrayList<String> nameList2 = new ArrayList<String>();
		
	    //리스트에 값 추가 : add() - 끝에
		nameList.add("이땡일");
		nameList.add("이땡이");
		nameList.add("이땡삼");
		nameList.add("이땡사");
		nameList.add("이땡오");
		nameList.add("이땡육");
		
		//리스트 중간에 값 삽입 : add() - 중간에
		nameList.add(0, "이땡공");
		
		//리스트 내의 해당 인덱스 값 수정
		nameList.set (1, "값수정");
		
		//리스트 내의 인덱스로 값 삭제
		nameList.remove(3);
		
		//리스트 내에서 값을 바로 삭제
		nameList.remove("이땡사");
		
		//리스트에서 리스트로 값 옮기기
		//얕은복사(주소값만 복사) vs 깊은복사(내용통째로 복사)
		
		//깊은복사
		nameList2.addAll(nameList);
	
		
		//리스트 내의 모든 값 확인 : toString()
		System.out.println(nameList.toString());
		
		//리스트에서 값 가져오기 : get(인덱스번호)
		System.out.println(nameList.get(3));
		
		//리스트내에서 원하는 값이 있는지 확인
		System.out.println(nameList.contains("이땡오"));
		System.out.println(nameList.contains("이땡사"));
		
		
		//리스트 내의 값이 하나라도 있으면 비우기
		//비어있으면 true
		if(!nameList.isEmpty()) {
			nameList.clear();
		}
		
		System.out.println(nameList);
		System.out.println(nameList2);
	
		
		//리스트를 배열로 변환
		Object[] objs = nameList2.toArray();
		//다운캐스팅을 써야 쓸 수 있다
		for(Object obj :objs) {
			System.out.println((String) obj);
		}
		
	}
}