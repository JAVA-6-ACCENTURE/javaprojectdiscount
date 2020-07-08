package lv.madara.shop;

import java.util.Date;

public class Visit { //no need to extend class, Customer(as data type) contains all info

    //attributes
    private Customer customer; //Customer class as data type
    private Date date;
    private double serviceExpense;
    private double productExpense;

    //constructor:
    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    //getters and setters:
    public String getName() {
        return customer.getName();
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceExpense() {
        if (customer.isMember()) {
            if (customer.getMemberType().equalsIgnoreCase("premium")) {
                return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate("premium"));
            }
            if (customer.getMemberType().equalsIgnoreCase("gold")) {
                return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate("gold"));
            }
            if (customer.getMemberType().equalsIgnoreCase("silver")) {
                return this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate("silver"));
            } else return this.serviceExpense;
        } else
            return this.serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        if (customer.isMember()) {
            if (customer.getMemberType().equalsIgnoreCase("premium")) {
                return this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate("premium"));
            }
            if (customer.getMemberType().equalsIgnoreCase("gold")) {
                return this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate("gold"));
            }
            if (customer.getMemberType().equalsIgnoreCase("silver")) {
                return this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate("silver"));
            } else return this.productExpense;
        } else
            return this.productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    //create method for totalExpense:
    public double getTotalExpense() {
        return this.getServiceExpense() + this.getProductExpense();
    }

    //toString + get total Expense:
    @Override
    public String toString() {
        return "Visit information:\n" +
                "1.Customer name: " + customer.getName() + "\n" +
                "2.Visit date: " + date + "\n" +
                "3.Service expense: " + this.getServiceExpense() + " EUR\n" +
                "4.Product expense: " + this.getProductExpense() + " EUR\n" +
                "5.Total expense: " + this.getTotalExpense() + " EUR.";
    }
}
