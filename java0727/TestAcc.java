class Acc {
	//public - ��� ���� ���
	public static int a = 100;
	//���� Ŭ���� ���ٸ� ���
	private static int b = 200;
	//private Acc(){}
}

class Age{
	private int age;
	//�޼��带 ���ؼ� ���� �˻簡 ���� = ��ȿ�� �˻� 
	//ĸ��ȭ - ������ ���� ������ ���ϰ� �Ѵ�.
	public void setAge(int a){
		if(a > 0 && a < 150){
			this.age = a;
	}
	//�ٽ� �������ټ� �ִ� �޼��嵵 ������ �Ѵ�.
	}
	public int getAge(){
		return age;
	}
}


class TestAcc {
	public static void main(String[] args){
		System.out.println(Acc.a);

		//�ٸ� Ŭ�������� ȣ���ϱ� ������ �� �� ����.
		//System.out.println(Acc.b);
		
		//�����ڵ� �������� 
		//Acc ac = new Acc();

System.out.println("=============================================");

		Age ac = new Age();
		ac.setAge(50);
		System.out.println(ac.getAge());
	}
}
