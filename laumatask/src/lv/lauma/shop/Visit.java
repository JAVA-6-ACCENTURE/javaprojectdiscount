package lv.lauma.shop;


import javax.xml.crypto.Data;
import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        if (customer.isMember()) {
            if ("platinum".equalsIgnoreCase(customer.getMemberType())) {
                return this.serviceExpense * DiscountRate.getServiceDiscountRate("platinum");
            } else if ("gold".equalsIgnoreCase(customer.getMemberType())) {
                return this.serviceExpense * DiscountRate.getServiceDiscountRate("gold");
            } else if ("silver".equalsIgnoreCase(customer.getMemberType())) {
                return this.serviceExpense * DiscountRate.getServiceDiscountRate("silver");
            } else {
                return this.serviceExpense;
            }
        } else {
            return this.serviceExpense;
        }
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        if (customer.isMember()) {
            if ("platinum".equalsIgnoreCase(customer.getMemberType())) {
                return this.productExpense * DiscountRate.getProductDiscountRate("platinum");
            } else if ("gold".equalsIgnoreCase(customer.getMemberType())) {
                return this.productExpense * DiscountRate.getProductDiscountRate("gold");
            } else if ("silver".equalsIgnoreCase(customer.getMemberType())) {
                return this.productExpense * DiscountRate.getProductDiscountRate("silver");
            } else {
                return this.productExpense;
            }
        } else {
            return this.productExpense;
        }
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return this.serviceExpense + this.productExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}