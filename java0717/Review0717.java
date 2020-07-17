//클래스 이름 지정
class Review0717{

	
	//메인메소드. 실행을 위한 메소드 (컴파일은 가능)
	public static void main(String []args){
	
		//변수 - 하나의 값을 저장하는 메모리 공간. 
		//논리형 변수 boolean 선언 (1bit) 후 대입
		boolean a = true;
		//문자형 변수 char 선언 (2byte) 후 대입
		char b = 'a';
		//정수형 변수 byte 선언 (1byte) 후 대입
		byte c = 100;
		//정수형 변수 short 선언 (2byte) 후 대입
		short d =200;




		//정수형 변수 int 선언 (4byte) 후 대입
		int e = 300;
		//변수에 변수를 대입할 수 있다. 
		int k = e;


		//정수형 변수 long 선언 (8byte) 후 대입
		long f = 400;

		//실수형 변수 float 선언 (4	byte) 후 대입. 
		//실수의 기본형은 double이기 때문에 변수 g의 메모리 크기보다 더 크다. 따라서 대입 할 실수를 float형으로
		//바꾸기 위해 접미사 f를 붙여줘야한다.
		float g = 5.1f;

		//실수형 변수 double 선언 (8byte) 후 대입
		double h = 5.7;

// ========================================================================
		
		//형변환 프로모션 (작은데이터 -> 큰데이터)
		//ch(2byte) -> aa(4byte) -> dd(8byte)
		char ch = 'A';
		int aa = ch;
		double dd = ch;

		//결과: A, 65, 65.0 (자동으로 자료형 명시 없이 문자가 숫자로 변환되어 들어감, Promotion upcasting) 
		System.out.println(ch);
		System.out.println(aa);
		System.out.println(dd);

		//형변환 디모션 (큰데이터 -> 작은데이터). 강제로 형변환 하기 위해서는 자료형을 명시해야함.
		//ee(8byte) -> int(4byte) 
		double ee = 97.7;
		int ff = (int)ee;
		char gg =(char)ff;
		
		//결과: 97.7, 97, 'a'  (정보의 손실이 일어남)
		System.out.println(ee);
		System.out.println(ff);
		System.out.println(gg);
	}
}
