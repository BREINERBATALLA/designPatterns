package factory.interfaz.impl;

import factory.interfaz.IProgrammer;

public class SemiSenior implements IProgrammer {
    @Override
    public double calculatePayment() {
        return 4500000;
    }

    @Override
    public void seniority() {
        System.out.println("I'm SemiSenior web dev");
    }
}
