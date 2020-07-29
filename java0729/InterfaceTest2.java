class A {
	//autoPlay(new B()) 일 때
	//B클래스는 I를 상속 받았기 때문에 성립
	//따라서 new B.play()를 실행
	void autoPlay(I i){
		i.play();
	}
}

interface I {
	public abstract void play();
}

class B implements I {
	public void play(){
		System.out.println("play in B class");
	}
}

class C implements I {
	public void play(){
		System.out.println("play in C class");
	}
}

class InterfaceTest2 {
	public static void main (String [] args){
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());

	}
}
