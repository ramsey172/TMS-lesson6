public class CreditCard {
    String accountNumber;
    double sum;

    CreditCard(String accountNumber, double sum){
        this.accountNumber = accountNumber;
        this.sum = sum;
    }

    public void withdraw(double sum){
        this.sum -= sum;
    }

    public void deposit(double sum){
        this.sum += sum;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber='" + accountNumber + '\'' +
                ", sum=" + sum +
                '}';
    }

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("SGHH6762HDJK21", 500);
        CreditCard creditCard2 = new CreditCard("SGHH6762HDJK22", 600);
        CreditCard creditCard3 = new CreditCard("SGHH6762HDJK23", 700);

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);

        creditCard1.deposit(200.2);
        creditCard2.deposit(300.22);
        creditCard3.withdraw(19.777);

        System.out.println("--------------------------");

        System.out.println(creditCard1);
        System.out.println(creditCard2);
        System.out.println(creditCard3);
    }
}
