package entity;

import javax.persistence.*;
import java.io.Serializable;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "profesor")

public class Profesor implements Serializable {

    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cnp", unique = true )
    private String cnp;

    @Column(name = "nume", unique = true )
    private String nume;

    @Column(name = "prenume", nullable = false)
    private String prenume;

    @OneToMany(
            cascade = CascadeType.ALL, orphanRemoval = true
    )
    private List<Elev> elevi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public List<Elev> getElevi() {
        return elevi;
    }

    public void setElevi(List<Elev> elevi) {
        this.elevi = elevi;
    }

    @Override
    public String toString(){
        return id + " " + cnp + " " + nume + " " + prenume;
    }
}
