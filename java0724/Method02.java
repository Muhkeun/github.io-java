class Test{
	int x = 10;
	
	//Return 문 - 메소드 실행을 중지하고 리턴값을 지정하는 역할
	//"return Type에맞는값;"
	//Return Type을 지정했으면 반드시 타입에 맞게 return을 해줘야 한다.
	//void는 return을 사용하면 안된다.
	int getNum(){
		return 10;
	}
	int getNum(int a, int b){
		return a+b;
	}

	
	void hello(){
		System.out.println("Hello");
		
		//메서드에서 자기자신을 호출 할 수 있다. => 무한 루프
		//hello();
	}
	
	//매개변수의 타입,개수,순서가 다르면 오버로딩된다.
	void sum(int a, int b){
		System.out.println(a+b);
	}
	void sum(double a, double b){
		System.out.println(a+b);
	}
	void sum(int a, double b){
		System.out.println(a+b);
	}
	void sum(long a, int b){
		System.out.println(a+b);
	}
	void sum(long a, double b){
		System.out.println(a+b);
	}

}


class Method02{
	public static void main (String [] args){
		Test t1 = new Test();
		
		//메서드 호출
		t1.getNum();
		
		
		
		//리턴 값을 변수 num에 대입
		//"return 10;"에 의해 10이 출력되는 것을 볼 수 있다.
		int num = t1.getNum();
		System.out.println(num);
		
		//메서드도 생성자와 같이 오버로딩이 된다.
		//return을 이용해 연산을 할 수 있다.
		int num02 = t1.getNum(100,200);
		System.out.println(num02);

System.out.println("======================================");

		t1.hello();


		t1.sum(10L, 5.7);
		t1.sum(1, 4);
		t1.sum(5.8, 12.4);
		
	}
}
