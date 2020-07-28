//super
//하위 클래스의 인스턴스 메소드 안에서 상위 클래스 객체를 가리키는 포인터
//super는 상위 클래스와 하위 클래스에 동일한 멤버 필드나 필드 메소드가 있을 때
//상위 클래스의 멤버를 명시적으로 지시하기 위해 사용

class A{
	int x = 10;
	A(){
		x = 1000;
	}
	
}
class B extends A{
	//상속 시 변수는 각자의 클래스에서 초기화 하는 것이 좋다.
	int y = 20;
	B(){
		
		super();
		y = 2000;
	}
}
class SuperTest{
	public static void main(String[] args){
		B b = new B();
		//자손클래스에서 생성된 변수 초기화 할 수 있다.
		System.out.println(b.x);
		System.out.println(b.y);
		
	}
}
