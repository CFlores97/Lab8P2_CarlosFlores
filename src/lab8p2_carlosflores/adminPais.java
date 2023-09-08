package lab8p2_carlosflores;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class adminPais {

    private ArrayList<Pais> listaPaises = new ArrayList<>();
    private File file = null;

    public adminPais(String path) {
        file = new File(path);
    }

    public ArrayList<Pais> getListaPaises() {
        return listaPaises;
    }

    public void setListaPaises(ArrayList<Pais> listaPaises) {
        this.listaPaises = listaPaises;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setPais(Pais a) {
        listaPaises.add(a);
    }

    public void uploadFile() {
        try {
            listaPaises = new ArrayList<>();
            Pais temp;

            if (file.exists()) {
                FileInputStream fi = new FileInputStream(file);
                ObjectInputStream obj = new ObjectInputStream(fi);

                try {
                    while ((temp = (Pais) obj.readObject()) != null) {
                        listaPaises.add(temp);
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

            for (Pais p : listaPaises) {
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
