class ControlState04{
	public static void main(String [] args){

		//���� ����
		//i�� �ѹ� �� ���� j�� 3�� ���� (��Ϲ����� ���)
		for (int i=0; i<3; i= i+1){
			for(int j=0; j <3; j= j+1){
				System.out.println("i= "+i + " j= "+ j);
			}
		System.out.println();
		}
		
		//¦���� ����ϴ� ����
		for (int a = 1; a <= 100; a= a+1){
			//i�� 2�� ���� �� �������� 0�϶� => ¦��
			if(a % 2 == 0){
				System.out.println(a);
			}
		}

		//����1) 1 ~ 100 ������ ���� ���Ͻÿ�
		int x;
		int sum = 0;
		for (x = 1; x<=100; x= x+1){
			
			sum = sum + x;
		}
		
		System.out.println(sum);
		
		//����2) 1 ~ 100 ������ ¦/Ȧ���� ���� ���Ͻÿ�
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
		
		System.out.println("¦������: " + r2);
		System.out.println("Ȧ������: " + r3);

		//����3) ���� �ݺ����� Ȱ���� ������ ���
		int imsi1;
		int imsi2;
		
		for(imsi1 =2; imsi1<10; imsi1= imsi1+1){
			for(imsi2 = 2; imsi2<10 ;imsi2= imsi2+1){
				
				int imsi3 = imsi1*imsi2;
				System.out.println(imsi1 + " X " + imsi2 + " = " + imsi3);
				
					if(imsi2 ==9){
						System.out.println("\n");
				}
			}
		}


	}
}