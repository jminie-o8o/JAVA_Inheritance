class Cal{
	int v1,v2; //��������
	Cal(int v1,int v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
		
}

//Cal Ŭ������ Ȯ���ؼ� CalŬ������ ������ �ִ� ��� ������ �޼ҵ带 ��ӹ޴� Cal3
class Cal3 extends Cal {

	Cal3(int v1, int v2) {
		super(v1, v2);
	}
	public int minus() {
		return this.v1-v2;
	}
}
		
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal(2,1); // CalŬ������ ����ȴ�. 
		Cal3 c3 = new Cal3(2,1); //�켱 super�� �θ� Ŭ������ Cal�� ����ǰ� �� ������ Cal3�� ����ȴ�.
		System.out.println(c3.sum());
		System.out.println(c3.minus());


	}

}
