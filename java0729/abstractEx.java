//추상화 - 완성되지 않은 클래스
//클래스 이름 앞에 abstract 예약어가 사용된 클래스
//하위 클래스에 구현될 기능을 추상 메소드로 선언한 미완성 클래스

//추상메서드를 소유한 클래스는 추상 클래스로 만들어야 한다.
abstract class Test{
	
	static int x = 100;
	int a = 100;
	//선언부: 메서드 - 접근제어자, 리턴타입 이름 (매개변수) {구현부}
	//추상메서드 => abstract [접근제어자] [리턴타입] 이름(); 
	//추상메서드는 구현부(블럭전체)가 존재하지 않는다.
	abstract void add();
	abstract void add2();
	abstract void add3();
	abstract void add4();


	static int sum(int a, int b){
		return a+b;
	}
}
class A extends Test{
	//추상 메서드는 자식 클래스에서 오버라이딩 될 수 있다.
	//클래식 메서드는 추상 메서드가 될 수 없다.
	void add(){
		System.out.println("상속된 클래스에서 오버라이딩 가능");
	}
	
	//추상메서드 반드시 모두 오버라이딩 해줘야한다.
	void add2(){}
	void add3(){}
	void add4(){}

}
//인터페이스(Interface) 
//다중 구현과 메시지 사용의 일관성을 위해 나온 개념
//인터페이스에 정의된 모든 메소드는 추상 메소드이므로 상속 시
//전부 오버라이딩해야 한다.
interface Test1{
	//추상 메서드만 사용가능
	//static final 상수만 사용가능
	public static final int NUM = 10;
	public static final String Name = "LG";

	public abstract void add();
	public abstract int sum();
	String getName();
}
interface Test2{
	
}


//클래스 생성 시 인터페이스를 구현하기 위해서는 implements 예약어를 사용
//인터페이스를 여러 개 상속 받을 수 있다. 
class B extends Test implements Test1, Test2 {
	
	//마찬가지로 모든 메서드를 오버라이딩 해줘야 한다.	
	public void add(){}
	void add2(){}
	void add3(){}
	void add4(){}

	public int sum(){
		return 1;
	}
	public String getName(){
		
		return "구현부";
	}
	
}

class abstractEx{
	public static void main(String []args){
		//추상 클래스는 객체를 생성할 수 없다.
		//Test t = new Test();
		
		//참조형 변수는 선언할 수 있음
		System.out.println(Test.x);	

		A a = new A();
		a.add();

	}
}
