public class LabCourse extends CollegeCourse { // lab course extends college course
    // constructor to init the values
    public LabCourse(String dept, int id, double credits) {
        super(dept, id, credits);

        // adding 50 to the price as a lab fee
        super.price += 50;
    }

    // method to display the course data
    @Override
    public void display() {
        // using the super keyword to access the super class' properties and methods
        System.out.println(super.dept + super.id);
        System.out.println("Lab course");
        System.out.println(super.credits + " credits");
        System.out.println("Lab fee is $" + 50);
        System.out.println("Total fee is $" + super.price);
    }
}
