interface Calculable{
	double PI = 3.1415;
	int sum(int v1,int v2);
}
interface Printable{
	void print();
}

//�ϳ��� Ŭ������ �������� �������̽��� ������ �� �ִ�.
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1 + v2;
	}

	public void print() {
		System.out.println("This is RealCal!!!");
		
	}
	
}
class DummyCal implements Calculable{
	public int sum(int v1,int v2) {
		return 3;
	}
}

public class InterfaceApp {

	public static void main(String[] args) {
		Calculable c1 = new RealCal();
		System.out.println(c1.sum(1, 100));
//		c1.print(); c1�� ������ Calculable �̹Ƿ� print() �޼ҵ忡 �Ҽӵ� ����� ������� ���Ѵ�.
		System.out.println(c1.PI);

	}

}
