class String01 {
	public static void main(String[]args){
	char c = 'A';
	String s = "100";
	int x = 100;

	//결과 "100100"
	//String 변수와 int 변수를 연산하면 String으로 변환된 뒤 문자열을 합니다.
	System.out.println(s+ x);

	//결과 "100 A"
	//String에 공백이 들어갈 수 있고 문자형과 정수형 문자열은 모두 문자열로 변화되어 연산된다.
	System.out.println(x+ " "+ c);

	//결과 "100
	//     100
	//     100"
	//print 메소드는 println과 달리 줄바꿈이 포함되지 않는다
	//"\n"를 넣으면 줄이 바뀐다.
	System.out.print(x);
	System.out.println();
	System.out.print(x + "\n");
	System.out.print(x);
	System.out.print("\n");
//============================================================

	// "hello" (겹따옴표도 포함하여 출력하고 싶을 때)
	// \뒤에 특수문자를 사용하면 특수문자를 출력
	System.out.println("\"hello\"");
	System.out.println("\\");
	
	//이스케이프 시퀀스
	// "\t" - Tap
	// "\n" - 줄바꿈
	// "\r" - r뒤의 숫자가 차례대로 앞의 문자를 덮음.
	System.out.println("\t hello");
	System.out.print("123456\r789\n");


	}
}