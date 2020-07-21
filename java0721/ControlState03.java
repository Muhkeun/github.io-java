class ControlState03{
	public static void main(String[] args){
		//"Hello World!"를 10번 출력하세요.
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		
		//for(초기식; 조건식; 증감식){수행문}
		//초기식 - 가장 먼저 수행하는 부분이며 두 번 다시 수행하지 않는다.
		//조건식 - 초기식 다음으로 수행하는 부분 loop가 돌 때마다 한번씩 비교
		//증감식 - 증감식은 loop를 수행할 때마다 조건식에서 비교하기 전에 항상 수행한다.
		for (int i = 0; i < 10; i=i+1){
			System.out.println("Hello World!");
		}
	}
}
