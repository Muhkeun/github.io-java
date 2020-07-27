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

		n2.id = "���̹�";

		//�Ȱ��� ���̹��� ��µ�.
		//�̱� �ν��Ͻ� ���� - �ٸ� ��ü�� ������ ����.
		System.out.println(n2.id);
		System.out.println(n3.id);
	}
}
