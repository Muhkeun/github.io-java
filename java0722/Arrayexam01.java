import java.util.Arrays;
class Arrayexam01 {
	public static void main(String[] args){
	// 문제1-1. int형 5개 방의 배열을 만들고 10,20,30,40,50을 저장하고, 출력해보세요.
		
		int arr [] = {10,20,30,40,50};
		for (int i= 0; i< arr.length; i++){
			System.out.println("arr["+ i +"]: " + arr[i]);
		}

	// 문제1-2. 위 배열을 이용하여, 인덱스번호 1번과 3번안에 있는 데이터를 더한값을 출력해보세요.
		
		System.out.println("인덱스번호 1번과 3번의 데이터의 합: " + (arr[1] + arr[3]));
		
	// 문제1-3. 인덱스번호를 사용자로부터 입력받고, 해당 인덱스의 데이터를 출력해보세요.
		String indexNum = args[0];
		int indexInt = Integer.parseInt(indexNum);
		
		try{System.out.println("arr["+ indexInt + "]의 값: " + arr[indexInt]);
			}catch(Exception e){
				System.out.println("index bounds(0~4) 안의 숫자를 입력하시오");
			}
	// 문제1-4. 배열안의 모든 요소를 다 더한 값을 출력해보세요.
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		System.out.println("배열안 요소의 총 합: " + sum);  
	// 문제1-5. 배열안에 있는 값중 하나를 입력하면, 그 값이 위치한 인덱스 번호를 출력하게 만들어보세요.
		String val = args[1];
		int valNum = Integer.parseInt(val);
		
		for (int i =0; i < arr.length; i++){
			if(arr[i] == valNum){
				System.out.println("해당하는 인덱스 번호: " + i);
			}
		}

	// 문제1-6. 인덱스번호 2번과 4번방의 값을 교환해보세요.
		int temp; 
		temp = arr[2];
		arr[2] = arr[4];
		arr[4] = temp;
		System.out.println(arr[2]+ " " + arr[4]);
	// 문제1-7. (심화) 내림차순으로 정렬하세요.
		
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
		
	// 문제1-8. 아래와같은 형태의 비정방배열을 만들어 아래같이 값을 저장하고 출력하라.
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
