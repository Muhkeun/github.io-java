package ex2;

import java.io.UnsupportedEncodingException;

public class StringMethod02 {

	public static void main(String[] args) {
		//<바이트 배열로 변환>
		//byte [] bytes = "문자열".getBytes();
		//byte [] bytes = "문자열".getBytes(Charset charset);
		//getByte 메소드 : 시스템의 기본 문자셋으로 인코딩된 바이트 배열을 리턴
		
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes();
		//UTF - 8에서는 한글을 3byte, 영어를 1byte로 변환한다.
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1 => String: "+ str1);
		
		// 잘못된 문자셋을 매개값으로 줄 경우 java.io.UnsupportedEncodingException이 발생
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			//EUC-KR 에서는 한글을 2byte, 영어를 1byte로 변환한다.
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 => String: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3 => String: " + str3);
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
