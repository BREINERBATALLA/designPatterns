package proxy.app.proxy;

import proxy.app.persistence.IRepository;

import javax.security.sasl.AuthenticationException;
import java.util.List;

public class RepositoryProxy implements IRepository {

    private IRepository target;

    public RepositoryProxy(IRepository target) {
        this.target = target;
    }

    @Override
    public List<String> getNames() throws AuthenticationException {
        if (Session.cangetAll){
            return target.getNames();
        }else{
            throw new AuthenticationException();
        }
    }

    @Override
    public String getName(String name) throws AuthenticationException {
        if (Session.canGet) {
            return target.getName(name);
        }else{
            throw new AuthenticationException();
        }
    }

    @Override
    public void save(String name) throws AuthenticationException {
        if (Session.canSave) {
            target.save(name);
        }else
            throw new AuthenticationException();
    }
}
