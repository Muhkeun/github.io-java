class Review0721{
	public static void main(String[] args){
		//변수- 하나의 값만 저장할 수 있다.
		//변수- boolean/ char(숫자로 127까지)/ int(약 20억)/ double (소수점 16자리)
		// 논리형을 제외하고 형변환이 가능하다.
		char a = 'A';
		int x = (int)a;
		double d = 5.7;
		x = (int)d;
		d = (double)x;
	
		System.out.println(x);
		System.out.println(d);
	
//===========================================================================

		//연산 - 증감/ 산술/ 비교/ 논리/ 삼항/ 대입
		//overflow 자료형의 크기를 넘어서면 해당하는 자료형 안에서 순환 (기본 자료형에 유의하자)
		long y = 1000000*100000;
		System.out.println(y);

		long r1 = 1000000L*100000;
		System.out.println(r1);
		
		double avg = 365 /10;
		System.out.println(avg);

		double avg2 = 365/ 10.0;
		System.out.println(avg2);

//============================================================================
		//지역 변수는 해당 블록에서만 사용할 수 있다. (error: cannot find symbol)
		int imsi1 = 10;
		
		if (imsi1 > 0){
			int r2 = 500;
			System.out.println(r2);
			
			}
			//System.out.println(r2); - error
		

		int imsi2 = 10;
		int r3 = 0;

		if (imsi2 > 10){
			r3 = 500;
			
			//10 > imsi2 > 0 일 때 동작
		}else if(imsi2 > 0){
			r3 = 100;
			
			//조건식이 false 일때, r3 = 20; 
		}else{
			r3 = 20;	
		}
		System.out.println(r3);
			

//==========================================================
		//Switch문 - 상수값을 입력
		//int, char/ String(버전 1.5 이상부터 사용가능)
		//해당하는 상수값의 case부터 차례대로 시행, break문으로 빠져나갈 수 있다.
		//만족하는 case가 없을 경우 default 시행
		String h = "Hello";
		
		switch (h){
			
			case "hi":
			case "Hello":
			case "nice to meet you":
			default:
		}
	}
}
