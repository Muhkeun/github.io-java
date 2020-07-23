class Tv{
		int channel;
		String color;
		int sound;
		//생성자 - 객체의 초기화를 담당.(클래스와 이름을 똑같이 해야한다)
		//필드의 값 설정
		//메소드 호출해 객체를 사용할 수 있도록 준비하는 역할 수행


		//기본 생성자 - 클래스명(){}
		//생성자가 없는 클래스는 기본 생성자를 생성. 
		//생성자가 하나라도 있으면 추가하지 않음 => 호출시 매개변수 없으면 오류
		Tv(){
			channel = 100;
		}
		
		
		//클래스(매개변수선언,...){ 객체의 초기화 코드)}
		Tv(int c){
			channel = c;
		}
		Tv(int c, String d){
			channel = c;
			color = d;
		}
		
		Tv(int ch, int sound){
			
			//instance와 지역 변수가 같을 경우에는 this를 이용해 instance를 구분할 수 있다.
			this.sound = sound;

			//유효성 검사코드 - channel (1~99)
			if(ch > 0 && ch <100){
				channel = ch;
				System.out.println(this.sound);
			}else{
				channel = 1;
				System.out.println(this.sound);
			}
		}
		
		
}

class class02{
		//인스턴스(instance) 변수 - class안에 바로 선언.
		// <=> 지역변수 변수      - 메서드나 생성자 안에 선언.
		int x = 10;
	public static void main(String [] args){
		
		//호출 - Tv의 객체를 생성하고 생성자를 실행 
		Tv t1 = new Tv();
		System.out.println(t1.channel);

		//생성자가 여러개일 경우 매개변수에 따라 알맞은 생성자를 실행
		//결과:50 => int c 가 매개변수로 있는 생성자가 호출되었다.
		Tv t2 = new Tv(50);
		System.out.println(t2.channel);
		
		//결과: 35  Red 
		Tv t3 = new Tv(35, "Red");
		System.out.println(t3.channel + "\n" + t3.color);
		
		//매개변수에 10000을 대입 => 유효성 검사에 의해 channel에 1을 대입.
		Tv t4 = new Tv(10000,12);
		System.out.println(t4.channel);
		
	}
}
