package review;

public class Tv {
	private String brand;
	public Tv(String brand){
		this.brand = brand;
	}
	//equals 오버라이딩
	public boolean equals(Object obj) {	
		boolean result = false;
		//obj가 널이 아닐때 && obj가 Tv를 상속하는가
		if(obj != null) {
			if(obj instanceof Tv) {
			
				// this.brand와 매개변수의 brand와 비교
				Tv t = (Tv)obj;
				result = brand == t.brand; 
			}
		}
		return result;
	}
}
