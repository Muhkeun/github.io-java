class ControlState02{
	public static void main(String[] args){
		
		//switch�� - ���ǽ��� ����� (byte,short,int) �Ǵ� char �߿� �ϳ��� �;���.
		//java 7���� ���� String�� ����.
		
		int x = 100;
		
		//���ǽ��� ����� int
		switch(x+100){
			
			//���: 200�� 300��
			//���ǰ��� �ش��ϴ� case�� ���� ���ʴ�� ����
			//case �ȿ� break;�� ������ �ش� ���� ���� �� switch���� ����������.
			case 100:
				System.out.println("100��");
				
			case 200:
				System.out.println("200��");

			case 300:
				System.out.println("300��");
			
			//�����ϴ� case�� ���� �� default���� ���� (else�� ���)
			default:
				System.out.println("0��");
		}
	
	}
}