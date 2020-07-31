class ExceptionMain3{
	public static void main(String []args){
	
		try{
			method1();
		}catch(Exception e){
			//throwable 클래스의 주요 멤버
			//public void printStackTrace();
			//예외 객체 및 그 백 트레이스를 표준 에러 스트림에 출력
			e.printStackTrace();

			//public String getMessage();
			//예외 객체의 상세 메시지를 문자열로 리턴하는 데 생성자에서
			//넘겨 받은 문자열을 리턴
			System.out.println("예외 메시지 ==>" + e.getMessage());
	
		}
	}


	static void method1() throws Exception{
		method2();
		}
		static void method2() throws Exception{
			System.out.println(0/0);
		}
	
}
