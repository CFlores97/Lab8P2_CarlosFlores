
package lab8p2_carlosflores;


public class Nadador {
    private String nombre;
    private Pais nacionalidad;
    private int edad, medallas; 
    private double estatura;
    private String estiloNatacion;
    private double distanciaACompetir, tiempo;

    public Nadador() {
    }

    public Nadador(String nombre, Pais nacionalidad, int edad, int medallas, double estatura, String estiloNatacion, double distanciaACompetir, double tiempo) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.medallas = medallas;
        this.estatura = estatura;
        this.estiloNatacion = estiloNatacion;
        this.distanciaACompetir = distanciaACompetir;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Pais nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public double getDistanciaACompetir() {
        return distanciaACompetir;
    }

    public void setDistanciaACompetir(double distanciaACompetir) {
        this.distanciaACompetir = distanciaACompetir;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return nombre;
        
    }
    
    
    
    
}
