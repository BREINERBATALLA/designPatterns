package factory.interfaz.impl;

import factory.interfaz.IProgrammer;

public class Junior implements IProgrammer {
    @Override
    public double calculatePayment() {
        return 1000000;
    }

    @Override
    public void seniority() {
        System.out.println("I'm junior web dev");
    }
}
