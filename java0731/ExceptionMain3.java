class ExceptionMain3{
	public static void main(String []args){
	
		try{
			method1();
		}catch(Exception e){
			//throwable Ŭ������ �ֿ� ���
			//public void printStackTrace();
			//���� ��ü �� �� �� Ʈ���̽��� ǥ�� ���� ��Ʈ���� ���
			e.printStackTrace();

			//public String getMessage();
			//���� ��ü�� �� �޽����� ���ڿ��� �����ϴ� �� �����ڿ���
			//�Ѱ� ���� ���ڿ��� ����
			System.out.println("���� �޽��� ==>" + e.getMessage());
	
		}
	}


	static void method1() throws Exception{
		method2();
		}
		static void method2() throws Exception{
			System.out.println(0/0);
		}
	
}
