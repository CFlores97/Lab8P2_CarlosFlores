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
        llenarEventos();
        llenarTablaEventos();

        hS = new HiloSimu(pb_1);
        hS1 = new HiloSimu(pb_2);
        hS2 = new HiloSimu(pb_3);

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
        tf_nombrePais = new javax.swing.JTextField();
        tf_medallasPais = new javax.swing.JTextField();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_nadadores = new javax.swing.JTable();
        cb_nadadoresPais = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        pb_2 = new javax.swing.JProgressBar();
        pb_1 = new javax.swing.JProgressBar();
        pb_3 = new javax.swing.JProgressBar();
        cb_nad1 = new javax.swing.JComboBox<>();
        cb_nad2 = new javax.swing.JComboBox<>();
        cb_nad3 = new javax.swing.JComboBox<>();
        btn_beginRace = new javax.swing.JButton();

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
        mi_modificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_modificarEActionPerformed(evt);
            }
        });
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
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(150, 150, 150)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel6)
                .addContainerGap(417, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
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
                    .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(btn_agregarNadador, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jTabbedPane1.addTab("Nadadores", jPanel3);

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
        jScrollPane3.setViewportView(jt_nadadores);

        cb_nadadoresPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_nadadoresPaisItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(cb_nadadoresPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(cb_nadadoresPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        jTabbedPane1.addTab("Ver Nadadores", jPanel1);

        cb_nad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_nad1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_nad1ItemStateChanged(evt);
            }
        });

        cb_nad2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_nad2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_nad2ItemStateChanged(evt);
            }
        });

        cb_nad3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cb_nad3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_nad3ItemStateChanged(evt);
            }
        });

        btn_beginRace.setText("Empezar");
        btn_beginRace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_beginRaceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cb_nad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(cb_nad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(pb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(cb_nad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(btn_beginRace, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_nad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_nad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_nad3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pb_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btn_beginRace, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        jTabbedPane1.addTab("Simulacion", jPanel5);

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
        DefaultComboBoxModel modelP = (DefaultComboBoxModel) cb_nadadoresPais.getModel();

        try {
            Pais country = new Pais(
                    tf_nombrePais.getText(),
                    Integer.parseInt(tf_medallasPais.getText()));

            model.addElement(country);
            modelP.addElement(country);

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
            cb_nadadoresPais.setModel(modelP);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se pudo agregar", "Error", JOptionPane.ERROR);

        }

    }//GEN-LAST:event_btn_addPaisMouseClicked

    private void btn_agregarNadadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarNadadorMouseClicked

        //Agregar a la lista de nadadores del pais
        Pais selPais = (Pais) cb_paises.getSelectedItem();

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

            if (selPais.getNadadores().size() < 2) {
                // Agregar al archivo
                try {
                    aN.uploadFile();
                    aN.setNadador(swimmer);
                    aN.writeFile();

                    JOptionPane.showMessageDialog(this, "Agregado al archivo exitosamente!");
                } catch (Exception e) {

                }

                llenarNadadores();
                selPais.getNadadores().add(swimmer);
            } else {
                JOptionPane.showMessageDialog(this, "No se pueden agregar mas de dos nadadores al pais");
            }

            //JOptionPane.showMessageDialog(this, "Agregado exitosamente!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error y no se pudo agregar", "Error", JOptionPane.ERROR);

        }


    }//GEN-LAST:event_btn_agregarNadadorMouseClicked

    private void btn_agregarEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarEventoMouseClicked
        DefaultTableModel tModel = (DefaultTableModel) jt_eventos.getModel();
        DefaultComboBoxModel cbModel = (DefaultComboBoxModel) cb_nad1.getModel();
        DefaultComboBoxModel cbModel1 = (DefaultComboBoxModel) cb_nad2.getModel();
        DefaultComboBoxModel cbModel2 = (DefaultComboBoxModel) cb_nad3.getModel();

        Evento event = new Evento(
                (String) cb_estilos.getSelectedItem(),
                Long.parseLong((String) cb_distancias.getSelectedItem()));

        cbModel.addElement(event);
        cbModel1.addElement(event);
        cbModel2.addElement(event);

        Object[] row = {event.getEstilo(), event.getDistancia()};

        try {
            aE.uploadFile();
            aE.setEvento(event);
            aE.writeFile();

            JOptionPane.showMessageDialog(this, "Agregado al archivo exitosamente!");
        } catch (Exception e) {
        }

        cb_nad1.setModel(cbModel);
        cb_nad2.setModel(cbModel1);
        cb_nad3.setModel(cbModel2);
        tModel.addRow(row);

        jt_eventos.setModel(tModel);
    }//GEN-LAST:event_btn_agregarEventoMouseClicked

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

    private void mi_modificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_modificarEActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jt_nadadores.getModel();

        int selRow = jt_eventos.getSelectedRow();
    }//GEN-LAST:event_mi_modificarEActionPerformed

    private void jt_nadadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_nadadoresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nadadoresMouseClicked

    private void cb_nadadoresPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nadadoresPaisItemStateChanged
        DefaultTableModel modeloTabla = (DefaultTableModel) jt_nadadores.getModel();

        int paisSelected = cb_nadadoresPais.getSelectedIndex();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_nadadoresPais.getModel();

        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_nad1.getModel();
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) cb_nad2.getModel();
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) cb_nad3.getModel();

        while (modeloTabla.getRowCount() > 0) {
            modeloTabla.removeRow(0);
        }
        try {

            String nombrePais = modelo.getElementAt(paisSelected).toString();

            for (Nadador n : nadadores) {
                if (n.getNacionalidad().getNombre().equals(nombrePais)) {
                    Object[] row = {
                        n.getNombre(),
                        n.getNacionalidad(),
                        n.getEdad(),
                        n.getMedallas(),
                        n.getEstatura(),
                        n.getEstiloNatacion(),
                        n.getDistanciaACompetir(),
                        n.getTiempo()};

                    model.addElement(n);
                    model1.addElement(n);
                    model2.addElement(n);

                    modeloTabla.addRow(row);
                }
            }

            jt_nadadores.setModel(modeloTabla);
            cb_nad1.setModel(model);
            cb_nad2.setModel(model1);
            cb_nad3.setModel(model2);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_cb_nadadoresPaisItemStateChanged

    private void cb_nad1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nad1ItemStateChanged
        Nadador selSwim = (Nadador) cb_nad1.getSelectedItem();

        if (selSwim != null) {
            sel1 = true;
        }
    }//GEN-LAST:event_cb_nad1ItemStateChanged

    private void btn_beginRaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_beginRaceMouseClicked
        try {

            if (sel1 && sel2) {
                hS.start();
                hS1.start();
                
            }
            else if (sel1 && sel2 && sel3) {
                hS.start();
                hS1.start();
                hS2.start();
            }
            else{
                JOptionPane.showMessageDialog(this, "Debe elegir los nadadores!");
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_beginRaceMouseClicked

    private void cb_nad2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nad2ItemStateChanged
        Nadador selSwim = (Nadador) cb_nad2.getSelectedItem();

        if (selSwim != null) {
            sel2 = true;
        }
    }//GEN-LAST:event_cb_nad2ItemStateChanged

    private void cb_nad3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_nad3ItemStateChanged
        Nadador selSwim = (Nadador) cb_nad3.getSelectedItem();

        if (selSwim != null) {
            sel3 = true;
        }
    }//GEN-LAST:event_cb_nad3ItemStateChanged

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
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) cb_nadadoresPais.getModel();
        model.addAll(paises);
        model2.addAll(paises);
        cb_paises.setModel(model);
        cb_nadadoresPais.setModel(model2);
    }

    public void llenarNadadores() {
        aN.uploadFile();
        nadadores = aN.getListaNadadores();

        DefaultComboBoxModel model = (DefaultComboBoxModel) cb_nad1.getModel();
        DefaultComboBoxModel model1 = (DefaultComboBoxModel) cb_nad2.getModel();
        DefaultComboBoxModel model2 = (DefaultComboBoxModel) cb_nad3.getModel();

        model.addAll(nadadores);
        model1.addAll(nadadores);
        model2.addAll(nadadores);

        cb_nad1.setModel(model);
        cb_nad2.setModel(model1);
        cb_nad3.setModel(model2);

    }

    public void llenarEventos() {
        aE.uploadFile();
        eventos = aE.getListaEventos();

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

    HiloSimu hS;
    HiloSimu hS1;
    HiloSimu hS2;

    Boolean sel1 = false;
    Boolean sel2 = false;
    Boolean sel3 = false;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addPais;
    private javax.swing.JButton btn_agregarEvento;
    private javax.swing.JButton btn_agregarNadador;
    private javax.swing.JButton btn_beginRace;
    private javax.swing.JComboBox<String> cb_distanciaNadador;
    private javax.swing.JComboBox<String> cb_distancias;
    private javax.swing.JComboBox<String> cb_estilos;
    private javax.swing.JComboBox<String> cb_estilosNadador;
    private javax.swing.JComboBox<String> cb_nad1;
    private javax.swing.JComboBox<String> cb_nad2;
    private javax.swing.JComboBox<String> cb_nad3;
    private javax.swing.JComboBox<String> cb_nadadoresPais;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jt_eventos;
    private javax.swing.JTable jt_nadadores;
    private javax.swing.JMenuItem mi_eliminar;
    private javax.swing.JMenuItem mi_eliminarE;
    private javax.swing.JMenuItem mi_modificar;
    private javax.swing.JMenuItem mi_modificarE;
    private javax.swing.JProgressBar pb_1;
    private javax.swing.JProgressBar pb_2;
    private javax.swing.JProgressBar pb_3;
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
