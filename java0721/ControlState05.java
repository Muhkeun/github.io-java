class ControlState05{
	
	public static void main(String[] args){
		for (int i = 0; i < 3; i = i+1){
			System.out.println("hello");
		}
	
	System.out.println("===========================\n");
		
		//While���� �̿��Ͽ� hello�� 3�� ����Ͻÿ�.
		//�������� ���� ���� �� for���� �Ȱ���.
		//����� ������ ���� => ����ӵ��� ���� ����.
		int i = 0;
		while(i < 3){
			System.out.println("Hello");
			i = i + 1;
		}
	
	System.out.println("===========================\n");
		
		//do ~ while��
		//�⺻������ �ѹ� ����.
		int x = 0;
		do{
			System.out.println("�ȳ�?");
			x = x + 1;
		}while(x < 3);

	System.out.println("===========================\n");
		
		//�ݺ������� break�� ����ϸ� �ݺ����� ����ȴ�.
		for (int j = 0; j < 100; j = j + 1){
			System.out.println(j);
			if (j==10){
				break;
			}
		}

	System.out.println("===========================\n");
	
		//continue�� ����ϸ� ���ǳ� ������ �����ʰ� �������� ��� �����Ѵ�.
		for (int r = 0; r < 100; r = r + 1){
			if (r==10){
				continue;
			}
			System.out.println(r);
		}
		//break�� ���� ����� �ݺ����� �������� ���̺��� �����ϸ� ���̺��� Ż����.
		
	System.out.println("===========================\n");
		
		//break�� ���� ����� �ݺ����� �������� ���̺��� �����ϸ� ���̺��� Ż����.
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
