package ex1;

public class StringEx2 {

	public static void main(String[] args) {
		String s1 = "  abc  ";
		String msg = null;
		//문자열 대치
		msg = s1.replace("a", "b");
		System.out.println("msg: " + msg);
		//대문자 변경
		msg = s1.toUpperCase();
		System.out.println("msg: " + msg);
		//좌우 공백 없애기
		msg = s1.trim();
		System.out.println("msg: " + msg);

	}

}
