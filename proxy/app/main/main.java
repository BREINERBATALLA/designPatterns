package proxy.app.main;

import proxy.app.persistence.IRepository;
import proxy.app.persistence.IRepositoryImpl;
import proxy.app.proxy.RepositoryProxy;
import proxy.app.proxy.Session;

import javax.security.sasl.AuthenticationException;

public class main {
    public static void main(String[] args) {
        IRepository repository = new IRepositoryImpl();
        RepositoryProxy repositoryProxy = new RepositoryProxy(repository);
        Session.canSave = true;
        Session.canGet = false;
        Session.cangetAll = true;

        try {
            repositoryProxy.save("Proof");
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }
        try {
            repositoryProxy.getName("Breiner");
        } catch (AuthenticationException e) {
            System.out.println("It doesn't have authorization to getName");;
        }
        try {
            repositoryProxy.getNames().stream().forEach(System.out::println);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

    }
}
