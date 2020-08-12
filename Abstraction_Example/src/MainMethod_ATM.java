
public class MainMethod_ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank axis = new AxisBank("1234", 2500, 500);
		AxisBank axis1 = new AxisBank("1234", 0, 1800);
		
		SyndicateBank syndicate = new SyndicateBank("5678", 1000, 25); 
		// in the above it will process withdrawal + deposit methods because the account number(5678) matches,
		// but it cannot retrieve mini-stmt balance because the Account number is diff i.e. 5673 given
		// output = 25975
		
		SyndicateBank syndicate2 = new SyndicateBank("5673", 1000, 2500); 
		
		System.out.println(axis.miniStmt());
		System.out.println(axis1.miniStmt());
		
		System.out.println(syndicate.miniStmt());
		System.out.println(syndicate2.miniStmt());
		
	}

}
