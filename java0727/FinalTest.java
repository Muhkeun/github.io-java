final class FinalTest{
		//final �ʵ�
		//����� �̸��� ���� �빮�ڷ� �ۼ�
		//�� �ѹ� �ʱⰪ�� ������ �� �ִµ� 
		//�̶��� �����/��/������ ���� �Ѱ����� �̿��ؼ� �� �� �ִ�. 

		//method�� final�� ������ �������̵� �� �� ����.
		final void ADD(){
		}
		static final int Z = 100;
		//final�� ��ġ�� �������.
		final static int Y = 200;
		
		
		//����Ǹ� �ȵǴ� �͵��� �ַ� ����Ѵ�. Ex)�ֹε�Ϲ�ȣ ���
		final int X;
		FinalTest(int s){ //FinalTest f1 = new FinalTest(100);
		 X = s;        //FinalTest f2 = new FinalTest(200);
		}
			

	public static void main(String[] args){
		
		
		//����ϴ� ���� ���� ����.
		int a = Z;
		int b = a + Z;
		
		//Z = 200; => error�� ���.
		//������ final�� ������ ����� ���Ŀ� �ٸ� �� ������ �� �� ����.
		System.out.println(b);
		
		FinalTest f1 = new FinalTest(500);
		System.out.println(f1.X);

	}
}
