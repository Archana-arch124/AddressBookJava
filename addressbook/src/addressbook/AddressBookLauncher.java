package addressbook;

import java.util.Scanner;

public class AddressBookLauncher {
	 // class variable
	    static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws Exception 
	    {
	        AddressBook addressBook = new AddressBook();
	        while (true) 
	        {
	            System.out.println("--------------ENTER-------------");
	            System.out.println("1-Create a new contact");
	            System.out.println("2-Fill contact details");
	            System.out.println("3-Print all contacts");
	            System.out.println("4-View  contact information");
	            System.out.println("5-Edit contact information");
	            System.out.println("6-Delete contact information");
	            System.out.println("7-Quit");
	            System.out.print("Enter option:");
	            String option = scanner.nextLine().trim().toLowerCase();
	            switch (option) 
	            {
	                case "1":
	                    addressBook.createNewContact();
	                    break;
	                case "2":
	                    addressBook.fillContactDetails();
	                    break;
	                case "3":
	                    addressBook.displayAllContacts();
	                    break;
	                case "4":
	                    addressBook.viewContactInfo();
	                    break;
	                case "5":
	                    addressBook.editContactInfo();
	                    break;
	                case "6":
	                    addressBook.deleteContact();
	                    break;
	                case "7":
	                    System.out.println("quiting....!");
	                    System.exit(0);
	                default:
	                    System.out.println("please enter the correct choice");
	                    break;
	            }

	        }
	    }
}
