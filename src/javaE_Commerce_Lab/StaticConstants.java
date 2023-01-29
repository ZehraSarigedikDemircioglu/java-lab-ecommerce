package javaE_Commerce_Lab;

import javaE_Commerce_Lab.balance.Balance;
import javaE_Commerce_Lab.category.Category;
import javaE_Commerce_Lab.discount.Discount;
import javaE_Commerce_Lab.order.Order;

import java.util.ArrayList;
import java.util.List;

public class StaticConstants {

    public static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    public static final List<Category> CATEGORY_LIST = new ArrayList<>();
    public static final List<Product> PRODUCT_LIST = new ArrayList<>();

    public static final List<Balance> CUSTOMER_BALANCE_LIST = new ArrayList<>();

    public static final List<Balance> GIFT_CARD_BALANCE_LIST = new ArrayList<>();

    public static final List<Discount> DISCOUNT_LIST = new ArrayList<>();

    public static final List<Order> ORDER_LIST = new ArrayList<>();
}
