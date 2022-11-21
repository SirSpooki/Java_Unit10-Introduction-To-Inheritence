public class TeeShirt {

private int orderNumber;

private String size;

private String color;

private double price;

public void setOrderNumber(int num) {

// write your code here

this.orderNumber = num;

}

public void setSize(String sz) {

// write your code here

this.size = sz;

if (size.equals("XXL") || size.equals("XXXL"))

price = 22.99;

else

price = 19.99;

}

public void setColor(String color) {

// write your code here

this.color = color;

}

public int getOrderNumber() {

// write your code here

return orderNumber;

}

public String getSize() {

// write your code here

return size;

}

public String getColor() {

// write your code here

return color;

}

public double getPrice() {

// write your code here

return price;

}

}
