class Cal{
	int v1,v2; //변수선언
	Cal(int v1,int v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	public int sum() {
		return this.v1+v2;
	}
		
}

//Cal 클래스를 확장해서 Cal클래스가 가지고 있는 모든 변수와 메소드를 상속받는 Cal3
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
		Cal c = new Cal(2,1); // Cal클래스가 실행된다. 
		Cal3 c3 = new Cal3(2,1); //우선 super인 부모 클래스인 Cal이 실행되고 그 다음에 Cal3가 실행된다.
		System.out.println(c3.sum());
		System.out.println(c3.minus());


	}

}
