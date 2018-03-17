package part1;

import part1.Customer;
import part1.MailingAddress;

public class CustomerDriver {

	public static void main(String[] args) {
		// Instantiate customer and mailingaddress class
		// Set initial values
		Customer customer = new Customer("Joe", "Rockhead");
		MailingAddress mailingaddress = new MailingAddress("456 Juicebox Dr.", "Greenville SC", "29611");

		// Print first name and last name and the city of the customer
		System.out.println(
				customer.getFirstName() + " " + customer.getLastName() + " lives in " + mailingaddress.getCity());
		mailingaddress.getAddress();

		// Print customer and mailing address
		System.out.println("\n" + customer + " " + mailingaddress);

		// Set all initial values to new values
		customer.setFirstName("Coco");
		customer.setLastName("Jericho");
		mailingaddress.setAddress("285 Roshambeau Ln.");
		mailingaddress.setCity("Charlotte NC");
		mailingaddress.setZip("28222");

		// Print the new customer name and the city the customer lives in
		System.out.println("\n" + customer.getFirstName() + " " + customer.getLastName() + " lives in "
				+ mailingaddress.getCity());

		// Print the new customer and mailing address
		System.out.println("\n" + customer + " " + mailingaddress);
	}

}
