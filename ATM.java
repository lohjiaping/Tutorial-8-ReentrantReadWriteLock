package Week_08;

public class ATM {
    public static void main(String[] args) {

        BankAccountWithLock account = new BankAccountWithLock(1000);

        Thread t1 = new Thread(() -> account.deposit(550), "Thread-1");
        Thread t2 = new Thread(() -> account.withdraw(350), "Thread-2");
        Thread t3 = new Thread(() -> account.getBalance(), "Thread-3");
        Thread t4 = new Thread(() -> account.withdraw(10000), "Thread-4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}