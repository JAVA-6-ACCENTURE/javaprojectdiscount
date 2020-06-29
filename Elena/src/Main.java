import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Visit visit1 = new Visit("Kate", new Date());
        visit1.getCustomer().setMember(true);
        visit1.getCustomer().setMemberType("Gold");

        visit1.setProductExpense(20);
        visit1.setServiceExpense(50);
        System.out.println(visit1 + "\n");

        Visit visit2 = new Visit("Layla", new Date());
        visit2.getCustomer().setMember(true);
        visit2.getCustomer().setMemberType("premium");

        visit2.setProductExpense(20);
        visit2.setServiceExpense(50);
        System.out.println(visit2 + "\n");

        Visit visit3 = new Visit("Anna", new Date());
        visit3.getCustomer().setMember(true);
        visit3.getCustomer().setMemberType("SilVER");

        visit3.setProductExpense(20);
        visit3.setServiceExpense(50);
        System.out.println(visit3 + "\n");

        Visit visit4 = new Visit("Madara", new Date());

        visit4.setProductExpense(20);
        visit4.setServiceExpense(50);
        System.out.println(visit4 + "\n");

    }
}
