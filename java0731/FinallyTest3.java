class FinallyTest3{
	public static void main(String []args){
		method1();
		System.out.println("method1() 수행을 마치고 main 메서드로 돌아왔습니다.");
	}
	static void method1(){
		try{
			System.out.println("method1()이 호출 되었습니다.");
			return;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//return이 있어 종료가 되어도 finally는 무조건 실행!! 
			System.out.println("method1()의 finally 블럭이 실행 되었습니다.");
		}
	}
}
	