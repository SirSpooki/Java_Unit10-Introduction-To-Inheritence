import java.util.*;

public class Student extends Person

{

private String major;

private double gpa;

Scanner input = new Scanner(System.in);

@Override

public void setData()

{

// write your code here

super.setData();

System.out.println("Enter major: ");

this.major = input.nextLine();

System.out.println("Enter GPA: ");

this.gpa = input.nextDouble();

}

@Override

public void display()

{

// write your code here

super.display();

System.out.println("Major: " + major + "GPA: " + gpa);

}

}
