import java.util.Arrays;
class Arrayexam01 {
	public static void main(String[] args){
	// ����1-1. int�� 5�� ���� �迭�� ����� 10,20,30,40,50�� �����ϰ�, ����غ�����.
		
		int arr [] = {10,20,30,40,50};
		for (int i= 0; i< arr.length; i++){
			System.out.println("arr["+ i +"]: " + arr[i]);
		}

	// ����1-2. �� �迭�� �̿��Ͽ�, �ε�����ȣ 1���� 3���ȿ� �ִ� �����͸� ���Ѱ��� ����غ�����.
		
		System.out.println("�ε�����ȣ 1���� 3���� �������� ��: " + (arr[1] + arr[3]));
		
	// ����1-3. �ε�����ȣ�� ����ڷκ��� �Է¹ް�, �ش� �ε����� �����͸� ����غ�����.
		String indexNum = args[0];
		int indexInt = Integer.parseInt(indexNum);
		
		try{System.out.println("arr["+ indexInt + "]�� ��: " + arr[indexInt]);
			}catch(Exception e){
				System.out.println("index bounds(0~4) ���� ���ڸ� �Է��Ͻÿ�");
			}
	// ����1-4. �迭���� ��� ��Ҹ� �� ���� ���� ����غ�����.
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println("�迭�� ����� �� ��: " + sum);  
	// ����1-5. �迭�ȿ� �ִ� ���� �ϳ��� �Է��ϸ�, �� ���� ��ġ�� �ε��� ��ȣ�� ����ϰ� ��������.
		String val = args[1];
		int valNum = Integer.parseInt(val);
		
		for (int i =0; i < arr.length; i++){
			if(arr[i] == valNum){
				System.out.println("�ش��ϴ� �ε��� ��ȣ: " + i);
			}
		}

	// ����1-6. �ε�����ȣ 2���� 4������ ���� ��ȯ�غ�����.
		int temp; 
		temp = arr[2];
		arr[2] = arr[4];
		arr[4] = temp;
		System.out.println(arr[2]+ " " + arr[4]);
	// ����1-7. (��ȭ) ������������ �����ϼ���.
		
		boolean status = true;
		for ( int i = 0; i < arr.length; i++){
			for (int j = i; j < arr.length; j++){
				if (arr[i] < arr[j]){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	// ����1-8. �Ʒ��Ͱ��� ������ ������迭�� ����� �Ʒ����� ���� �����ϰ� ����϶�.
	// 10	11	12 
	// 20	21
	// 30	31	32
	// 40	41	
	int [][] arr2 ={{10, 11, 12},
					{20, 21},
					{30, 31, 32},
					{40, 41}};

	//for (int i = 0; i <arr2.length; i++ ){
	//	for (int j = 0; j <arr2[i].length; j++){
	//		System.out.println(arr2[i][j]+ " ");
	//	}
	//}
		
		
	for(int [] i : arr2){
		for(int j : i){
			System.out.print(j+" ");
		}
		System.out.println();
	}

		


		

	}
}
