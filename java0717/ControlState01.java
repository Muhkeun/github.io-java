class ControlState01{
	public static void main(String[] args){
		
		//if�� - ���ǽ��� ����� �����ϴ� ������ �����ϰ� �Ǵ� ���ǹ�.
		//if(���ǽ�){���๮1}else{���๮2};
		//else if �� - ���� ���� ���� true���� ���๮�� ����
		//if(���ǽ�1){���๮1}else if(���ǽ�2){���๮2}else if( ... }else{���๮n} 
		int a = 74;

		//a���� true�� ��,"a�� 90�̻�"�� ���.
		//a�� 80 �̻��̰� 90�̸� �϶� ,"a�� 90�̸� 80�̻�"�� ���.
		//...
		//a�� 60 �̸��� ��, "a�� 60�̸�"�� ���.
		if(a >= 90){
			System.out.println("a�� 90�̻�");
		}else if(a >= 80){
			System.out.println("a�� 90�̸� 80�̻�");
		}else if(a >= 70){
			System.out.println("a�� 80�̸� 70�̻�");
		}else if(a >= 60){
			System.out.println("a�� 70�̸� 60�̻�");
		}else{
			System.out.println("a�� 60�̸�");
		}
		
//========================================================

/*
		int b = 98;
		if(b >= 90){
			char ch = 'A';
			System.out.println(ch);
		}
		
		//error: variable ch might not have been initialized 
		//=> ���� ch�� ���������̱� ������ ���ǵ��� ����.
		
		System.out.println(ch);
*/


		int b = 98;

		//�⺻�� == �ʱ�ȭ
		char ch =' ';
		if(b >= 100){
			ch = 'A';
			System.out.println(ch);
		}
		System.out.println(ch);

	}
}
