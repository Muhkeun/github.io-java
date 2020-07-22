class Array02 {
	public static void main(String[] args){
		
		int [] a = {10,20,30,40,50,60,70};

		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	
		//for ~each문 - 자바 1.5 버전 이상부터 사용
		// for(데이터타입:배열이름){수행문} - 배열이 가진 크기만큼 반복
		for(int i:a){
			System.out.println(i);
		}

		//배열의 변수는 참조 변수 - 배열이 생성되기 전 null로 초기화 가능
		//null - 주소가 없음. 아무것도 참조하고 있지 않다. 값이 없다(X)
	
		int [] b  = null;

		//null 값을 가진 상태에서 항목에 접근 불가 => NullPointerException
		//System.out.println(b.length); - NullpotinterException
		
	}
}
