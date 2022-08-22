package dao.dao;

import dao.model.Person;

import java.util.List;

public interface IPersonDao {

    void save(Person person);
    Person getById(int idPerson);
    List<Person> getAll();
    void deleteById(int idPerson);
    void update(Person person);

}
