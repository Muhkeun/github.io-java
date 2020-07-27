//초기화 방법(수행순서)
//명시적 초기화 (1)/ 블럭 초기화 (2) / 생성자 초기화 (3)
//지역변수 = 명시적
//클래스변수 = 명시적/ 블럭 (주로 명시적으로 초기화)
//인스턴스 변수 = 명시적/ 블럭/ 생성자 (생성자로 초기화)
class BlockTest {
	//명시적 초기화
	static int x = 10; 
	static String name = "abc";
	
	//블럭 초기화 - 클래스 변수를 초기화하는 구역
	//if, for문을 사용할 수 있다.
	static{
		x = 20;
		System.out.println("실행순서_블럭");
	}
	//생성자 초기화
	BlockTest(){
		x = 30;
		System.out.println("실행순서_생성자");
	}
	public static void main(String [] args){
		//30이 출력
		BlockTest t1 = new BlockTest();
		System.out.println(t1.x);
		
	}
}