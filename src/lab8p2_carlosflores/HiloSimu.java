
package lab8p2_carlosflores;


import java.util.Random;
import javax.swing.JProgressBar;


public class HiloSimu extends Thread{
    
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private Nadador nadador = new Nadador();
    
    public HiloSimu(JProgressBar barra, Nadador a) {
        this.barra = barra;
        avanzar=true;
        vive=true;
        this.nadador = a;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                Random ran = new Random();
                int randomValue = ran.nextInt();
                barra.setValue((int)nadador.getDistanciaACompetir() + randomValue);
            } 
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
