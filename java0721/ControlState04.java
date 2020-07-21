class ControlState04{
	public static void main(String [] args){

		//다중 포문
		//i가 한번 돌 동안 j는 3번 돈다 (톱니바퀴와 비슷)
		for (int i=0; i<3; i= i+1){
			for(int j=0; j <3; j= j+1){
				System.out.println("i= "+i + " j= "+ j);
			}
		System.out.println();
		}
		
		//짝수만 출력하는 포문
		for (int a = 1; a <= 100; a= a+1){
			//i를 2를 나눌 때 나머지가 0일때 => 짝수
			if(a % 2 == 0){
				System.out.println(a);
			}
		}

		//예제1) 1 ~ 100 까지의 합을 구하시오
		int x;
		int sum = 0;
		for (x = 1; x<=100; x= x+1){
			
			sum = sum + x;
		}
		
		System.out.println(sum);
		
		//예제2) 1 ~ 100 까지의 짝/홀수의 합을 구하시오
		int y;
		int r2 = 0;
		int r3 = 0;

		for (y = 0; y<=100 ; y= y+1){
			
			if( y%2 == 0){
				r2 = r2 + y;
			}else{
				r3 = r3 + y;
			}
		}
		
		System.out.println("짝수의합: " + r2);
		System.out.println("홀수의합: " + r3);

		//예제3) 다중 반복문을 활용한 구구단 출력
		int imsi1;
		int imsi2;
		
		for(imsi1 =2; imsi1<10; imsi1= imsi1+1){
			for(imsi2 = 1; imsi2<10 ;imsi2= imsi2+1){
				
				int imsi3 = imsi1*imsi2;
				System.out.println(imsi1 + " X " + imsi2 + " = " + imsi3);
				
					if(imsi2 ==9){
						System.out.println("\n");
				}
			}
		}


	}
}
