class Array02 {
	public static void main(String[] args){
		
		int [] a = {10,20,30,40,50,60,70};

		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	
		//for ~each�� - �ڹ� 1.5 ���� �̻���� ���
		// for(������Ÿ��:�迭�̸�){���๮} - �迭�� ���� ũ�⸸ŭ �ݺ�
		for(int i:a){
			System.out.println(i);
		}

		//�迭�� ������ ���� ���� - �迭�� �����Ǳ� �� null�� �ʱ�ȭ ����
		//null - �ּҰ� ����. �ƹ��͵� �����ϰ� ���� �ʴ�. ���� ����(X)
	
		int [] b  = null;

		//null ���� ���� ���¿��� �׸� ���� �Ұ� => NullPointerException
		//System.out.println(b.length); - NullpotinterException
		
	}
}
