package factory.interfaz.impl;

import factory.interfaz.IProgrammer;

public class Senior implements IProgrammer {
    @Override
    public double calculatePayment() {
        return 7000000;
    }

    @Override
    public void seniority() {
        System.out.println("I'm Senior web dev");
    }
}
