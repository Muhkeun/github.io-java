class InterfaceTest3{
	public static void main(String [] args){
		A a = new A();
		a.methodA();
	}
}
class A {
	void methodA(){
		I i = InstanceManager.getInstance();
		i.methodB();
	}
}

interface I {
	public abstract void methodB();
}

class B implements I {
	public void methodB(){
		System.out.println("methodB in B class");
	}
}
class InstanceManager {
	public static I getInstance(){
		//리턴 타입이 참조형이면 자손의 객체를 리턴해줄 수 있다.
		return new B();
	}
}