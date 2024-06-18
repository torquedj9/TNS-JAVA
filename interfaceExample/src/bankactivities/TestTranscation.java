package bankactivities;

public class TestTranscation   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		acc.setAccname("wolf");
		acc.setEmail("wolfx9@gmail.com");
		acc.setBalance(7000);
		
		
		
		Transcation tcs = new Transcation();
		tcs.deposite(acc, 5000);
		
		System.out.println(acc);
		
		
		tcs.withdraw(acc, 2000);
		
		System.out.println(acc);
	}

}
