package proxy.app.persistence;

import java.util.List;

public class IRepositoryImpl implements IRepository {
    @Override
    public List<String> getNames() {
        return List.of("Breiner", "Francisco", "Batalla", "Caicedo");
    }

    @Override
    public String getName(String name) {
        return name;
    }

    @Override
    public void save(String name) {
        System.out.println("source has been saved");
    }
}
