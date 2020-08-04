package review;

public class Person {
	long id;
	//equals를 오버라이딩
	public boolean equals(Object obj) {
		// obj는 널이아니고 Person을 상속하는가?
		if(obj != null && obj instanceof Person) {
			//p1.id == p2.id 를 리턴
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	Person(long id){
		this.id = id;
	}
}
