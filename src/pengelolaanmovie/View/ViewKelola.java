package pengelolaanmovie.View;

import pengelolaanmovie.Controller.MovieController;
import pengelolaanmovie.DAO.DataMovieDao;

public class ViewKelola extends javax.swing.JFrame {
    DataMovieDao dao;
    private int id;
    MovieController controller;
    public ViewKelola() {
        initComponents();
        dao = new DataMovieDao();
        controller = new MovieController(this, dao);
        controller.loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKelola = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jfJudul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jfAlur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jfPenokohan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jfAkting = new javax.swing.JTextField();
        buttonEdit = new javax.swing.JButton();
        buttonTambah = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableKelola.setBackground(new java.awt.Color(255, 255, 255));
        tableKelola.setForeground(new java.awt.Color(0, 0, 0));
        tableKelola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Alur", "Penokohan", "Akting", "Nilai"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableKelola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKelolaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKelola);
        if (tableKelola.getColumnModel().getColumnCount() > 0) {
            tableKelola.getColumnModel().getColumn(0).setResizable(false);
            tableKelola.getColumnModel().getColumn(1).setResizable(false);
            tableKelola.getColumnModel().getColumn(2).setResizable(false);
            tableKelola.getColumnModel().getColumn(3).setResizable(false);
            tableKelola.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Judul");

        jfJudul.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Alur  (0 - 5)");

        jfAlur.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Penokohan  (0 - 5)");

        jfPenokohan.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Akting  (0 - 5)");

        jfAkting.setBackground(new java.awt.Color(255, 255, 255));

        buttonEdit.setBackground(new java.awt.Color(51, 51, 255));
        buttonEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonEdit.setForeground(new java.awt.Color(255, 255, 255));
        buttonEdit.setText("Edit");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonTambah.setBackground(new java.awt.Color(51, 51, 255));
        buttonTambah.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonTambah.setForeground(new java.awt.Color(255, 255, 255));
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonClear.setBackground(new java.awt.Color(51, 51, 255));
        buttonClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonClear.setForeground(new java.awt.Color(255, 255, 255));
        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        buttonHapus.setBackground(new java.awt.Color(51, 51, 255));
        buttonHapus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        buttonHapus.setForeground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jfAlur, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jfPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jfAkting, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfAlur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jfAkting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit)
                    .addComponent(buttonTambah))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonClear)
                    .addComponent(buttonHapus))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        controller.tambahData();
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void tableKelolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKelolaMouseClicked
        controller.mouseClick();
    }//GEN-LAST:event_tableKelolaMouseClicked

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        controller.edit();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        controller.hapus();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        controller.clear();
    }//GEN-LAST:event_buttonClearActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewKelola().setVisible(true);
            }
        });
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public javax.swing.JTable getTable() {
        return this.tableKelola;
    }
    
    public javax.swing.JTextField getjfJudul() {
        return this.jfJudul;
    }
    
    public javax.swing.JTextField getjfAlur() {
        return this.jfAlur;
    }
    
    public javax.swing.JTextField getjfAkting() {
        return this.jfAkting;
    }
    
    public javax.swing.JTextField getjfPenokohan() {
        return this.jfPenokohan;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jfAkting;
    private javax.swing.JTextField jfAlur;
    private javax.swing.JTextField jfJudul;
    private javax.swing.JTextField jfPenokohan;
    private javax.swing.JTable tableKelola;
    // End of variables declaration//GEN-END:variables
}
