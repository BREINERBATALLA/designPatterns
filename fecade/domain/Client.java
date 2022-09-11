package fecade.domain;

import java.time.LocalDate;

public class Client {

    private String fullName;
    private LocalDate birthdate;
    private Long id;


    public Client(String fullName, LocalDate birthdate, Long id) {
        this.fullName = fullName;
        this.birthdate = birthdate;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "fullName='" + fullName + '\'' +
                ", birthdate=" + birthdate +
                ", id=" + id +
                '}';
    }
}
