package lv.lauma;

import lv.lauma.shop.Customer;
import lv.lauma.shop.Visit;

import java.sql.SQLOutput;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Ieva");
        customer1.setMember(true);
        customer1.setMemberType("premium");

        System.out.println(customer1.toString());

        Visit visit1 = new Visit("Jānis", 05-06-2020);
        visit1.setProductExpense(500.66);
        visit1.setServiceExpense(100.66);

        System.out.println(visit1.getServiceExpense());
        System.out.println(visit1.getServiceExpense());
        System.out.println(visit1.getTotalExpense());
        System.out.println(visit1.toString());




    }
}
