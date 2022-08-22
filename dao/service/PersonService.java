package dao.service;

import dao.dao.IPersonDao;
import dao.model.Person;
import java.util.List;

public class PersonService {

    IPersonDao personDao;

    public PersonService(IPersonDao personDao) {
        this.personDao = personDao;
    }

    public void save(Person person){
        personDao.save(person);
    }

    public void deleteById(int idPerson){
        personDao.deleteById(idPerson);
    }

    public Person getById(int idPerson){
        return personDao.getById(idPerson);
    }

    public List<Person> getAll(){
        return personDao.getAll();
    }
    public void update(Person person){
        personDao.update(person);
    }

}
