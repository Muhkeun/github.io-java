final class FinalTest{
		//final 필드
		//상수의 이름은 전부 대문자로 작성
		//딱 한번 초기값을 지정할 수 있는데 
		//이때는 명시적/블럭/생성자 셋중 한가지만 이용해서 할 수 있다. 

		//method에 final이 붙으면 오버라이딩 할 수 없다.
		final void ADD(){
		}
		static final int Z = 100;
		//final의 위치는 상관없다.
		final static int Y = 200;
		
		
		//변경되면 안되는 것들을 주로 사용한다. Ex)주민등록번호 등등
		final int X;
		FinalTest(int s){ //FinalTest f1 = new FinalTest(100);
		 X = s;        //FinalTest f2 = new FinalTest(200);
		}
			

	public static void main(String[] args){
		
		
		//사용하는 것은 문제 없음.
		int a = Z;
		int b = a + Z;
		
		//Z = 200; => error가 뜬다.
		//변수에 final이 붙으면 선언된 이후에 다른 값 대입을 할 수 없다.
		System.out.println(b);
		
		FinalTest f1 = new FinalTest(500);
		System.out.println(f1.X);

	}
}
