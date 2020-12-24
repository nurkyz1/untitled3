import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(20000);
        for (int i; ; i++) {

            System.out.println("Остаток: "+bankAccount.getAmount());
            try {
                bankAccount.WithDraw(scanner.nextDouble());
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Снято: "+bankAccount.getAmount());
                try {
                    bankAccount.WithDraw(bankAccount.getAmount());
                } catch (LimitException ex) {
                    System.out.println(ex.getMessage());
                }
            }finally {
                if (bankAccount.getAmount()==0);
                break;
            }
        }
    }
}
