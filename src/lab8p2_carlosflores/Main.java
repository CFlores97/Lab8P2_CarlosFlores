package lab8p2_carlosflores;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JViewport;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        llenarPaises();
        llenarNadadores();
        llenarTablaEventos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pm_crudNadadores = new javax.swing.JPopupMenu();
        mi_modificar = new javax.swing.JMenuItem();
        mi_eliminar = new javax.swing.JMenuItem();
        pm_crudEventos = new javax.swing.JPopupMenu();
        mi_modificarE = new javax.swing.JMenuItem();
        mi_eliminarE = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombrePais = new javax.swing.JTextField();
        tf_medallasPais = new javax.swing.JTextField();
        cb_nadadores = new javax.swing.JComboBox<>();
        btn_addPais = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cb_estilos = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btn_agregarEvento = new javax.swing.JButton();
        cb_distancias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_eventos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombreNadador = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_medallasNadador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_paises = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_estatura = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf_tiempo = new javax.swing.JTextField();
        btn_agregarNadador = new javax.swing.JButton();
        cb_estilosNadador = new javax.swing.JComboBox<>();
        cb_distanciaNadador = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_nadadores = new javax.swing.JTable();

        mi_modificar.setText("Modificar");
        pm_crudNadadores.add(mi_modificar);

        mi_eliminar.setText("Eliminar");
        mi_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarActionPerformed(evt);
            }
        });
        pm_crudNadadores.add(mi_eliminar);

        mi_modificarE.setText("Modificar");
        pm_crudEventos.add(mi_modificarE);

        mi_eliminarE.setText("Eliminar");
        mi_eliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_eliminarEActionPerformed(evt);
            }
        });
        pm_crudEventos.add(mi_eliminarE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Agregar Pais");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Medallas:");

        jLabel3.setText("Nadadores:");

        btn_addPais.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_addPais.setText("Add");
        btn_addPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addPaisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_nadadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_medallasPais, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_addPais, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 391, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(362, 362, 362))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_medallasPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_nadadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(btn_addPais, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pais", jPanel2);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Agregar evento");

        jLabel15.setText("Estilo:");

        cb_estilos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE ", "PECHO ", "DORSO", "MARIPOSA" }));
        cb_estilos.setSelectedIndex(-1);

        jLabel16.setText("Distancia:");

        btn_agregarEvento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_agregarEvento.setText("Add");
        btn_agregarEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarEventoMouseClicked(evt);
            }
        });

        cb_distancias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200", "400", "800" }));
        cb_distancias.setSelectedIndex(-1);

        jt_eventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estilo", "Distancia"
            }
        ));
        jt_eventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_eventosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_eventos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_agregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_distancias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_estilos, 0, 1, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(cb_estilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cb_distancias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(btn_agregarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eventos", jPanel4);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Agregar Nadador");

        jLabel4.setText("Nombre:");

        jLabel7.setText("Medallas:");

        jLabel8.setText("Nacionalidad:");

        jLabel9.setText("Edad:");

        jLabel10.setText("Estatura:");

        jLabel11.setText("Estilo de natacion:");

        jLabel12.setText("Distancia a competir:");

        jLabel13.setText("Tiempo:");

        btn_agregarNadador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_agregarNadador.setText("Add");
        btn_agregarNadador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_agregarNadadorMouseClicked(evt);
            }
        });

        cb_estilosNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LIBRE ", "PECHO ", "DORSO", "MARIPOSA" }));
        cb_estilosNadador.setSelectedIndex(-1);

        cb_distanciaNadador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "200 ", "400", "800" }));
        cb_distanciaNadador.setSelectedIndex(-1);

        jt_nadadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Medallas", "Nacionalidad", "Edad", "Estatura", "Estilo", "Distancia", "Tiempo"
            }
        ));
        jt_nadadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_nadadoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jt_nadadores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_nombreNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_medallasNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addGap(90, 90, 90)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_paises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_estilosNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cb_distanciaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(btn_agregarNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(1, 1, 1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_nombreNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_medallasNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(cb_paises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tf_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cb_estilosNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cb_distanciaNadador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btn_agregarNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Nadadores", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addPaisMouseClicked

        //Agregar al combobox
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_paises.getModel();

        try {
            Pais country = new Pais(
                    tf_nombrePais.getText(),
                    Integer.parseInt(tf_medallasPais.getText()));

            model.addElement(country);

            // Archivo
            try {

                aP.uploadFile();
                aP.setPais(country);
                aP.writeFile();

                JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "No se agrego ):");
            }

            //Agregar al cb
            cb_paises.setModel(model);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se pudo agregar", "Error", JOptionPane.ERROR);

        }

    }//GEN-LAST:event_btn_addPaisMouseClicked

    private void btn_agregarNadadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarNadadorMouseClicked

        //Agregar al combobox y a la tabla
        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_nadadores.getModel();
        DefaultTableModel tModel = (DefaultTableModel) jt_nadadores.getModel();

        try {

            Nadador swimmer = new Nadador(
                    tf_nombreNadador.getText(),
                    (Pais) cb_paises.getSelectedItem(),
                    Integer.parseInt(tf_edad.getText()),
                    Integer.parseInt(tf_medallasNadador.getText()),
                    Double.parseDouble(tf_estatura.getText()),
                    (String) cb_estilosNadador.getSelectedItem(),
                    Double.parseDouble((String) cb_distanciaNadador.getSelectedItem()),
                    Double.parseDouble(tf_tiempo.getText()));

            // Agregar al archivo
            try {
                aN.uploadFile();
                aN.setNadador(swimmer);
                aN.writeFile();

                JOptionPane.showMessageDialog(this, "Agregado al archivo exitosamente!");
            } catch (Exception e) {

            }

            // tabla
            model.addElement(swimmer);

            Object[] row = {
                swimmer.getNombre(),
                swimmer.getNacionalidad(),
                swimmer.getEdad(),
                swimmer.getMedallas(),
                swimmer.getEstatura(),
                swimmer.getEstiloNatacion(),
                swimmer.getDistanciaACompetir(),
                swimmer.getTiempo()};

            tModel.addRow(row);

            //Agregar nadador al pais seleccionado
            paisAdd = (Pais) cb_paises.getSelectedItem();
            paisAdd.getNadadores().add(swimmer);

            //DefaultComboBoxModel modelPais = (DefaultComboBoxModel) cb_nadadores.getModel();
            jt_nadadores.setModel(tModel);
            cb_nadadores.setModel(model);

            JOptionPane.showMessageDialog(this, "Agregado exitosamente!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se pudo agregar", "Error", JOptionPane.ERROR);

        }


    }//GEN-LAST:event_btn_agregarNadadorMouseClicked

    private void btn_agregarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarEventoMouseClicked
        DefaultTableModel tModel = (DefaultTableModel) jt_eventos.getModel();

        Evento event = new Evento(
                (String) cb_estilos.getSelectedItem(),
                Long.parseLong((String) cb_distancias.getSelectedItem()));

        Object[] row = {event.getEstilo(), event.getDistancia()};

        try {
            aE.uploadFile();
            aE.setEvento(event);
            aE.writeFile();

            JOptionPane.showMessageDialog(this, "Agregado al archivo exitosamente!");
        } catch (Exception e) {
        }

        tModel.addRow(row);

        jt_eventos.setModel(tModel);
    }//GEN-LAST:event_btn_agregarEventoMouseClicked

    private void jt_nadadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_nadadoresMouseClicked
        if (evt.isMetaDown()) {
            pm_crudNadadores.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_nadadoresMouseClicked

    private void mi_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) jt_nadadores.getModel();

        int rowToElim = jt_nadadores.getSelectedRow();

        modeloTabla.removeRow(rowToElim);

        JOptionPane.showMessageDialog(this, "Eliminado!");
        
        try {
            aN.uploadFile();
            aN.getListaNadadores().remove(rowToElim);
            
            aN.writeFile();
        } catch (Exception e) {
        }

        jt_nadadores.setModel(modeloTabla);
    }//GEN-LAST:event_mi_eliminarActionPerformed

    private void jt_eventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_eventosMouseClicked
        if (evt.isMetaDown()) {
            pm_crudEventos.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jt_eventosMouseClicked

    private void mi_eliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_eliminarEActionPerformed
        DefaultTableModel modeloTabla = (DefaultTableModel) jt_eventos.getModel();

        int rowToElim = jt_eventos.getSelectedRow();

        modeloTabla.removeRow(rowToElim);

        JOptionPane.showMessageDialog(this, "Eliminado!");
        
        try {
            aE.uploadFile();
            aE.getListaEventos().remove(rowToElim);
            
            aE.writeFile();
        } catch (Exception e) {
        }

        jt_eventos.setModel(modeloTabla);
    }//GEN-LAST:event_mi_eliminarEActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //metodo para llenar combobox
    public void llenarPaises() {
        aP.uploadFile();
        paises = aP.getListaPaises();

        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_paises.getModel();
        model.addAll(paises);

        cb_paises.setModel(model);
    }

    public void llenarNadadores() {
        aN.uploadFile();
        nadadores = aN.getListaNadadores();

        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_nadadores.getModel();
        DefaultTableModel tableModel = (DefaultTableModel) jt_nadadores.getModel();

        //Add CB
        model.addAll(nadadores);

        //Add table
        for (Nadador nadador : nadadores) {
            Object[] tempRow = {
                nadador.getNombre(),
                nadador.getNacionalidad(),
                nadador.getEdad(),
                nadador.getMedallas(),
                nadador.getEstatura(),
                nadador.getEstiloNatacion(),
                nadador.getDistanciaACompetir(),
                nadador.getTiempo()};

            tableModel.addRow(tempRow);
        }

        cb_nadadores.setModel(model);
        jt_nadadores.setModel(tableModel);
    }

    public void llenarTablaEventos() {
        aE.uploadFile();
        eventos = aE.getListaEventos();

        DefaultTableModel model = (DefaultTableModel) jt_eventos.getModel();

        for (Evento evento : eventos) {
            Object[] tempRow = {evento.getEstilo(), evento.getDistancia()};

            model.addRow(tempRow);

        }

        jt_eventos.setModel(model);
    }

    Pais paisAdd = null;

    adminPais aP = new adminPais("./paises.karu");
    adminEvento aE = new adminEvento("./eventos.karu");
    adminNadador aN = new adminNadador("./nadadores.karu");

    ArrayList<Pais> paises = new ArrayList<>();
    ArrayList<Evento> eventos = new ArrayList<>();
    ArrayList<Nadador> nadadores = new ArrayList<>();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addPais;
    private javax.swing.JButton btn_agregarEvento;
    private javax.swing.JButton btn_agregarNadador;
    private javax.swing.JComboBox<String> cb_distanciaNadador;
    private javax.swing.JComboBox<String> cb_distancias;
    private javax.swing.JComboBox<String> cb_estilos;
    private javax.swing.JComboBox<String> cb_estilosNadador;
    private javax.swing.JComboBox<String> cb_nadadores;
    private javax.swing.JComboBox<String> cb_paises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jt_eventos;
    private javax.swing.JTable jt_nadadores;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_eliminarE;
    private javax.swing.JMenuItem mi_modificar;
    private javax.swing.JMenuItem mi_modificarE;
    private javax.swing.JPopupMenu pm_crudEventos;
    private javax.swing.JPopupMenu pm_crudNadadores;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_estatura;
    private javax.swing.JTextField tf_medallasNadador;
    private javax.swing.JTextField tf_medallasPais;
    private javax.swing.JTextField tf_nombreNadador;
    private javax.swing.JTextField tf_nombrePais;
    private javax.swing.JTextField tf_tiempo;
    // End of variables declaration//GEN-END:variables
}
