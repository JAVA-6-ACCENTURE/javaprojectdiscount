package lv.lauma.shop;

public class DiscountRate {

    private static double serviceDiscountPremium = 0.2;
    private static double serviceDiscountGold = 0.15;
    private static double serviceDiscountSilver = 0.1;
    private static double productDiscountPremium = 0.1;
    private static double productDiscountGold = 0.1;
    private static double productDiscountSilver = 0.1;

    public static double getServiceDiscountRate(String type){ //atkarībā no tā kādu tipu pados, tādu vērtību atgriež
        String typeToLowerCase = type.toLowerCase(); // pārveido visu uz mazajiem burtiem
        switch (typeToLowerCase){
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }

    public static double getProductDiscountRate (String type){
        switch (type.toLowerCase()){
            case "premium":
                return serviceDiscountPremium;
            case "gold":
                return serviceDiscountGold;
            case "silver":
                return serviceDiscountSilver;
            default:
                return 0.0;
        }
    }


}
