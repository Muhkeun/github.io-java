class A extends Object{
	int x = 10;
	void add(){
		System.out.println(x);
	}

//오버라이딩(재정의) - 선언부를 그대로 사용하며 구현부 변경
//메소드 선언부 - 접근제어자/ 리턴타입/ 이름 (매개변수)

//toString Overriding
//API내의 선언부를 똑같이 입력 후
//구현부 내용 변경
public String toString(){
		return "AAAA";
	}
}

class B extends A{
	void add(){
		System.out.println("오버라이딩");
		}
}
class OverrideMain{
	public static void main(String [] args){
		A a = new A();
		B b = new B();
		System.out.println(a.toString());
		
		a.add();
		b.add();
	}
}