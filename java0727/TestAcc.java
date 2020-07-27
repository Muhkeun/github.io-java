class Acc {
	//public - 모든 접근 허용
	public static int a = 100;
	//같은 클래스 접근만 허용
	private static int b = 200;
	//private Acc(){}
}

class Age{
	private int age;
	//메서드를 통해서 들어가야 검사가 가능 = 유효성 검사 
	//캡슐화 - 변수에 직접 접근을 못하게 한다.
	public void setAge(int a){
		if(a > 0 && a < 150){
			this.age = a;
	}
	//다시 리턴해줄수 있는 메서드도 만들어야 한다.
	}
	public int getAge(){
		return age;
	}
}


class TestAcc {
	public static void main(String[] args){
		System.out.println(Acc.a);

		//다른 클래스에서 호출하기 때문에 할 수 없다.
		//System.out.println(Acc.b);
		
		//생성자도 마찬가지 
		//Acc ac = new Acc();

System.out.println("=============================================");

		Age ac = new Age();
		ac.setAge(50);
		System.out.println(ac.getAge());
	}
}
