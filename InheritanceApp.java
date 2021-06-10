
class Cal{
	public int sum(int v1,int v2){
		return v1+v2;
	}
}
//Cal 클래스를 확장해서 Cal클래스가 가지고 있는 모든 변수와 메소드를 상속받는 Cal3
class Cal3 extends Cal {
	
}
public class InheritanceApp {

	public static void main(String[] args) {
		Cal c = new Cal();
		System.out.println(c.sum(2,1));
		
		Cal3 c3 = new Cal3();
		System.out.println(c3.sum(3, 1));
		

	}

}
