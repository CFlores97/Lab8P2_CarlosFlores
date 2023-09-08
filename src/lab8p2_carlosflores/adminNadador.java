
package lab8p2_carlosflores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class adminNadador {
    private ArrayList<Nadador> listaNadadores = new ArrayList<>();
    private File file = null;

    public adminNadador(String path) {
        file = new File(path);
    }

    public ArrayList<Nadador> getListaNadadores() {
        return listaNadadores;
    }

    public void setListaNadadores(ArrayList<Nadador> listaNadadores) {
        this.listaNadadores = listaNadadores;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public void setNadador(Nadador a) {
        listaNadadores.add(a);
    }
    
     public void uploadFile() {
        try {
            listaNadadores = new ArrayList<>();
            Nadador temp;

            if (file.exists()) {
                FileInputStream fi = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(fi);

                try {
                    while ((temp = (Nadador) obj.readObject()) != null) {
                        listaNadadores.add(temp);
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

            for (Nadador p : listaNadadores) {
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
