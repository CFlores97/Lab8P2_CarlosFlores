
package lab8p2_carlosflores;

import java.io.Serializable;
import java.util.ArrayList;


public class Pais implements Serializable{
    private String nombre;
    private int medallas;
    private ArrayList<Nadador> nadadores = new ArrayList<>();

    public Pais() {
    }

    public Pais(String nombre, int medallas) {
        this.nombre = nombre;
        this.medallas = medallas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
