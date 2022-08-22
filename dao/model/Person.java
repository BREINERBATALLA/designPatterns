package dao.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String fullName;
    private String cellphone;
    private LocalDate birthDate;
    private int age;
    private String idNumber;

    public Person(String fullName, String cellphone, LocalDate birthDate, String idNumber) {
        this.fullName = fullName;
        this.cellphone = cellphone;
        this.birthDate = birthDate;
        this.idNumber = idNumber;
        this.age= calculateAge();
    }

    public int calculateAge(){
       return Period.between(this.birthDate,LocalDate.now()).getYears();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age +
                ", idNumber='" + idNumber + '\'' +
                '}';
    }
}
