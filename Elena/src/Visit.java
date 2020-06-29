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

    public double getServiceExpense() {
        if (customer.isMember()) {
            if (customer.getMemberType().equalsIgnoreCase("premium")) {
                return this.serviceExpense * (1.0 - DiscountRate.getServiceDiscountRate("premium"));
            }
            if (customer.getMemberType().equalsIgnoreCase("gold")) {
                return this.serviceExpense * (1.0 - DiscountRate.getServiceDiscountRate("gold"));
            }
            if (customer.getMemberType().equalsIgnoreCase("silver")) {
                return this.serviceExpense * (1.0 - DiscountRate.getServiceDiscountRate("silver"));
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
                return this.productExpense * (1.0 - DiscountRate.getProductDiscountRate("premium"));
            }
            if (customer.getMemberType().equalsIgnoreCase("gold")) {
                return this.productExpense * (1.0 - DiscountRate.getProductDiscountRate("gold"));
            }
            if (customer.getMemberType().equalsIgnoreCase("silver")) {
                return this.productExpense * (1.0 - DiscountRate.getProductDiscountRate("silver"));
            } else return this.productExpense;
        } else
            return this.productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return this.getServiceExpense() + this.getProductExpense();
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ",\n date=" + date +
                ",\n serviceExpense=" + this.getServiceExpense() +
                ", productExpense=" + this.getProductExpense() +
                ", totalExpense=" + this.getTotalExpense() +
                '}';
    }

    //added for testing purposes; wasn't in UML
    public Customer getCustomer() {
        return customer;
    }
}
