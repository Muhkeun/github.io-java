class ControlState02{
	public static void main(String[] args){
		
		//switch문 - 조건식의 결과가 (byte,short,int) 또는 char 중에 하나가 와야함.
		//java 7버전 이후 String도 가능.
		
		int x = 100;
		
		//조건식의 결과가 int
		switch(x+100){
			
			//결과: 200점 300점
			//조건값에 해당하는 case로 가서 차례대로 수행
			//case 안에 break;를 넣으면 해당 동작 수행 후 switch문을 빠져나간다.
			case 100:
				System.out.println("100점");
				
			case 200:
				System.out.println("200점");

			case 300:
				System.out.println("300점");
			
			//만족하는 case가 없을 때 default에서 수행 (else와 비슷)
			default:
				System.out.println("0점");
		}
	
	}
}