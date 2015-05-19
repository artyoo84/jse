package oop01.syntax;
/*
생성자는 인스턴스가 생성될 때 
호출되는 "인스턴스 초기화 메서드"이다.
*/
class MilkCoffee{
	int money; // this. 은 멤변
	
	public MilkCoffee(){
		this(500);
		System.out.println("돈을 넣다");
	}
	
	public MilkCoffee(int money){
		this(500,true);
		System.out.println(money + "원");
	}
	
	public MilkCoffee(int money, boolean exist){
		System.out.println(
				"구매가능여부 :" + (exist == true ? "커피종류선택" : "커피없음"));
	}
}
public class CoffeeB {
	public static void main(String[] args) {
		MilkCoffee b = new MilkCoffee();
		// 인스턴스는 변하지 않는 주소값을 가진 참조 변수이다. 
		
	}
}
