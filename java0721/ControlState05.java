class ControlState05{
	
	public static void main(String[] args){
		for (int i = 0; i < 3; i = i+1){
			System.out.println("hello");
		}
	
	System.out.println("===========================\n");
		
		//While문을 이용하여 hello를 3번 출력하시오.
		//증감식이 따로 없을 뿐 for문과 똑같음.
		//기계어로 번역시 같음 => 수행속도에 차이 없음.
		int i = 0;
		while(i < 3){
			System.out.println("Hello");
			i = i + 1;
		}
	
	System.out.println("===========================\n");
		
		//do ~ while문
		//기본적으로 한번 수행.
		int x = 0;
		do{
			System.out.println("안녕?");
			x = x + 1;
		}while(x < 3);

	System.out.println("===========================\n");
		
		//반복문에서 break를 사용하면 반복문이 종료된다.
		for (int j = 0; j < 100; j = j + 1){
			System.out.println(j);
			if (j==10){
				break;
			}
		}

	System.out.println("===========================\n");
	
		//continue를 사용하면 조건내 수행을 하지않고 증감식을 계속 수행한다.
		for (int r = 0; r < 100; r = r + 1){
			if (r==10){
				continue;
			}
			System.out.println(r);
		}
		//break는 가장 가까운 반복문을 끝내지만 레이블을 지정하면 레이블을 탈출함.
		
	System.out.println("===========================\n");
		
		//break는 가장 가까운 반복문을 끝내지만 레이블을 지정하면 레이블을 탈출함.
		aaa :
		for (int imsi1 = 2; imsi1 <10; imsi1 = imsi1 +1){
			for (int imsi2 = 1; imsi2 <10 ; imsi2 = imsi2 +1){
				System.out.println(imsi1 + " X " + imsi2 + " = " + (imsi1 * imsi2));
				if(imsi2 == 3){
					break aaa;
				}
			}
		}

	}
}
