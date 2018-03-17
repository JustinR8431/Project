package part1;

public class MailingAddress {

	private String address;
	private String city;
	private String zip;

	public MailingAddress(String address, String city, String zip) {

		this.address = address;
		this.city = city;
		this.zip = zip;
	}

	// Returns current address value
	public String getAddress() {

		return this.address;
	}

	// Returns current city value
	public String getCity() {

		return this.city;
	}

	// Returns current zip value
	public String getZip() {

		return this.zip;
	}

	// Sets address to new value
	public void setAddress(String address) {

		this.address = address;
	}

	// Sets city to new value
	public void setCity(String city) {

		this.city = city;
	}

	// Change zip to new value
	public void setZip(String zip) {

		this.zip = zip;
	}

	// Sets value for MailingAddress println
	public String toString() {

		return address + " " + city + " " + zip;
	}
}
