package excuteJava.Exercise1;

public class TestBank {
    public static void main(String[] args) {
        Bank VietinBank = new Bank(2000, 12);

        System.out.println("Interest is: " + VietinBank.calculateInterest());
    }
}
