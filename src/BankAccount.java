import java.util.Scanner;

public class BankAccount {
    private double amount;
    public BankAccount(){

    }

    public double getAmount() {

        return amount;
    }
    public BankAccount(double amount){
        this.amount=amount;
    }
    public double deposit(double sum){
        return this.amount+=sum;
    }
    public double WithDraw(double sum) throws LimitException {
      if (sum>this.amount){
          throw new LimitException("Ошибка!!! Сумма снятия больше чем баланс!!! ",this.amount);
      }else {
        return  this.amount-= sum ;
    }
    }
}
