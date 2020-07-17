class Operator01{
	public static void main(String[] args){
		
		//증감 연산자(++, --): 1씩 증감. (1순위)
		//변수의 앞/뒤에 사용
		
		int a = 10;
		++a;
		int b = 10;
		b--;

		//결과:11,9  a는 1증가, b는 1감소.
		System.out.println(a);
		System.out.println(b);
		
		//결과:11,12 출력메소드에 들어갈 경우 출력 후 증가한다.
		System.out.println(a++);
		System.out.println(a);
		
		//결과:13,13 출력메소드에 들어갈 경우 증가 후 출력한다.
		System.out.println(++a);
		System.out.println(a);

		//증감연산자 우선순위 퀴즈 (6/6)
		int c = 10;

		System.out.println(c++); //10
		System.out.println(++c); //12
		System.out.println(++c); //13
		System.out.println(c++); //13
		System.out.println(++c); //15
		System.out.println(c);   //15
	}
}
