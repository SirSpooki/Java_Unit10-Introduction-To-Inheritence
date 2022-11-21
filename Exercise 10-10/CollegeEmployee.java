import java.util.*;

public class CollegeEmployee extends Person

{

private String ssn;

private double annualSalary;

private String dept;

Scanner input = new Scanner(System.in);

@Override

public void setData()

{

// write your code here

super.setData();

System.out.println("Enter the ssn: ");

this.ssn = input.next();

System.out.println("Enter the annual salary: ");

this.annualSalary = input.nextDouble();

System.out.println("Enter the department name: ");

this.dept = input.next();

}

@Override

public void display()

{

// write your code here

super.display();

System.out.println("SSN: " + ssn + "Salary: $" + annualSalary + "Department: " + dept);

}

}
