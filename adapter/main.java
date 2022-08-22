package adapter;

public class main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel(new BankApiAdapter(new BancolombiaApi()));
        hotel.makeCheckOut("Breiner","123456789");
    }
}
