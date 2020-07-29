class BindingTest3{
	public static void main(String []args){
		Parent p = new Child();
		//메소드는 최종적으로 오버라이딩 된 것을 사용한다.
		p.method();
		
	}
}
class Parent {
	int x = 100;
	void method(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	//구별되는 상태로 인스턴스 변수가 존재
	//서로 다른 메모리 공간
	int x = 200;
	void method(){
		int x = 300;
		//300 => 가장 가까운 x를 받아온다.
		System.out.println("x = " + x);
		//100 => 부모의 x
		System.out.println("super.x" + super.x);
		//200 => 클래스의 x
		System.out.println("this.x" + this.x);
	}
}