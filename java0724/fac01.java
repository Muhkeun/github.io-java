class fac01 {
	public static void main(String[] args){
		//메서드 호출
		System.out.println(factorial(4));

	}

	static long factorial(int n){
		long result = 0;
		if (n == 1){
			result = 1;
			
		//result는 호출한 지점을 돌아간다.
		} else {
			System.out.println(n);
			result = n * factorial(n-1);
		}
		return result;
	}

}
