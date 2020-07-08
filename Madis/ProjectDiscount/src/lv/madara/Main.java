package lv.madara;

import lv.madara.shop.Visit;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //testing customer visits with getCustomer():
        Visit visit1 = new Visit("Inese", new Date()); //create visit for customer1
        visit1.getCustomer().setMember(true);
        visit1.getCustomer().setMemberType("premium");
        visit1.setServiceExpense(60);
        visit1.setProductExpense(30);
        System.out.println(visit1.getCustomer().toString());
        System.out.println(visit1);
        System.out.println("-------------------------");


        Visit visit2 = new Visit("Santa", new Date());
        visit2.getCustomer().setMember(true);
        visit2.getCustomer().setMemberType("gold");
        visit2.setServiceExpense(60);
        visit2.setProductExpense(30);
        System.out.println(visit2.getCustomer().toString());
        System.out.println(visit2);
        System.out.println("--------------------------");


        Visit visit3 = new Visit("Ieva", new Date());
        visit3.getCustomer().setMember(true);
        visit3.getCustomer().setMemberType("Silver");
        visit3.setServiceExpense(60);
        visit3.setProductExpense(30);
        System.out.println(visit3.getCustomer().toString());
        System.out.println(visit3);
        System.out.println("----------------------------");


        Visit visit4 = new Visit("Marta", new Date());
        visit4.getCustomer().isMember();
        visit4.getCustomer().getMemberType();
        visit4.setServiceExpense(60);
        visit4.setProductExpense(30);
        System.out.println(visit4.getCustomer().toString());
        System.out.println(visit4);
    }
}
