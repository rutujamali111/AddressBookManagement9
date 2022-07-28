import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	Scanner s = new Scanner(System.in);
	ArrayList<Contacts> list = new ArrayList<Contacts>();
	
	public void add() {
		Contacts person1 = new Contacts();
		Address address = new Address();
		System.out.println("Enter the First name:");
		String fname = s.next();
		person1.setFname(fname);

		System.out.println("Enter the Last name:");
		String lname = s.next();
		person1.setLname(lname);

		System.out.println("Enter the Phone Number:");
		Long phone = s.nextLong();
		person1.setPhonenumber(phone);

		System.out.println("Enter the City:");
		String city = s.next();
		address.setCity(city);

		System.out.println("Enter the Zip:");
		long zip = s.nextLong();
		address.setZip(zip);

		System.out.println("Enter the State:");
		String state = s.next();
		address.setState(state);
		person1.setAddress(address);
		list.add(person1);
		System.out.println("Contact added into book");

	}
	public void edit() {
		System.out.println("Enter your First name:");
		String fname = s.next();

		Iterator<Contacts> iterator = list.listIterator();

		while (iterator.hasNext()) {
			Contacts person = iterator.next();

			if (fname.equals(person.getFname())) {
				Address address = person.getAddress();
				System.out.println("Choose field you want to add:");
				System.out
						.println("1.Last Name\t2.Phone Number\t3.City\t4.Zip\t5. State");
				switch (s.nextInt()) {
				case 1:
					System.out.println("Re-Correct your lastname");
					person.setLname(s.next());
					break;
				case 2:
					System.out.println("Re-Correct your Phone Number");
					person.setPhonenumber(s.nextLong());
					break;
				case 3:
					System.out.println("Re-Correct your City");
					address.setCity(s.next());
					break;
				case 4:
					System.out.println("Re-Correct your Zip");
					address.setZip(s.nextLong());
					break;
				case 5:
					System.out.println("Re-Correct your State");
					address.setState(s.next());
					break;
				}

			}
		}
		System.out.println("contact Edited");

	}
	public void delete() {
		System.out.println("Enter your First name:");
		String fname = s.next();

		Iterator<Contacts> iterator = list.listIterator();
		while (iterator.hasNext()) {
			Contacts person = iterator.next();

			if (fname.equals(person.getFname())) {
				list.remove(person);
			}
		}
		System.out.println("contact deleted");
	}
		

}
