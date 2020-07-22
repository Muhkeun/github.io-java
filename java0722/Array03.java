class Array03 {
	public static void main(String[] args){
		//다차원배열의 2차원배열 - "자료형 배열이름[][] = new int [행의 크기][열의 크기]"
		int [][]a = new int[2][3]; 
		int b[][] = new int[3][5];

		//"자료형[][]배열명 = {초기화리스트};" - 초기화 한 상태로 생성할 수 있다.
		int [][] x = {{1,2,4},{4,5,6}};
		
		//"배열이름.length"는 행의 수를 나타낸다.
		System.out.println("a.length: " + a.length);
		System.out.println("b.length: " + b.length);

		//"배열이름[인덱스].length"는 해당 행의 열의 개수가 나온다.
		System.out.println("a[0].length: " + a[0].length);
		System.out.println("b[0].length: " + b[0].length);


		//다차원배열의 가변배열 - 길이가 서로 다른 배열
		//"자료형 배열이름[][] = new int[행][]"
		int c[][] = new int[3][]; 
		
		//"배열명[인덱스] = new 자료형[열의크기]" 로 분리 선언
		c[0] = new int[3];
		c[1] = new int[2];
		c[2] = new int[4];
		
		//행의 개수
		System.out.println("c.length: " + c.length); //4
		//가변배열은 열의 개수가 다르기 때문에 다르게 나온다.
		System.out.println("c[0].length: " + c[0].length); //3
		System.out.println("c[0].length: " + c[1].length); //2
		System.out.println("c[0].length: " + c[2].length); //4

		
		int [][] arr = {{10,20,30},{100,200,300}};
		//행의 개수로 반복
		for (int i = 0; i <arr.length ; i++){
			//열의 개수로 반복
			for ( int j=0; j < arr[i].length; j++){
				System.out.println(arr[i][j]);
			}
		}
	}
}
