package com.mycompany.biblioteca.igu;

import com.mycompany.biblioteca.logica.Controladora;
import java.awt.Color;

public class DashBoard_Visitante extends javax.swing.JFrame {

    Controladora control;
    Mensaje mensaje;

    public DashBoard_Visitante(Controladora control, Mensaje mensaje) {
        initComponents();
        this.control = control;
        this.mensaje = mensaje;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        btnCerrarVisita = new javax.swing.JLabel();
        pMenuLateral = new javax.swing.JPanel();
        lblNombreDelUsuario = new javax.swing.JLabel();
        lblRolUsuario = new javax.swing.JLabel();
        btnMisPrestamos = new javax.swing.JButton();
        btnBuscarLibrosVisit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1001, 710));
        setResizable(false);

        pFondo.setBackground(new java.awt.Color(255, 255, 255));

        btnCerrarVisita.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarVisita.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCerrarVisita.setText("X");
        btnCerrarVisita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarVisitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarVisitaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarVisitaMouseExited(evt);
            }
        });

        pMenuLateral.setBackground(new java.awt.Color(99, 146, 255));
        pMenuLateral.setMaximumSize(new java.awt.Dimension(234, 710));
        pMenuLateral.setMinimumSize(new java.awt.Dimension(234, 710));
        pMenuLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreDelUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNombreDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelUsuario.setText("Nombre del Usuario");
        pMenuLateral.add(lblNombreDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 194, -1));

        lblRolUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRolUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblRolUsuario.setText("Rol del Usuario");
        pMenuLateral.add(lblRolUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, 194, -1));

        btnMisPrestamos.setBackground(new java.awt.Color(23, 46, 222));
        btnMisPrestamos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnMisPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnMisPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota 1.png"))); // NOI18N
        btnMisPrestamos.setText("Mis Préstamos");
        btnMisPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMisPrestamos.setMaximumSize(new java.awt.Dimension(234, 70));
        btnMisPrestamos.setMinimumSize(new java.awt.Dimension(234, 70));
        btnMisPrestamos.setPreferredSize(new java.awt.Dimension(234, 70));
        pMenuLateral.add(btnMisPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 154, -1, -1));

        btnBuscarLibrosVisit.setBackground(new java.awt.Color(53, 100, 252));
        btnBuscarLibrosVisit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBuscarLibrosVisit.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarLibrosVisit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busqueda 1.png"))); // NOI18N
        btnBuscarLibrosVisit.setText("Buscar Libros");
        btnBuscarLibrosVisit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarLibrosVisit.setMaximumSize(new java.awt.Dimension(234, 70));
        btnBuscarLibrosVisit.setMinimumSize(new java.awt.Dimension(234, 70));
        btnBuscarLibrosVisit.setPreferredSize(new java.awt.Dimension(234, 70));
        pMenuLateral.add(btnBuscarLibrosVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                .addComponent(pMenuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pFondoLayout.createSequentialGroup()
                        .addGap(0, 739, Short.MAX_VALUE)
                        .addComponent(btnCerrarVisita))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarVisita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarVisitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarVisitaMouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarVisitaMouseClicked

    private void btnCerrarVisitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarVisitaMouseEntered
        Color colorTexto = new Color(53, 100, 252);
        btnCerrarVisita.setForeground(colorTexto);
    }//GEN-LAST:event_btnCerrarVisitaMouseEntered

    private void btnCerrarVisitaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarVisitaMouseExited
        Color colorTexto = new Color(0, 0, 0);
        btnCerrarVisita.setForeground(colorTexto);
    }//GEN-LAST:event_btnCerrarVisitaMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLibrosVisit;
    private javax.swing.JLabel btnCerrarVisita;
    private javax.swing.JButton btnMisPrestamos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNombreDelUsuario;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pMenuLateral;
    // End of variables declaration//GEN-END:variables
}
