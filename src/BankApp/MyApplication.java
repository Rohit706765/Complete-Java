package BankApp;

public class MyApplication {

    public static void main(String[] args) {
        Bank surat = new Bank("Bank Of India ");
        surat.addBranch("pandesara");
        surat.addCustomerToBranch("pandesara","rohit",45.5);
        surat.addCustomerToBranch("pandesara","kajal",45000);

        surat.addCustomerTransaction("pandesara","rohit",4550);
        surat.addCustomerTransaction("pandesara","rohit",430);
        surat.addCustomerTransaction("pandesara","rohit",8230);
        surat.addCustomerTransaction("pandesara","rohit",10000);

        surat.showCustomer(true,"pandesara");
    }
}
