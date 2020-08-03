package apiTest;

public class integerTest {

	public static void main(String[] args) {
		//API 사용시 확인
		//1. 필드(상수) 확인
		//2. 생성자 확인
		//3. 객체 출력
		
		//class Integer 사용
		//1. Field Summary 
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
		
		//2. Constructor Summary
		//Integer i1 = new Integer(int value);
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		
		//3. 출력
		System.out.println(i1);
		System.out.println(i2);
	}

}
