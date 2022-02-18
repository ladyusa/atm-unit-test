package ku.cs.atm;

public class AtmMain {
    public static void main(String[] args) {
        Bank kuBank = new Bank("KU Bank");
        Customer alice = new Customer(1, 1234, "Alice");
        Customer bob = new Customer(2, 2345, "Bob");

        kuBank.addCustomer(alice);
        kuBank.addCustomer(bob);

        System.out.println(  kuBank.validateCustomer(1, 1234)  );
        System.out.println(  kuBank.validateCustomer(5, 1234)  );
        System.out.println(  kuBank.findCustomerById(2).getName()  );
    }
}
