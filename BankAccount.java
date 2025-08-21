public class BankAccount {
    private long balance ;
    //การฝากเงิน
    public  synchronized void deposit(long amount) {
        balance +=amount;
    }
    //การถอนเงิน
    public  synchronized void withdraw(long amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
    //ค่าคงเหลือในบัญชี
    public  synchronized long getBalance() {
        return this.balance;
    }
}
