public class ATM {
    int count20;
    int count50;
    int count100;
    int lastOperationCount20;
    int lastOperationCount50;
    int lastOperationCount100;
    int allSum;

    ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
        allSum = this.setAllSum();
    }

    //выдает наименьшее кол-во купюр
    public boolean withdraw(int amount) {
        if (amount > this.allSum) {
            return false;
        }
        int tmpSum;
        boolean isSuccess = false;
        int minCount = 99999;
        for (int i = 0; i < this.count20; i++) {
            for (int j = 0; j < this.count50; j++) {
                for (int k = 0; k < this.count100; k++) {
                    tmpSum = i * 20 + j * 50 + k * 100;
                    if (tmpSum == amount) {
                        if (minCount > i + j + k) {
                            minCount = i + j + k;
                            this.lastOperationCount20 = i;
                            this.lastOperationCount50 = j;
                            this.lastOperationCount100 = k;
                        }
                        isSuccess = true;
                    }
                }
            }
        }
        if (isSuccess) {
            this.count20 -= this.lastOperationCount20;
            this.count50 -= this.lastOperationCount20;
            this.count100 -= this.lastOperationCount20;
        }

        return isSuccess;
    }

    public void deposit(int count20) {
        this.count20 += count20;
    }

    public void deposit(int count20, int count50) {
        this.count20 += count20;
        this.count50 += count50;
    }

    public void deposit(int count20, int count50, int count100) {
        this.count20 += count20;
        this.count50 += count50;
        this.count100 += count100;
    }

    private int setAllSum() {
        return 20 * this.count20 + 50 * this.count50 + 100 * count100;
    }


    public static void main(String[] args) {
        ATM atm = new ATM(0, 20, 20);
        atm.deposit(20);
        atm.deposit(20,1);
        atm.deposit(20,2,2);
        if (atm.withdraw(2230)) {
            System.out.println("Успех!");
            System.out.println("Количество купюр в 20р - " + atm.lastOperationCount20);
            System.out.println("Количество купюр в 50р - " + atm.lastOperationCount50);
            System.out.println("Количество купюр в 100р - " + atm.lastOperationCount100);
        } else {
            System.out.println("В банкомате нет такой суммы или нет нужных купюр");
        }
    }
}
