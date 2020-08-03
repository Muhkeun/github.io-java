package ex1;

public class StringEx1 {

	public static void main(String[] args) {
		
		//new를 쓰면 새로운 객체를 만든다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//JVM이 같은 값이면 기존의 있던 것을 반환한다.
		//따라서 str1 == str2 에서 true 가 된다.
		//String str1 = "abc";
		//String str2 = "abc";
		
		//String: 참조형 => 같은 주소를 사용
		if(str1 == str2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		// equals: 비교하는 두 대상의 변수가 같은 값이면 true.
		if(str1.equals(str2)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
