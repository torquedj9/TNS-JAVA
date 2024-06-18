package abstractExample;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// can not create object of abstract class
		
		//MyTest mt = new MyTest();  
		
		Addition ad = new Addition();
		ad.showResult();

		
		
		Sub s1 =  new Sub(43.7f,16.4f);
		s1.showResult();
}
}