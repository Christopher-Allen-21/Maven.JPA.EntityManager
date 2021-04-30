package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",updatable = false, nullable = false)
    private long id;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;

    private String genre;
    @OneToMany
    private Set<Cd> cdSet = new HashSet<Cd>();

    public Artist(String firstName, String lastName, String genre) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public Artist(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
