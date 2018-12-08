package oneToMany;

import entity.Elev;
import entity.Profesor;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.ArrayList;
import java.util.List;

import static util.HibernateUtil.*;

public class oneToManyApp {

    public static void main(String[] args) {

        Profesor prof1 = new Profesor();
        List<Elev> elevi = new ArrayList<>();

        prof1.setCnp("282");
        prof1.setNume("Norris");
        prof1.setPrenume("Chuck");
        prof1.setElevi(elevi);



        Elev el1 = new Elev();

        el1.setCnp("589");
        el1.setNume("Johnny");
        el1.setNume("X");

        Elev el2 = new Elev();

        el2.setCnp("544");
        el2.setNume("John");
        el2.setNume("Y");

        Elev el3 = new Elev();

        el3.setCnp("515");
        el3.setNume("Kiki");
        el3.setNume("Z");

        prof1.getElevi().add(el1);
        prof1.getElevi().add(el2);

        save(prof1);

        List<Profesor> profi = readAll(Profesor.class);
        System.out.println("Found" + profi.size() + "masini");

        for(Profesor p: profi){
            System.out.println(p);
        }

        /*save(el1);
        save(el2);
        save(el3);*/
        closeEMF();

    }
}
