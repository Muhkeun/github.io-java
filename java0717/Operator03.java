class Operator03{
	public static void main(String[] args){
		
		int a = 10;
		int b = 10;
	
		//논리형 변수 선언
		boolean r = a+10 > b;
		boolean r2 = a == b;
		boolean r3 = a+10 != b; 
		
		// 결과: true, true, true
		// (a + 10)은 b보다 크지 않다, a와 b는 같다, (a+10)은 b와 같지 않다.
		System.out.println(r);
		System.out.println(r2);
		System.out.println(r3);
		
		// 결과: 10 => a의 상수는 변하지 않는다.
		System.out.println(a);
		

//==========================================================

		//&&(And), ||(Or) 연산을 이용한 조건연산
		boolean r4 = true && false;
		boolean r5 = true || false;
		
		//결과: false,true 
		//&&연산은 모두 true여야 true.
		//||연산은 하나라도 true이면 true.
		System.out.println(r4);
		System.out.println(r5);
		
		
		//결과: false, true
		// 논리연산자 '!'는 논리값을 반대로 나타낸다.
		System.out.println(r4);
		System.out.println(!r4);

//=============================================================
		
		//삼항연산자 '조건식 ? true : false'으로 표현.
		//조건식이 사실이면 true를 리턴. 거짓이면 false를 리턴.
		int c = 10;
		
		//결과: "크다"
		//'a>0'은 참.
		System.out.println(a>0 ? "크다" :"작다");

	}
}
