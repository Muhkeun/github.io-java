class ExceptionMain2{
	public static void main(String []args){
		//���� ó�� ����
		try{
			System.out.println(0);
			System.out.println(1);
			System.out.println(0/0);
			//���� �߻� �� �ٽ� ���ư��� ����.
			System.out.println(2);
		}catch(Exception e){ 
			System.out.println(4);
		}
			System.out.println(5);
		
		
System.out.println("=============================================");

		int number = 100;
		int result = 0;
		
		for (int i = 0; i < 10; i++){
			//����ó���� �����ȿ� ������ ���ܰ� �Ͼ�� ó���� ���� ���� ����.
			try{
				result = number / (int)(Math.random()*10);
				System.out.println(result);
			}catch(Exception e){
				System.out.println("0");
			}
		}	
	}
}
