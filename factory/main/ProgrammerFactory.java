package factory.main;

import factory.interfaz.IProgrammer;
import factory.interfaz.impl.Empty;
import factory.interfaz.impl.Junior;
import factory.interfaz.impl.SemiSenior;
import factory.interfaz.impl.Senior;

public class ProgrammerFactory {

    public IProgrammer getProgrammer(String type) {
        if (type==null) {
            return new Empty();
        }
        else if (type.equalsIgnoreCase("Junior")) {
            return new Junior();
        }else if (type.equalsIgnoreCase("Semisenior")) {
            return new SemiSenior();
        }else if (type.equalsIgnoreCase("Senior")) {
            return new Senior();
        }
        return new Empty();
    }
}
