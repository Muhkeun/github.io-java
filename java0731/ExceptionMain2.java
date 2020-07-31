class ExceptionMain2{
	public static void main(String []args){
		//예외 처리 순서
		try{
			System.out.println(0);
			System.out.println(1);
			System.out.println(0/0);
			//예외 발생 시 다시 돌아가지 않음.
			System.out.println(2);
		}catch(Exception e){ 
			System.out.println(4);
		}
			System.out.println(5);
		
		
System.out.println("=============================================");

		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++){
			//예외처리가 포문안에 있으면 예외가 일어나도 처리후 다음 포문 수행.
			try{
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			}catch(Exception e){
				System.out.println("0");
			}
		}
System.out.println("============예외던지기============================");

		method1();
	}
		
		//throws keywords - 예외가 발생시킴을 알림
		//컴파일 시 위쪽(메서드 호출부분)에 예외가 발생함을 알 수 있음
		//main에 사용 시 컴파일이 된다.
		static void method1() throws Exception{
			method2();
		} 
		static void method2() throws Exception{
			
			//강제로 예외를 발생
			throw new Exception();
		}
}
