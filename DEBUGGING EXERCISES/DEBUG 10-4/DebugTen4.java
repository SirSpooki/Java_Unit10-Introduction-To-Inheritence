public class DebugTen4
{
   public static void main(String args[])
   {
      int id = 12241;
      String name = "Franklin";
      double credit = 1000.00;
      double purchase = 1325.77;
      DebugCustomerMakingPurchase cust = new
         DebugCustomerMakingPurchase(id, name, credit, purchase);
      cust.display();
      
      // new code to test successful purchase
      System.out.println("\n");
      double testPurchase = 900.00;
      DebugCustomerMakingPurchase testCust = new DebugCustomerMakingPurchase(id, name, credit, testPurchase);
      testCust.display();  
   }
}
