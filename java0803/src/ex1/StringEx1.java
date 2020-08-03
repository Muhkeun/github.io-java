package ex1;

public class StringEx1 {

	public static void main(String[] args) {
		
		//<문자열 비교>
		//String strVar1 = new String("홍길동");
		//String strVar2 = "홍길동";
		//String strVar3 = "홍길동";
		//자바는 문자열 리터럴이 동일하다면 동일한 String 객체를 참조하도록 되어 있다.
		//그래서 strVar2 와 strVar3는 동일한 String 객체를 참조한다.
		
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
