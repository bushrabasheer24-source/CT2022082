package Q4;

public class Main {
    public static void main(String[] args) {

        Owner o1 = new Owner("Ali", "0771234567");

        Bicycle b1 = new Bicycle(o1);

        System.out.println("Owner Name: " + b1.getOwner().getOwnerName());
        System.out.println("Phone Number: " + b1.getOwner().getPhoneNo());
    }
}
