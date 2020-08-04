package ex2;

public class StringMethod1 {

	public static void main(String[] args) {
		//스트링은 문자열 추출, 비교, 찾기, 분리, 변환 등과 같은 다양한 메소드를 가지고 있다.
		
		//<문자추출>
		//String subject = "자바 프로그래밍";
		//프 => char CharValue = subject.charAt(3);
		
		String idNo = "200803-3692515";
		char sex = idNo.charAt(7);
		switch(sex){
			case '1' :
			case '3' :
				System.out.println("남자");
				break;
			case '2' :
			case '4' :
				System.out.println("여자");
				break;
		}

	}

}
 
