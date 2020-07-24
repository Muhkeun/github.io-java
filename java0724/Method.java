class Test{
	int x = 10;
	
	//Method - 객체의 동작 (기능), 호출해서 실행할 수 있는 중괄호 블록
	//메소드 호출하면 중괄호 {} 블록에 있는 모든 코드들이 일괄 실행
	//"리턴타입 메소드이름 (매개변수){ 실행블록}"
	//void- return type이 없다.
	void add(){
		x += 10;
	}
}


class Method01{
	public static void main (String [] args){
	
		//객체생성
		Test t1 = new Test();
		System.out.println(t1.x);
		
		//메서드 호출
		t1.add();
		System.out.println(t1.x);

		
		
	}
}
