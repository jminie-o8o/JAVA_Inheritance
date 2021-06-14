interface Calculable{
	double PI = 3.1415;
	int sum(int v1,int v2);
}
interface Printable{
	void print();
}

//하나의 클래스는 여러개의 인터페이스를 구현할 수 있다.
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
//		c1.print(); c1의 형식이 Calculable 이므로 print() 메소드에 소속된 기능은 사용하지 못한다.
		System.out.println(c1.PI);

	}

}
