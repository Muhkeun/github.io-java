class Product {
	int price;			
	int bonusPoint;		

	Product(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);	
	}
}

class Tv extends Product {
	Tv() {
		//프로덕트 price에 100
		super(100);			
	}
	public String toString() {
		//toString() => 문자열 Tv를 리턴
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		//프로덕트에 생성자에 200
		super(200);
	}

	public String toString() {
		//컴퓨터를 리턴
		return "Computer";
	}
}

class Buyer {			
	int money = 1000;		
	int bonusPoint = 0;	

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}

		money -= p.price;			
		bonusPoint += p.bonusPoint;	
		System.out.println(p.toString() + "을/를 구입하셨습니다.");
	}
}

class PolyArgumentTest {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();

		b.buy(tv);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);
		b.buy(com);


		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}
}
