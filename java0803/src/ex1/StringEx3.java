package ex1;

import java.io.IOException;

public class StringEx3 {
	public static void main(String [] args) throws IOException {
		//자바의 문자열은 java.lang 패키지의 String 클래스의 인스턴스로 관리 된다.
		//파일을 내용을 읽거나, 네트워크를 통해 받은 데이터는 보통 byte[] 배열이므로 이것을
		//문자로 변환하기 위해 사용된다.
		
		//배열 전체를 String 객체로 생성
		//String str = new String(byte[]bytes);
		//지정한 문자셋으로 디코딩
		//String str = new String (byte[] bytes, String charsetName);
		
		//배열의 offset 인덱스 위치부터 length 만큼 String 객체로 생성
		//String str = new String(byte[]bytes, int offset, int length);
		//지정한 문자셋으로 디코딩
		//String str = new String(byte[] bytes, int offset, int length,
		//+ String charset);

		byte [] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		//<byte to String 예제>
		//byte형 배열을 String객체로 생성
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//6번 인덱스 부터 4까지 객체로 생성
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
System.out.println("==========================================");

		//키보드로부터 읽은 바이트 배열을 문자열로 변환하는 방법
		//System.in.read() 메소드는 키보드에서 입력한 내용을 매개값으로 주어진 바이트
		//배열에 저장하고 읽은 바이트 수를 리턴한다.
		
		//읽은 바이트를 저장하기 위한 배열 생성
		byte[] bytes2 = new byte[100];
		
		System.out.print("입력하시오: ");
		//IO exception 예외처리 해줘야함.
		//배열에서 가져1온 바이트를 저장하고 읽은 바이트 수를 리턴
		int readByteNo = System.in.read(bytes2);
		
		//배열을 문자열로 변환
		String str3 = new String(bytes2, 0, readByteNo-1);
		System.out.println(str3);
	}
} 

