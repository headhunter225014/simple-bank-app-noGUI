import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Account
{
   private String name;
   private String password;
   private String login;

   public ArrayList<Loan> getLoansList() {
      return loansList;
   }

   private int idNumber;
   private boolean isManager = false;
   private double hold;
   private String bankName;
   ArrayList<Loan> loansList = new ArrayList<Loan>();

   public Account(int idNumber,String login, String password, double hold, String bankName) {
      this.idNumber = idNumber;
      this.login = login;
      this.hold = hold;
      this.bankName = bankName;
      this.password = password;
   }

   public String getName() {
      return name;
   }

   public String getPassword() {
      return password;
   }

   public String getLogin() {
      return login;
   }

   public int getIdNumber() {
      return idNumber;
   }

   public boolean isManager() {
      return isManager;
   }

   public double getHold() {
      return hold;
   }

   public String getBankName() {
      return bankName;
   }

   public void withdraw(double money)
   {
      hold = hold - money;
   }

   public void deposit(double money)
   {
      hold = hold + money;
   }
}
