class A extends Object{
	int x = 10;
	void add(){
		System.out.println(x);
	}

//�������̵�(������) - ����θ� �״�� ����ϸ� ������ ����
//�޼ҵ� ����� - ����������/ ����Ÿ��/ �̸� (�Ű�����)

//toString Overriding
//API���� ����θ� �Ȱ��� �Է� ��
//������ ���� ����
public String toString(){
		return "AAAA";
	}
}

class B extends A{
	void add(){
		System.out.println("�������̵�");
		}
}
class OverrideMain{
	public static void main(String [] args){
		A a = new A();
		B b = new B();
		System.out.println(a.toString());
		
		a.add();
		b.add();
	}
}