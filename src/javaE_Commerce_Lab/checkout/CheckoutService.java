package javaE_Commerce_Lab.checkout;

import javaE_Commerce_Lab.Customer;

public interface CheckoutService {

    boolean checkout(Customer customer, Double totalAmount);
}
