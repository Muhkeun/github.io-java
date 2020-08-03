package ex1;

public class StringEx2 {

	public static void main(String[] args) {
		String s1 = "  abc  ";
		String msg = null;
		
		msg = s1.replace("a", "b");
		System.out.println("msg: " + msg);
		
		msg = s1.toUpperCase();
		System.out.println("msg: " + msg);
		
		msg = s1.trim();
		System.out.println("msg: " + msg);

	}

}
