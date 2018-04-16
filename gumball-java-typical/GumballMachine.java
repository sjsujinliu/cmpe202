package gumball;

public class GumballMachine
{
    private int num_gumballs;
    private int cost;
    private int cent_in_slot;
    private boolean has_quarter_only;
    private boolean accept_quarter_only;

    public GumballMachine( int size, int cost, boolean accept_quarter_only ) {
    	this.cost = cost;
    	this.accept_quarter_only = accept_quarter_only;
        this.num_gumballs = size;
        this.cent_in_slot = 0;
        this.has_quarter_only = false;
    }

    public void insertNickel(int coin) {
    	if ( coin == 5 ) {
    		this.cent_in_slot += 5;
    		this.has_quarter_only = false;
    	}
    }
    
    public void insertDime(int coin) {
    	if ( coin == 10 ) {
    		this.cent_in_slot += 10;
    		this.has_quarter_only = false;
    	}
    }
    
    public void insertQuarter(int coin) {
        if ( coin == 25 ) {
        	this.cent_in_slot += 25;
        	this.has_quarter_only = true;
        }
    }

    public void turnCrank() {
    	if ( this.cent_in_slot > 0 ) {
        	if ( this.num_gumballs > 0 ) {
        		if (this.accept_quarter_only && !this.has_quarter_only) {
        			System.out.println( "Sorry! This machine can only accept quarters." );
        		} else {
        			if ( this.cent_in_slot == this.cost ) {
        				System.out.println( "Thanks for your coins.  Gumball Ejected!" );
        				this.cent_in_slot = 0;
        				this.num_gumballs--;
        			} else if ( this.cent_in_slot > this.cost ) {
        				System.out.println( "Thanks for your coins. " + (this.cent_in_slot - this.cost) + " cents returned.  Gumball Ejected!" );
        				this.cent_in_slot = 0;
        				this.num_gumballs--;
        			}
        		}
        	} else {
    			System.out.println( "No More Gumballs! " + (this.cent_in_slot) + " cents returned." ) ;
    		}
    	} else {
    		System.out.println( "Please insert a coin" ) ;
    	}
    }
}
