package com.mycompany.biblioteca.igu;

import com.mycompany.biblioteca.igu.Paneles.BuscarLibros;
import com.mycompany.biblioteca.igu.Paneles.MisPrestamos;
import com.mycompany.biblioteca.logica.Controladora;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DashBoard_Visitante extends javax.swing.JFrame {

    Controladora control;
    Mensaje mensaje;
    BuscarLibros pBuscarLibros;
    MisPrestamos pMisPrestamos;

    public DashBoard_Visitante(Controladora control, Mensaje mensaje, BuscarLibros pBuscarLibros, MisPrestamos pMisPrestamos) {
        initComponents();
        this.control = control;
        this.mensaje = mensaje;
        this.pBuscarLibros = pBuscarLibros;
        this.pMisPrestamos = pMisPrestamos;
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
        panelCambiante = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        lblNombreDelUsuario.setText("Visitante");
        pMenuLateral.add(lblNombreDelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, 194, -1));

        lblRolUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRolUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblRolUsuario.setText("Visitante");
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
        btnMisPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMisPrestamosActionPerformed(evt);
            }
        });
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
        btnBuscarLibrosVisit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibrosVisitActionPerformed(evt);
            }
        });
        pMenuLateral.add(btnBuscarLibrosVisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        javax.swing.GroupLayout panelCambianteLayout = new javax.swing.GroupLayout(panelCambiante);
        panelCambiante.setLayout(panelCambianteLayout);
        panelCambianteLayout.setHorizontalGroup(
            panelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCambianteLayout.setVerticalGroup(
            panelCambianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(panelCambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarVisita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnMisPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMisPrestamosActionPerformed
        pintarPanel(pMisPrestamos);
        cambiarColorBotones(btnMisPrestamos);
    }//GEN-LAST:event_btnMisPrestamosActionPerformed

    private void btnBuscarLibrosVisitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibrosVisitActionPerformed
        pintarPanel(pBuscarLibros);
        cambiarColorBotones(btnBuscarLibrosVisit);
    }//GEN-LAST:event_btnBuscarLibrosVisitActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        pintarPanel(pMisPrestamos);
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLibrosVisit;
    private javax.swing.JLabel btnCerrarVisita;
    private javax.swing.JButton btnMisPrestamos;
    private javax.swing.JLabel lblNombreDelUsuario;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pMenuLateral;
    private javax.swing.JPanel panelCambiante;
    // End of variables declaration//GEN-END:variables

    private void pintarPanel(JPanel p) {
        p.setSize(751, 660);
        p.setLocation(0, 0);

        panelCambiante.removeAll();
        panelCambiante.add(p, BorderLayout.CENTER);
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }

    private void cambiarColorBotones(JButton boton) {
        Color colorBotonSeleccionado = new Color(23, 46, 222);
        Color colorBotones = new Color(53, 100, 252);

        btnBuscarLibrosVisit.setBackground(colorBotones);
        btnMisPrestamos.setBackground(colorBotones);
        boton.setBackground(colorBotonSeleccionado);
    }

}
