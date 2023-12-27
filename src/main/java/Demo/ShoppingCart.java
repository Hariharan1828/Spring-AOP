package Demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
  public void assist(String status ){
      System.out.println("Shoppingcart welcome "+status);
  }
}
