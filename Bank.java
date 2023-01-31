public class Bank
{
    private String bankName;
    private BankManager currentManager;
    private int enterMoney;


    public Bank(String bankName, int enterMoney)
    {
        this.bankName = bankName;
        this.enterMoney = enterMoney;
    }

    public String getBankName()
    {
        return bankName;
    }

    public BankManager getCurrentManager() {
        return currentManager;
    }

    public int getEnterMoney() {
        return enterMoney;
    }
}
