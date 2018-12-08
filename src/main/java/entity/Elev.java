package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "elev")

public class Elev implements Serializable {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cnp", unique = true )
    private String cnp;

    @Column(name = "nume", unique = true )
    private String nume;

    @Column(name = "prenume", nullable = false)
    private int prenume;

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

    public int getPrenume() {
        return prenume;
    }

    public void setPrenume(int prenume) {
        this.prenume = prenume;
    }

    @Override
    public String toString(){
        return id + " " + cnp + " " + nume + " " + prenume;
    }
}
