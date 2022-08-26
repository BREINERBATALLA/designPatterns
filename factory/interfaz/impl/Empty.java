package factory.interfaz.impl;

import factory.interfaz.IProgrammer;

public class Empty implements IProgrammer {
    @Override
    public double calculatePayment() {
        return -1;
    }

    @Override
    public void seniority() {
        System.out.println("Don't specified");
    }
}
