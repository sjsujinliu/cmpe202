package gumball;

public class Main {

	public static void main(String[] args) {
		//GumballMachine(
		//					[number of gum balls in the machine],
		//					[how many cents it costs],
		//					[accept quarters only?]
		//				);
		GumballMachine gumballMachine = new GumballMachine(5, 50, true);

		gumballMachine.insertDime( 10 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertDime( 10 );
		gumballMachine.insertNickel( 5 );
		gumballMachine.turnCrank();
		
		gumballMachine.insertQuarter( 25 );
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
	}
}