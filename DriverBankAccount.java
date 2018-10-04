public class DriverBankAccount{
  public static void main(String[] args){
    BankAccount b1 = new BankAccount(1000.0, 1000001, "abc123");
    BankAccount b2 = new BankAccount(1234.0, 1000231, "abcasdg23");

    System.out.println("account b1:");
    System.out.println(b1);
    System.out.println("Account b2");
    System.out.println(b2);
    System.out.println();

    double cashAmount = 300.0;
    while(cashAmount < 3000.0){
      System.out.println("Attempt to move "+cashAmount+" from the b1 to the b2 account");
      if(b1.withdraw(cashAmount)){
        if(b2.deposit(cashAmount)){
          System.out.println("success");
        }
        else {
          System.out.println("error in deposit");
        }
      }
      else{
        System.out.println("error");
      }
      System.out.println("account b1:");
      System.out.println(b1);
      System.out.println("Account b2");
      System.out.println(b2);
      System.out.println();
      cashAmount *= 2;
    }
  }
}
