package javaE_Commerce_Lab;

import java.util.Map;
import java.util.UUID;

public class Cart {

    private Customer customer;
    private UUID discountId;
    private Map<Product, Integer> productMap;


    public Cart(Customer customer) {
        this.customer = customer;
    }

    public Cart(Customer customer, UUID discountId, Map<Product, Integer> productMap) {
        this.customer = customer;
        this.discountId = discountId;
        this.productMap = productMap;
    }

    public Double calculateCartTotalAmount(){
       double totalAmount=0;
        for (Product eachProduct : productMap.keySet()) {
            totalAmount += eachProduct.getPrice() * productMap.get(eachProduct);
        }
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public UUID getDiscountId() {
        return discountId;
    }

    public void setDiscountId(UUID discountId) {
        this.discountId = discountId;
    }

    public Map<Product, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<Product, Integer> productMap) {
        this.productMap = productMap;
    }
}
