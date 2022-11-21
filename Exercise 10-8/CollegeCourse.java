public class CollegeCourse {
    // protected data fields so that they can be accessed in subclasses as well. We need to access these properties in the subclass so that we can display the data and update the data as we don't have dedicated mutator and accessor methods
    protected String dept;
    protected int id;
    protected double credits;
    protected double price;

    // constructor to init the values
    public CollegeCourse(String dept, int id, double credits) {
        // assigning the values
        this.dept = dept;
        this.id = id;
        this.credits = credits;

        // calculating and assigning the fees
        price = credits * 120;
    }

    // method to display the course data
    public void display() {
        System.out.println(dept + id);
        System.out.println("Non-lab course");
        System.out.println(credits + " credits");
        System.out.println("Total fee is $" + price);
    }
}
