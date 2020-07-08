package lv.madara.shop;

public class Customer {

    //attributes
    private String name;
    private boolean member = false; //customer might not be member ar first purchase
    private String memberType;

    //constructor
    public Customer(String name) {
        this.name = name;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getMemberType() {
        return memberType;
    }

    public boolean isMember() {
        return member;
    }

    //setters:
    public void setMember(boolean member) { //here can change member to true
        this.member = member;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    //toString:
    @Override
    public String toString() {
        return "Customer: " + name + ", member: " + member + ", membership: " + memberType;
    }
}
