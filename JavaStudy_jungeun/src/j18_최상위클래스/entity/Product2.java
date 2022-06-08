package j18_최상위클래스.entity;
/*
 * 상품 정보 클래스(Entity Class)
 * 
 * 1. 변수
 * 	ProductCode
 * 	ProductName
 *  Category
 *  productionDate
 *  
 * 2. 기본생성자, 전체생성자
 * 3. getter, setter
 * 
 *	//[값비교]
 * 4. hashCode()
 * 5. equals()
 * 
 * 6. toString()
 * 
 */

import java.time.LocalDate;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString


public class Product2 {
	
	@NonNull								//널일수없다
	private final int ProductCode;			//생성시 값이 초기화되어야 한다 그래서 @NoArgsConstructor 지워야 함
	private String ProductName;
	private int Category;
	private LocalDate ProductionDate;
	
	

}

//lombok은 하나 수정하면 다 바꿔준다
//원래는 하나하나 자료형과 변수 getter setter다 바꿔줘야한다