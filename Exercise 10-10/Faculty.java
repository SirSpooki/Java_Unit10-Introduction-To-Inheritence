import java.util.*;

public class Faculty extends CollegeEmployee

{

private boolean isTenured = false;

Scanner input = new Scanner(System.in);

@Override

public void setData()

{

// write your code here

super.setData();

System.out.println("Is the family member tenured: ");

this.isTenured = input.nextBoolean();

}

@Override

public void display()

{

// write your code here

super.display();

if(isTenured == true)

{

System.out.println("Family member is tenured");

}

else

{

System.out.println("Family member is not tenured");

}

}

}
