class Tv{
	Tv(){
		//System.out.println("01"); => 주석을 없애면 에러가 발생, this는 생성자 첫 줄에 위치
		this(100);
		System.out.println("01");
	}

	Tv(int c){
		this(100,"aa");
		System.out.println("02");
	}
	Tv(int c, String s){
		System.out.println("03");
	}
}

class Radio{
	String color;
	int channel;
	boolean power;
	
	Radio(){
		//값들이 고정
		//color = "black";
		//channel = 1;
		//power = false;
		
		//this를 이용해 위의 값을 간결하게 표현가능.
		this(1, "black");
		
			}
	Radio(int channel){
		this (channel, "black");
		
		//채널을 입력받아 값을 바꿈.
		//this.channel = channel;
		//color = "black";
		//power = false;
	}
	Radio(int channel, String color){
		
		//파워만 고정. 나머지는 값을 매개변수로 받아와서 대입.
		this.channel = channel;
		this.color = color;
		power = false;
	}
	
}


class class04 {
	public static void main(String[] args){
		// 매개변수가 없는 생성자를 호출 
		// => "this(100);"에 의해 매개변수가 있는 1개의 생성자가 호출
		// => "this(100,"aa");"에 의해 매개변수가 2개 있는 생성자가 호출
		// => "03"을 출력한 뒤 전 생성자로 돌아가 "02"를 출력 후 처음 생성자로 돌아가 "01"을 호출
		Tv t1 = new Tv();

System.out.println("=======================================================");
		
		Radio r1 = new Radio();
		Radio r2 = new Radio(2);
		Radio r3 = new Radio(10, "White");
		
		
		System.out.println("r1 채널:" + r1.channel +"/ r1 색: " + r1.color + "/ r1 전원: " + r1.power);
		System.out.println("r2 채널:" + r2.channel +"/ r2 색: " + r1.color + "/ r2 전원: " + r1.power);
		System.out.println("r3 채널:" + r3.channel +"/ r3 색: " + r1.color + "/ r3 전원: " + r1.power);
	}
}
