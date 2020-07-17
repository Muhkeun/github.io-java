class ControlState01{
	public static void main(String[] args){
		
		//if문 - 조건식의 결과로 수행하는 문장을 결정하게 되는 조건문.
		//if(조건식){수행문1}else{수행문2};
		//else if 문 - 가장 먼저 만나 true문의 수행문을 실행
		//if(조건식1){수행문1}else if(조건식2){수행문2}else if( ... }else{수행문n} 
		int a = 74;

		//a가이 true일 때,"a는 90이상"을 출력.
		//a가 80 이상이고 90미만 일때 ,"a는 90미만 80이상"을 출력.
		//...
		//a가 60 미만일 때, "a는 60미만"을 출력.
		if(a >= 90){
			System.out.println("a는 90이상");
		}else if(a >= 80){
			System.out.println("a는 90미만 80이상");
		}else if(a >= 70){
			System.out.println("a는 80미만 70이상");
		}else if(a >= 60){
			System.out.println("a는 70미만 60이상");
		}else{
			System.out.println("a는 60미만");
		}
		
//========================================================

/*
		int b = 98;
		if(b >= 90){
			char ch = 'A';
			System.out.println(ch);
		}
		
		//error: variable ch might not have been initialized 
		//=> 변수 ch가 지역변수이기 때문에 정의되지 않음.
		
		System.out.println(ch);
*/


		int b = 98;

		//기본값 == 초기화
		char ch =' ';
		if(b >= 100){
			ch = 'A';
			System.out.println(ch);
		}
		System.out.println(ch);

	}
}
