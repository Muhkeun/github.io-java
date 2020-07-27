class Naver{
	String id = "Naver";
	private static Naver na = new Naver();
	private Naver(){}
	public static Naver getInstance(){
		return na;
	}
}
class SingleInstanceMain{
	public static void main(String[] args){
		//Naver n1 = new Naver();
		Naver n2 = Naver.getInstance();
		Naver n3 = Naver.getInstance();
		System.out.println(n2.id);
		System.out.println(n3.id);

		n2.id = "네이버";

		//똑같은 네이버가 출력됨.
		//싱글 인스턴스 패턴 - 다른 객체의 생성을 막음.
		System.out.println(n2.id);
		System.out.println(n3.id);
	}
}
