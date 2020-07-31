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
	}
}
