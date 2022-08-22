package adapter;

import java.time.LocalDate;

public class Hotel {

    private IBank bank;

    public Hotel(IBank bank) {
        this.bank = bank;
    }

    public void makeCheckOut(String nameCustomer, String cellPhone){
        System.out.println("----Printing---");
        System.out.println("Name: "+nameCustomer+ "\n"+ "Cellphone: "+cellPhone+ "\n"+ "Date: "+ LocalDate.now());
        bank.checkOut();
        bank.registerInformation();
    }

}
