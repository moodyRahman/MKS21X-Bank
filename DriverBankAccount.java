public class DriverBankAccount{
  public static void main(String[] args){
    BankAccount b1 = new BankAccount(1000.0, 1000001, "abc123");
    BankAccount b2 = new BankAccount(1234.0, 1000231, "abcasdg23");

    /**
    System.out.println("account b1:");
    System.out.println(b1);
    System.out.println("Account b2");
    System.out.println(b2);
    System.out.println();

    double cashAmount = 300.0;
    while(cashAmount < 3000.0){
      System.out.println("Attempt to move "+cashAmount+" from the b1 to the b2 account");
      if(b1.withdraw(cashAmount) && b2.deposit(cashAmount)){
        System.out.println("successful");
      }
      else{
        System.out.println("");
      }
      System.out.println("account b1:");
      System.out.println(b1);
      System.out.println("Account b2");
      System.out.println(b2);
      System.out.println();
      cashAmount *= 2;
    }
    **/
    b1.transferTo(b2, 9999999, "abc123");
    System.out.println(b1);
    System.out.println(b2);
  }
}
