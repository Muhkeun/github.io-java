class String01 {
	public static void main(String[]args){
	char c = 'A';
	String s = "100";
	int x = 100;

	//��� "100100"
	//String ������ int ������ �����ϸ� String���� ��ȯ�� �� ���ڿ��� �մϴ�.
	System.out.println(s+ x);

	//��� "100 A"
	//String�� ������ �� �� �ְ� �������� ������ ���ڿ��� ��� ���ڿ��� ��ȭ�Ǿ� ����ȴ�.
	System.out.println(x+ " "+ c);

	//��� "100
	//     100
	//     100"
	//print �޼ҵ�� println�� �޸� �ٹٲ��� ���Ե��� �ʴ´�
	//"\n"�� ������ ���� �ٲ��.
	System.out.print(x);
	System.out.println();
	System.out.print(x + "\n");
	System.out.print(x);
	System.out.print("\n");
//============================================================

	// "hello" (�����ǥ�� �����Ͽ� ����ϰ� ���� ��)
	// \�ڿ� Ư�����ڸ� ����ϸ� Ư�����ڸ� ���
	System.out.println("\"hello\"");
	System.out.println("\\");
	
	//�̽������� ������
	// "\t" - Tap
	// "\n" - �ٹٲ�
	// "\r" - r���� ���ڰ� ���ʴ�� ���� ���ڸ� ����.
	System.out.println("\t hello");
	System.out.print("123456\r789\n");


	}
}