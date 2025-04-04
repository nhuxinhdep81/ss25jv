package Ex1;

public class Main {
    public static void main(String[] args) {
        Account account1 = Account.getInstance();
        account1.setId(1);
        account1.setName("Le Dien Tien");
        account1.setAge(20);

        Account account2 = Account.getInstance();
        System.out.println("account1 hashCode: " + account1.hashCode());
        System.out.println("account2 hashCode: " + account2.hashCode());

        if (account1 == account2) {
            System.out.println("=trung di chi => chi co 1 the hien duy nhat");
        } else {
            System.out.println("ko trung dia chi");
        }
    }
}

