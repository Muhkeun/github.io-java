//�ʱ�ȭ ���(�������)
//����� �ʱ�ȭ (1)/ �� �ʱ�ȭ (2) / ������ �ʱ�ȭ (3)
//�������� = �����
//Ŭ�������� = �����/ �� (�ַ� ��������� �ʱ�ȭ)
//�ν��Ͻ� ���� = �����/ ��/ ������ (�����ڷ� �ʱ�ȭ)
class BlockTest {
	//����� �ʱ�ȭ
	static int x = 10; 
	static String name = "abc";
	
	//�� �ʱ�ȭ - Ŭ���� ������ �ʱ�ȭ�ϴ� ����
	//if, for���� ����� �� �ִ�.
	static{
		x = 20;
		System.out.println("�������_��");
	}
	//������ �ʱ�ȭ
	BlockTest(){
		x = 30;
		System.out.println("�������_������");
	}
	public static void main(String [] args){
		//30�� ���
		BlockTest t1 = new BlockTest();
		System.out.println(t1.x);
		
	}
}