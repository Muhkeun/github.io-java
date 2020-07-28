//상속(Inheritance)
//자식(하위, 파생) 클래스가 부모(상위) 클래스 멤버를 물려 받는 것
//자식이 부모를 선택해 물려받음
//상속대상: 부모의 필드와 메소드
//private 변수는 상속되지 않는다.
//다른 패키지에 있을 경우, dafault도 상속x
//자바의 모든 클래스는 Object 클래스를 상속

//부모
class A {
	A(){
		System.out.println("A생성자");
	}
	int x = 10;
	
}
//자손 - B는 A를 상속
class B extends A{
	B(){
		System.out.println("B생성자");
	}
	int y = 20;
}
//B는 C를 상속
class C extends B{
	C(){
		//부모의 생성자
		super();
		System.out.println("C생성자");
	}
	int z = 30;
}
class ExTest{
	public static void main(String[] args){
		//C클래스 생성

		//결과: A B C 순 
		//=> 상위 클래스를 먼저 호출
		C c = new C();
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.z);


	}
}
