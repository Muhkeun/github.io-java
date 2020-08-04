package review;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person(80110811111222L);
		Person p2 = new Person(80110811111222L);
		
	
		if(p1 == p2) {
			System.out.println("p1과 p2는 같은 사람이다");
		}else {
			System.out.println("p1과 p2는 다른 사람이다");
			
		}
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람이다");
			
		}else {
			System.out.println("p1과 p2는 다른 사람이다");
		}
	}
}
