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

public class Product {
	
	private int ProductCode;
	private String ProductName;
	private int Category;
	private LocalDate ProductionDate;
	
	
	//기본
	public Product() {
		// TODO Auto-generated constructor stub
	}

	//전체
	public Product(int productCode, String productName, int category, LocalDate productionDate) {
		super();
		ProductCode = productCode;
		ProductName = productName;
		Category = category;
		ProductionDate = productionDate;
	}

	//getter setter
	public int getProductCode() {
		return ProductCode;
	}

	public void setProductCode(int productCode) {
		ProductCode = productCode;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public int getCategory() {
		return Category;
	}

	public void setCategory(int category) {
		Category = category;
	}

	public LocalDate getProductionDate() {
		return ProductionDate;
	}

	public void setProductionDate(LocalDate productionDate) {
		ProductionDate = productionDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Category, ProductCode, ProductName, ProductionDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Category == other.Category && ProductCode == other.ProductCode
				&& Objects.equals(ProductName, other.ProductName)
				&& Objects.equals(ProductionDate, other.ProductionDate);
	}

	@Override
	public String toString() {
		return "Product [ProductCode=" + ProductCode + ", ProductName=" + ProductName + ", Category=" + Category
				+ ", ProductionDate=" + ProductionDate + "]";
	}
	
	
	

}
