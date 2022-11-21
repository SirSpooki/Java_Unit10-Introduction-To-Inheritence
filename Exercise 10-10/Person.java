import java.util.*;

public class Person

{

private String firstName;

private String lastName;

public String address;

private String zip;

private String phone;

Scanner input = new Scanner(System.in);

public void setData()

{

System.out.println("Enter first name: ");

this.firstName = input.nextLine();

System.out.println("Enter last name: ");

this.lastName = input.nextLine();

System.out.println("Enter address: ");

this.address = input.nextLine();

System.out.println("Enter zip: ");

this.zip = input.nextLine();

System.out.println("Enter phone: ");

this.phone = input.nextLine();

}

public void display()

{

// write your code here

System.out.println(firstName + " " + lastName + " " + address + " " + zip + " " + phone);

}

}
