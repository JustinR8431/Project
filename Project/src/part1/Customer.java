package part1;

public class Customer {

	private String firstname;
	private String lastname;

	public Customer(String firstname, String lastname) {

		this.firstname = firstname;
		this.lastname = lastname;
	}

	// Prints current firstname value
	public String getFirstName() {

		return this.firstname;
	}

	// Printes current lastname value
	public String getLastName() {

		return this.lastname;
	}

	// Changes firstname to new value
	public void setFirstName(String firstname) {

		this.firstname = firstname;
	}

	// Changes lastname to new value
	public void setLastName(String lastname) {

		this.lastname = lastname;
	}

	// Sets value for Customer println
	public String toString() {

		return firstname + " " + lastname;
	}

}
