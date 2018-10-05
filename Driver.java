public class Driver{

  public static void main(String[] args){
    BankAccount Mood = new BankAccount(678.0, 235556, "wackery");
    System.out.println(Mood);
    Mood.deposit(.53);
    Mood.withdraw(100);
    System.out.println(Mood);
  }
}
