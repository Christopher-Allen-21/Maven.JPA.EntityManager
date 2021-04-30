package entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Cd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;
    private String title;
    private String description;
    private int year;
    @OneToMany
    private Set<Artist> artists = new HashSet<Artist>();
    private double price;

    public Cd(String title, String description, int year, double price) {
        this.title = title;
        this.description = description;
        this.year = year;
        this.price = price;
    }

    public Cd() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<Artist> getArtists() {
        return artists;
    }

    public void setArtists(Set<Artist> artists) {
        this.artists = artists;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
