
public class Orders {
  private int order_id;
  private String customer_name;
  private String product_name;
  private String category;
  private int quantity;
  private double price;
  private String status;

  
  public Orders(int order_id,String customer_name,String product_name,String category,int quantity,double price,String status){
    this.order_id = order_id;
    this.customer_name = customer_name;
    this.product_name = product_name;
    this.category = category;
    this.quantity = quantity;
    this.price = price;
    this.status = status;
  }
  public int getOrder_id() {
    return order_id;
}

public String getCustomer_name() {
    return customer_name;
}

public String getProduct_name() {
    return product_name;
}

public String getCategory() {
    return category;
}

public int getQuantity() {
    return quantity;
}

public double getPrice() {
    return price;
}

public String getStatus() {
    return status;
}

  
 
}
