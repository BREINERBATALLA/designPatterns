package adapter;

public class BankApiAdapter implements IBank{

    private BancolombiaApi bankApi;

    public BankApiAdapter(BancolombiaApi bankApi) {
        this.bankApi = bankApi;
    }

    @Override
    public void checkOut() {
        bankApi.payment();
    }

    @Override
    public void registerInformation() {
        bankApi.dataCustomer();
        System.out.println("Save information in db");
    }
}
