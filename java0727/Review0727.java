class Mart{
	//이름/ 크기/ 제품수/ 시간/ 위치/ == 변수
	//이름변경/ 제품수 변경/ 위치
	//this - 인스턴스 메서드 / 생성자 사용가능
	//		 인스턴스 변수와 지역변수 구별할 때 사용
	static String name ;
	String addr;
	int product;
	int time;
	
	void setName(String name){
		
		//인스턴스 변수와 지역변수가 이름이 같을 때는
		//인스턴스 변수 앞에 this를 붙여준다.
		
		//클래스변수 => 언제든지 사용 가능 (클래스명.변수명)
		//클래스 영역에 선언된다.
		//생성자/ 메소드에서 선언할 수 없다.
		this.name = name; 
	}
}
class Abc{
	static int num = 100;
	double x = Review0727.avg;
}

class Review0727{
		static double avg = 99.9;
	public static void main(String[] args){
		System.out.println(Mart.name);
		System.out.println(Abc.num);
		System.out.println(Review0727.avg);
	}
}
