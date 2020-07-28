//상위 클래스 타입으로 선언된 참조형 변수에는 하위 클래스 타입으로
//만들어진 인스턴스의 참조를 대입할 수 있음


class A {
	int x;
}
class B extends A{
	int y;
}

class AA{
	
	void add(int x){	
		
		System.out.println(x);
	}
}
class BB extends AA{
		
	void add(String y){
		
		System.out.println(y);
	}
}



class Polymorphizm{
	public static void main(String[] args){
		
		double d = 5.7;
		int c = (int)d;
		
		//위 쪽과 같은 개념 
		A a = new B();
		B b = (B)a;
		
		//원본의 타입이 하위 클래스 타입인 경우에만 해야하는데 그렇지 
		//않으면 에러는 아니지만 실행 시 예외 발생
		//A a = new A();
		//B b = (B)a;
		
	

		System.out.println(a.x);
		
		//오류발생
		//System.out.println(a.y);
	
System.out.println("========================================");
		
		AA aa = new AA();
		AA aa1 = new BB();
		
		//기본적으로 멤버에 접근할 때는 참조형 변수를 선언할 때의 멤버에만
		//접근이 가능하지만 오버라이딩된 메소드는 참조형 변수를 선언할 때는
		//사용한 타입이 아니고 메모리를 할당할 때 사용한 타입을 가지고
		//오버라이딩된 메소드를 호출
		
		aa.add(1);
		aa1.add(2)

		
	}

}
