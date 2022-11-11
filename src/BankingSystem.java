public class BankingSystem implements BankManagementSystem {
    @Override
    public void accountsDetails() {
        int account_id;
        int accounts_customer;
        String accountNumber;
        String accountBalance;
        String accountDescription;
    }

    @Override
    public void employeesDetails() {
        int employeesId;
        String employeesName;
        String mobile;
        String employeesAddress;
        String employeesEmail;
        String employeesPassword;
        String employeesUsername;
    }

    @Override
    public void customersDetails() {
        int customerId;
        String customerName;
        String customerMobile;
        String customerEmail;
        String customerPassword;
        String customerAddress;
        String customerUsername;
    }

    @Override
    public void balance() {
        int balanceId;
        String balanceAmount;
        int customerId;
        String balanceDescription;
    }
}
