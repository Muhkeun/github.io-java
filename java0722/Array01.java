class Array01 {
	public static void main(String[] args){
		//배열 - 여러 개의 값 저장
		//배열 선언 - "자료형 [] 배열명;" , "자료형 배열명 []"
		//배열에 메모리 할당 - "배열명 - new 자료형[개수]" => 모두 기본값으로 초기화
		//* Heap 메모리는 할당되는 순간 초기값이 없으면 기본값으로 초기화
		int a[] = new int[5];
		int b[] = new int[10];
		
		//배열의 메모리 주소 출력
		System.out.println(a);
		System.out.println(b);
		
		//배열은 배열에 대입 할 수 있다 - 메모리 값을 참조하고 있다.
		//garbege collection에 의해 남는 메모리는 삭제된다.
		b=a;
		//b의 주소가 a의 주소로 출력된다.
		System.out.println(a);
		System.out.println(b);

		a[0] = 100;
		a[1] = 200;
		a[2] = 300;

		//배열 출력
		System.out.print("a[0]: " + a[0]+"\n");
		System.out.print("a[1]: " + a[1]+"\n");
		System.out.print("a[2]: " + a[2]+"\n");
		System.out.print("b[0]: " + b[0]+"\n");
		System.out.print("b[1]: " + b[1]+"\n");
		System.out.print("b[2]: " + b[2]+"\n");
		
		//배열 요소를 사용할 때 잘못된 인덱스를 사용하면 ArrayIndexOutOfBoundsException이 발생.
		//b배열이 a배열의 주소를 가져가기 때문에 b[6] 값을 대입하면 에러가 뜨는 것을 알 수 있다.
		//System.out.print(b[6]);
		
		//"자료형 배열명[] = {데이터나열} => 나열된 데이터를 가지고 생성하는 것. 배열을 처음 생성할 때만 사용가능
		//"자료형 배열명[] = new 자료형[] {데이터나열} = 나열된 데이터를 가지고 생성
		int c[] = {10,20,30,40,50};
		System.out.print("c[0]: " + c[0]+"\n");
		System.out.print("c[1]: " + c[1]+"\n");
		System.out.print("c[2]: " + c[2]+"\n");
		System.out.print("c[3]: " + c[3]+"\n");
		
		//배열의 데이터 개수는 length라는 속성으로 제공 - 배열명.length
		//배열에 메모리 할당이 이루어져 있지 않으면 NullPointerException
		
		System.out.print("a배열의 개수:" + a.length +"\n");
		System.out.print("b배열의 개수:" + b.length +"\n");
		System.out.print("c배열의 개수:" + c.length +"\n");

	}
}
