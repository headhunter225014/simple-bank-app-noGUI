public class BankManager
{
    private String managerName;
    private String password;
    private String bankName;
    private boolean isManager = true;


    public BankManager(String managerName, String bankName, String password)
    {
        this.managerName = managerName;
        this.password =  password;
        this.bankName = bankName;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getPassword() {
        return password;
    }

    public String getBankName() {
        return bankName;
    }

    public boolean isManager() {
        return isManager;
    }
}
