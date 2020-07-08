package lv.madara.shop;

public class DiscountRate {

    //define service discount rates:
    private static double servicePremium = 0.2;
    private static double serviceGold = 0.15;
    private static double serviceSilver = 0.1;

    //define product discount rates:
    private static double productPremium = 0.1;
    private static double productGold = 0.1;
    private static double productSilver = 0.1;

    //methods:
    public static double getServiceDiscountRate(String type) { //return double data type
        switch (type.toLowerCase()) {
            case "premium":
                return servicePremium; //if there is return, no break needed
            case "gold":
                return serviceGold;
            case "silver":
                return serviceSilver;
            default:
                return 0.0; //if customer is not a member
        }
    }

    public static double getProductDiscountRate(String type) {
        switch (type.toLowerCase()) {
            case "premium":
                return productPremium;
            case "gold":
                return productGold;
            case "silver":
                return productSilver;
            default:
                return 0.0; //if customer is not a member
        }
    }
}
