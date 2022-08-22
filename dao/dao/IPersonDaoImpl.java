package dao.dao;

import dao.model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IPersonDaoImpl implements IPersonDao {
    @Override
    public void save(Person person) {
        System.out.println("Person saved");
    }

    @Override
    public Person getById(int idPerson) {
        return new Person("Breiner","123456789", LocalDate.parse("1999-08-05"),"123");
    }

    @Override
    public List<Person> getAll() {
        List<Person> personList = List.of(new Person("Breiner","123456789", LocalDate.parse("1999-08-05"),
                        "123"),new Person("Breinerx2","123456789", LocalDate.parse("1990-06-10"),
                        "456"));

        return personList;
    }

    @Override
    public void deleteById(int idPerson) {
        System.out.println("Deleted"+ idPerson);
    }

    @Override
    public void update(Person person) {
        System.out.println("Person updated");
    }
}
