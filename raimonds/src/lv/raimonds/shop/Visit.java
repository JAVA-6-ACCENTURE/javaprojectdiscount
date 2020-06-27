package lv.raimonds.shop;

import java.util.Date;

public class Visit {

    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date){
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense(){
        if(customer.isMember()){
            if("platinum".equalsIgnoreCase(customer.getMemberType())){
                return this.serviceExpense * DiscountRate.getProductDiscountRate("platinum");
            }else if("gold".equalsIgnoreCase(customer.getMemberType())){
                return this.serviceExpense * DiscountRate.getProductDiscountRate("gold");
            }else if("silver".equalsIgnoreCase(customer.getMemberType())){
                return this.serviceExpense * DiscountRate.getProductDiscountRate("silver");
            }else{
                return this.serviceExpense;
            }
        }else{
            return this.serviceExpense;
        }
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
}
