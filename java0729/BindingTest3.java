class BindingTest3{
	public static void main(String []args){
		Parent p = new Child();
		//�޼ҵ�� ���������� �������̵� �� ���� ����Ѵ�.
		p.method();
		
	}
}
class Parent {
	int x = 100;
	void method(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	//�����Ǵ� ���·� �ν��Ͻ� ������ ����
	//���� �ٸ� �޸� ����
	int x = 200;
	void method(){
		int x = 300;
		//300 => ���� ����� x�� �޾ƿ´�.
		System.out.println("x = " + x);
		//100 => �θ��� x
		System.out.println("super.x" + super.x);
		//200 => Ŭ������ x
		System.out.println("this.x" + this.x);
	}
}