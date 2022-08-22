package dao;

import dao.dao.IPersonDao;
import dao.dao.IPersonDaoImpl;
import dao.model.Person;
import dao.service.PersonService;

public class main {
    public static void main(String[] args) {
        IPersonDao personDao = new IPersonDaoImpl();
        PersonService personService= new PersonService(personDao);

        personDao.getAll().stream().forEach(System.out::println);
    }
}
