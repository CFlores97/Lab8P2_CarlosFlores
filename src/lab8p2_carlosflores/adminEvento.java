
package lab8p2_carlosflores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminEvento {
    private ArrayList<Evento> listaEventos = new ArrayList<>();
    private File file = null;

    public adminEvento(String path) {
        file = new File(path);
    }

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void setEvento(Evento a) {
        listaEventos.add(a);
    }
    
    public void uploadFile() {
        try {
            listaEventos = new ArrayList<>();
            Evento temp;

            if (file.exists()) {
                FileInputStream fi = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(fi);

                try {
                    while ((temp = (Evento) obj.readObject()) != null) {
                        listaEventos.add(temp);
                    }
                } catch (Exception e) {

                }
                obj.close();
                fi.close();
            }
        } catch (Exception e) {

        }
    }

    public void writeFile() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        try {
            fw = new FileOutputStream(file);
            bw = new ObjectOutputStream(fw);

            for (Evento p : listaEventos) {
                bw.writeObject(p);
            }
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (Exception ex) {
        }
    }
    
    
}
