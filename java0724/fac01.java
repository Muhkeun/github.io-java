class fac01 {
	public static void main(String[] args){
		//�޼��� ȣ��
		System.out.println(factorial(4));

	}

	static long factorial(int n){
		long result = 0;
		if (n == 1){
			result = 1;
			
		//result�� ȣ���� ������ ���ư���.
		} else {
			System.out.println(n);
			result = n * factorial(n-1);
		}
		return result;
	}

}
