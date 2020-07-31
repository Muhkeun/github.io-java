//예외(Exception)
//사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인한 오류
//예외가 발생되면 프로그램 종료
//예외 처리 추가하면 정상 실행 상태로 돌아갈 수 있음

//try- catch- finally - 예외 처리 코드
//일반예외 - 예외 처리 코드가 없으면 컴파일 오류
//실행예외 - 컴파일 O, 개발자의 경험에 의해 작성

class ExceptionMain{
	public static void main(String[]args){
		
		//오류가 발생할 것 같은 부분을 try 블럭에 작성
		try{
			System.out.println(args[0]);

		//try 내에서 오류가 발생하면 해결하는 곳
		//예외 종류에 따라 처리 해줘야 하지만
		//상속되는 예외는 Exception으로 모두 처리 가능 (다형성)
		
		//맞지 않는 예외는 처리 하지 못한다.
		}catch(NullPointerException e){
			System.out.println("ctrl + 3번으로 실행하세요");
		//catch를 여러개 두어 상황에 맞게 처리 가능
		//조상 클래스 일수록 아래쪽에 처리
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ctrl + 3번으로 실행하세요");
		//항상 실행
		}finally{
			System.out.println("종료");
		}

	}
}
