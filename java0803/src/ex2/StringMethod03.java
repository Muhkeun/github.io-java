package ex2;

public class StringMethod03 {

	public static void main(String[] args) {
		String subject = "200803-3456789";
		
		//"문자열".length => 문자열의 길이 (공백포함)
		System.out.println(subject.length());
		
		//"문자열".replace(old 문자열, new 문자열) => 문자열 대치
		System.out.println(subject.replace("200803", "930803"));
		
		
		//"문자열".substring(int value1, int value2) = value1 인덱스부터 value2까지 문자열 추출  
		//"문자열".substring(int value) = value 인덱스부터 문자열 추출 
		System.out.println(subject.substring(0,6));
		System.out.println(subject.substring(7));
		
		//"문자열".toLowerCase() => 문자열 소문자 변경
		//"문자열".toUpperCase() => 문자열 대문자 변경
		//"문자열".trim() => 좌우 공백 제거하기
		
		String subject2 = " KoReA ";
		System.out.println(subject2.toLowerCase());
		System.out.println(subject2.toUpperCase());
		System.out.println(subject2.trim());
		
	}

}
