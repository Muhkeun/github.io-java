class A{
	//클래스 변수
	static int k = 500;
}

class Car{
	//클래스 변수 
	static int a = 100;
	
	//인스턴스 변수
	//클래스 변수는 처음 메모리에 올라가기 때문에 대입할 수 있다.
	int speed = a;

	 
}

class class03{
	//인스턴스 변수
	int x = 10;
	//클래스 변수 - "static 자료형 변수명"
	static int a = 100;
	public static void main(String [] args){
		
		//System.out.println(x); => x가 생성되어있는 클래스의 객체가 생성되어야한다.
		System.out.println("a :" + a);

		class03 c = new class03();
		System.out.println("c.x: " + c.x);

System.out.println("=======================================================");
		
		//다른 변수에 있는 클래스 변수는 "클래스이름.변수이름"으로 사용할 수 있다.
		//자기 변수에 있는 클래스 변수를 사용할 때도 동일하지만 생략 가능하다.
		System.out.println("A.k: " + A.k);
		System.out.println("class03.a: " + class03.a);

System.out.println("=======================================================");

		Car c1 = new Car();
		Car c2 = new Car();
		
		
		c1.speed = 300;
		//인스턴스 변수는 객체마다 개별적으로 저장
		System.out.println("Car.a: " + Car.a);
		System.out.println("c1.speed: " + c1.speed);
		System.out.println("c2.speed: " + c2.speed);
		
		//클래스 변수 한꺼번에 바뀐다.
		c1.a = 300;
		System.out.println("Car.a: " + Car.a);
		System.out.println("c1.a: " + c1.a);
		System.out.println("c2.a: " + c2.a);

	
	}
}

