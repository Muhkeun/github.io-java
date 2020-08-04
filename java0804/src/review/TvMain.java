package review;

public class TvMain {

	public static void main(String[] args) {
		Tv t1 = new Tv("삼성");
		Tv t2 = new Tv("LG");
		//TV t2= new Tv("삼성");
		
		
		// t1의 equals 메서드에 t2를 대입한다.
		if(t1.equals(t2)) {
			System.out.println("같은 TV 브랜드");
		} else {
			System.out.println("다른 TV 브랜드");
		}
	}

}
