//super
//���� Ŭ������ �ν��Ͻ� �޼ҵ� �ȿ��� ���� Ŭ���� ��ü�� ����Ű�� ������
//super�� ���� Ŭ������ ���� Ŭ������ ������ ��� �ʵ峪 �ʵ� �޼ҵ尡 ���� ��
//���� Ŭ������ ����� ��������� �����ϱ� ���� ���

class A{
	int x = 10;
	A(){
		x = 1000;
	}
	
}
class B extends A{
	//��� �� ������ ������ Ŭ�������� �ʱ�ȭ �ϴ� ���� ����.
	int y = 20;
	B(){
		
		super();
		y = 2000;
	}
}
class SuperTest{
	public static void main(String[] args){
		B b = new B();
		//�ڼ�Ŭ�������� ������ ���� �ʱ�ȭ �� �� �ִ�.
		System.out.println(b.x);
		System.out.println(b.y);
		
	}
}
