public class Main {
    public static void main(String[] args) {

        PersonalAccount pa = new PersonalAccount(650000, "Aizirek Ibraimova");
        pa.deposit(9000);
        pa.deposit(15000);
        pa.withdraw(4000);
        pa.withdraw(3000);
        System.out.println(pa.getBalance());
        pa.printTransactionHistory();
    }
}
