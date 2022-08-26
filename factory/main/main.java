package factory.main;

import factory.interfaz.IProgrammer;
import factory.interfaz.impl.Junior;

public class main {
    public static void main(String[] args) {
        ProgrammerFactory factory = new ProgrammerFactory();

        IProgrammer junior = factory.getProgrammer("junior");
        IProgrammer semiSenior = factory.getProgrammer("semisenior");
        IProgrammer senior = factory.getProgrammer("senior");

        System.out.println(junior.calculatePayment());
        System.out.println(semiSenior.calculatePayment());
        System.out.println(senior.calculatePayment());

    }
}
