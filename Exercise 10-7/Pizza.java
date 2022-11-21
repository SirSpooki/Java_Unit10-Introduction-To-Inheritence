
public class Pizza {
    //private attributes
    private String description;
    private double price;

    //constructor taking values for description and price
    public Pizza(String description, double price) {
        this.description = description;
        this.price = price;
    }

    //method to display the description and price of the pizza
    public void display(){
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
    }

}

