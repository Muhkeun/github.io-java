class Array03 {
	public static void main(String[] args){
		//�������迭�� 2�����迭 - "�ڷ��� �迭�̸�[][] = new int [���� ũ��][���� ũ��]"
		int [][]a = new int[2][3]; 
		int b[][] = new int[3][5];

		//"�ڷ���[][]�迭�� = {�ʱ�ȭ����Ʈ};" - �ʱ�ȭ �� ���·� ������ �� �ִ�.
		int [][] x = {{1,2,4},{4,5,6}};
		
		//"�迭�̸�.length"�� ���� ���� ��Ÿ����.
		System.out.println("a.length: " + a.length);
		System.out.println("b.length: " + b.length);

		//"�迭�̸�[�ε���].length"�� �ش� ���� ���� ������ ���´�.
		System.out.println("a[0].length: " + a[0].length);
		System.out.println("b[0].length: " + b[0].length);


		//�������迭�� �����迭 - ���̰� ���� �ٸ� �迭
		//"�ڷ��� �迭�̸�[][] = new int[��][]"
		int c[][] = new int[3][]; 
		
		//"�迭��[�ε���] = new �ڷ���[����ũ��]" �� �и� ����
		c[0] = new int[3];
		c[1] = new int[2];
		c[2] = new int[4];
		
		//���� ����
		System.out.println("c.length: " + c.length); //4
		//�����迭�� ���� ������ �ٸ��� ������ �ٸ��� ���´�.
		System.out.println("c[0].length: " + c[0].length); //3
		System.out.println("c[0].length: " + c[1].length); //2
		System.out.println("c[0].length: " + c[2].length); //4

		
		int [][] arr = {{10,20,30},{100,200,300}};
		//���� ������ �ݺ�
		for (int i = 0; i <arr.length ; i++){
			//���� ������ �ݺ�
			for ( int j=0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
	}
}
