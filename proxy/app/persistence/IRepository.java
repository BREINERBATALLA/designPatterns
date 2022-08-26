package proxy.app.persistence;

import javax.security.sasl.AuthenticationException;
import java.util.List;

public interface IRepository {
    List<String> getNames() throws AuthenticationException;
    String getName(String name) throws AuthenticationException;
    void save(String name) throws AuthenticationException;

}
