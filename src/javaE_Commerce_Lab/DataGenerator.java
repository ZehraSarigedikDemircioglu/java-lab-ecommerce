package javaE_Commerce_Lab;

import javaE_Commerce_Lab.balance.Balance;
import javaE_Commerce_Lab.balance.CustomerBalance;
import javaE_Commerce_Lab.balance.GiftCardBalance;
import javaE_Commerce_Lab.category.Category;
import javaE_Commerce_Lab.category.Electronic;
import javaE_Commerce_Lab.category.Furniture;
import javaE_Commerce_Lab.category.SkinCare;
import javaE_Commerce_Lab.discount.AmountBasedDiscount;
import javaE_Commerce_Lab.discount.Discount;
import javaE_Commerce_Lab.discount.RateBasedDiscount;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataGenerator {

    public static void createCustomer(){

        Address address1Customer1 = new Address("7925", "streetname", "line1", "22102", "VA");
        Address address2Customer1 = new Address("825", "streetname", "line2", "22036", "VA");
        Address address1Customer2 = new Address("5924", "streetname", "line", "22044", "VA");

        List<Address> customer1AddressList = new ArrayList<>();
        customer1AddressList.add(address1Customer1);
        customer1AddressList.add(address2Customer1);

        Customer customer1 = new Customer(UUID.randomUUID(), "mike", "mike@cydeo.com");
        Customer customer2 = new Customer(UUID.randomUUID(), "ozzy", "ozzy@cydeo.com", customer1AddressList);

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);

    }

    public static void createProduct(){

        Product product1 = new Product(UUID.randomUUID(), "PS5", 2300.72, 7, 7, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(), "XB9", 100.5, 15, 15, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3 = new Product(UUID.randomUUID(), "Chair", 39.4, 43, 43, StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4 = new Product(UUID.randomUUID(), "Milk", 2.6, 185, 185, UUID.randomUUID());

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);

    }
    public static void createCategory(){

        Category category1 = new Electronic(UUID.randomUUID(), "Electronic");
        Category category2 = new Furniture(UUID.randomUUID(), "Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(), "Skincare");

        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);

    }

    public static void createBalance(){

        Balance customerBalance = new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 450.00);
        Balance giftCardBalance = new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(1).getId(), 500.00);

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }

    public static void createDiscount(){

        Discount amountBased = new AmountBasedDiscount(UUID.randomUUID(), "Buy 250 Free 50", 250.00, 50.00);
        Discount rateBased = new RateBasedDiscount(UUID.randomUUID(), "Buy 500 Free %15", 500.00, 15.00);

        StaticConstants.DISCOUNT_LIST.add(amountBased);
        StaticConstants.DISCOUNT_LIST.add(rateBased);
    }

}
