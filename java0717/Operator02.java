class Operator02{
	public static void main(String[] args){
		//산술연산자
		byte a =(byte)(100 + 30);
		
		
		//결과:-126.
		//OverFlow: 자료형의 크기를 넘어선 자료가 들어왔을 때 표현범위 내에서 돎.
		System.out.println(a);
		


		//<예제1>	
		long ex1 =100000 * 100000;

		//결과:1410065408. 기본형은 int 이므로 long 형으로 바꾸어 줘야함.
		System.out.println(ex1);
		
		//예제해결: 상수의 자료형을 Long Type으로 변환.
		long ex1Solve = 100000L * 100000;
		//결과:10000000000
		System.out.println(ex1Solve);
		
		
		
		//예제2
		double avg = 95/10;
		//결과: 9.0 int/int로 계산 후(9) double형으로 업캐스팅 되어 9.0 출력.
		System.out.println(avg);

		//예제해결: 연산하는 int형 값중 하나를 double 형으로 표현하여 적음.
		double avgSolve = 95 / 10.0;
		//결과: 9.5
		System.out.println(avgSolve);
	}
}
