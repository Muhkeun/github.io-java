class Tv{
		//현실세계: 설계도 -> 객체
		//   자바: 설계도 -> 객체
		// 클래스에는 객체를 생성하기 위한 필드와 메소드가 정의
		// 클래스로부터 만들어진 객체를 해당 클래스의 인스턴스 (instance)
		// 하나의 클래스로부터 여러 개의 인스턴스를 만들 수 있음
		

		// 전원 / 크기 / 소리 / 채널 / 색상 
		boolean power = false;
		int channel = 1;
		String color = "black";
		int w = 100;
		int h = 80;
}

class class01{
	//main()메소드 - 자바 프로그램을 실행할 때 자바 가상머신에서 호출하는 최초의 메소드(entry point)
	public static void main(String [] args){
		
		//new 클래스(); - 클래스()는 생성자를 호출하는 코드, 생성된 객체는 힙 메모리 영역에 생성
		//new 연산자는 객체를 생성 후, 객체 생성 번지를 리턴
		

		//객체 => Tv를 한대 생산.
		//참조타입 = 참조변수
		//클래스명 객체참조_변수명 = new 클래스_생성자명();
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//객체 주소를 출력
		System.out.println(t1);
		System.out.println(t2);
		
		//"."을 이용해서 멤버에 접근
		//t1 과 t2의 주소가 다르다 => 다른 값이 출력

		t1.power = true;
		System.out.println(t1.power);
		System.out.println(t2.power);

		//t2.power => true : 값만 복사 시킴.
		t2.power = t1.power;
		System.out.println(t1.power);
		System.out.println(t2.power);
		
		//타입이 같다면 변수명이 달라도 대입 가능.
		t1.h = t2.channel;
		System.out.println(t1.h);
		System.out.println(t2.channel);

	
	}
}
