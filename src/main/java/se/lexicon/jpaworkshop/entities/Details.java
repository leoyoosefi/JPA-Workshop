package se.lexicon.jpaworkshop.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
@Entity
public class Details {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;
@Column(unique = true)
    private String email;
    private String name;
    private LocalDate birthdate;

    public Details(int detailsId, String email, String name, LocalDate birthdate) {
        this.detailsId = detailsId;
        this.email = email;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Details() {

    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details details = (Details) o;
        return detailsId == details.detailsId && Objects.equals(email, details.email) && Objects.equals(name, details.name) && Objects.equals(birthdate, details.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detailsId, email, name, birthdate);
    }

    @Override
    public String toString() {
        return "Details{" +
                "detailsId=" + detailsId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
