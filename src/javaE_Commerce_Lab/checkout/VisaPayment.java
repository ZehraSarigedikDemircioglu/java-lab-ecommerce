package javaE_Commerce_Lab.checkout;

import javaE_Commerce_Lab.Customer;

public class VisaPayment implements CheckoutService{

    @Override
    public boolean checkout(Customer customer, Double totalAmount) {
        return false;
    }
}
