
package lab8p2_carlosflores;

import java.io.Serializable;

public class Evento implements Serializable {
    private String estilo;
    private long distancia;

    public Evento() {
    }

    public Evento(String estilo, long distancia) {
        this.estilo = estilo;
        this.distancia = distancia;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public long getDistancia() {
        return distancia;
    }

    public void setDistancia(long distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return estilo;
    }
    
    
    
}
