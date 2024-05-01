package com.mycompany.biblioteca.igu;

import com.mycompany.biblioteca.igu.Paneles.GestionDescripciones;
import com.mycompany.biblioteca.igu.Paneles.GestionUsuarios;
import com.mycompany.biblioteca.logica.Controladora;
import com.mycompany.biblioteca.logica.Usuario;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DashBoard extends javax.swing.JFrame {

    Controladora control;
    Mensaje mensaje;
    Usuario user;
    GestionUsuarios pGestionUsuarios;
    GestionDescripciones pGestionDescripciones;

    public DashBoard(Controladora control, Mensaje mensaje, Usuario user, GestionUsuarios pGestionUsuarios, GestionDescripciones pGestionDescripciones) {
        initComponents();
        this.control = control;
        this.mensaje = mensaje;
        this.user = user;
        this.pGestionUsuarios = pGestionUsuarios;
        this.pGestionDescripciones= pGestionDescripciones;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        btnCerrarAdmin = new javax.swing.JLabel();
        pMenuLateral = new javax.swing.JPanel();
        lblNombreDelUsuario = new javax.swing.JLabel();
        lblRolUsuario = new javax.swing.JLabel();
        btnPrestamos = new javax.swing.JButton();
        btnBuscarLibros = new javax.swing.JButton();
        btnNuevoPrestamo = new javax.swing.JButton();
        btnGestionLibros = new javax.swing.JButton();
        btnGestionUsuarios = new javax.swing.JButton();
        btnDescripciones = new javax.swing.JButton();
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

        btnCerrarAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrarAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCerrarAdmin.setText("X");
        btnCerrarAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarAdminMouseExited(evt);
            }
        });

        pMenuLateral.setBackground(new java.awt.Color(99, 146, 255));
        pMenuLateral.setMaximumSize(new java.awt.Dimension(234, 710));
        pMenuLateral.setMinimumSize(new java.awt.Dimension(234, 710));
        pMenuLateral.setPreferredSize(new java.awt.Dimension(234, 710));

        lblNombreDelUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNombreDelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreDelUsuario.setText("Nombre del Usuario");

        lblRolUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblRolUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblRolUsuario.setText("Rol del Usuario");

        btnPrestamos.setBackground(new java.awt.Color(23, 46, 222));
        btnPrestamos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nota 1.png"))); // NOI18N
        btnPrestamos.setText("Préstamos");
        btnPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrestamos.setMaximumSize(new java.awt.Dimension(234, 70));
        btnPrestamos.setMinimumSize(new java.awt.Dimension(234, 70));
        btnPrestamos.setPreferredSize(new java.awt.Dimension(234, 70));
        btnPrestamos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamosActionPerformed(evt);
            }
        });

        btnBuscarLibros.setBackground(new java.awt.Color(53, 100, 252));
        btnBuscarLibros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBuscarLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busqueda 1.png"))); // NOI18N
        btnBuscarLibros.setText("Buscar Libros");
        btnBuscarLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarLibros.setMaximumSize(new java.awt.Dimension(234, 70));
        btnBuscarLibros.setMinimumSize(new java.awt.Dimension(234, 70));
        btnBuscarLibros.setPreferredSize(new java.awt.Dimension(234, 70));
        btnBuscarLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibrosActionPerformed(evt);
            }
        });

        btnNuevoPrestamo.setBackground(new java.awt.Color(53, 100, 252));
        btnNuevoPrestamo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnNuevoPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nuevo 1.png"))); // NOI18N
        btnNuevoPrestamo.setText("Nuevo Préstamo");
        btnNuevoPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevoPrestamo.setMaximumSize(new java.awt.Dimension(234, 70));
        btnNuevoPrestamo.setMinimumSize(new java.awt.Dimension(234, 70));
        btnNuevoPrestamo.setPreferredSize(new java.awt.Dimension(234, 70));
        btnNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPrestamoActionPerformed(evt);
            }
        });

        btnGestionLibros.setBackground(new java.awt.Color(53, 100, 252));
        btnGestionLibros.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGestionLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libro 1.png"))); // NOI18N
        btnGestionLibros.setText("Gestion de Libros");
        btnGestionLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionLibros.setMaximumSize(new java.awt.Dimension(234, 70));
        btnGestionLibros.setMinimumSize(new java.awt.Dimension(234, 70));
        btnGestionLibros.setPreferredSize(new java.awt.Dimension(234, 70));
        btnGestionLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionLibrosActionPerformed(evt);
            }
        });

        btnGestionUsuarios.setBackground(new java.awt.Color(53, 100, 252));
        btnGestionUsuarios.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnGestionUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnGestionUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user-interface 1.png"))); // NOI18N
        btnGestionUsuarios.setText("Gestion de Usuarios");
        btnGestionUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGestionUsuarios.setMaximumSize(new java.awt.Dimension(234, 70));
        btnGestionUsuarios.setMinimumSize(new java.awt.Dimension(234, 70));
        btnGestionUsuarios.setPreferredSize(new java.awt.Dimension(234, 70));
        btnGestionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionUsuariosActionPerformed(evt);
            }
        });

        btnDescripciones.setBackground(new java.awt.Color(53, 100, 252));
        btnDescripciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnDescripciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDescripciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion-de-equipos 1.png"))); // NOI18N
        btnDescripciones.setText("Descripciónes");
        btnDescripciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDescripciones.setMaximumSize(new java.awt.Dimension(234, 70));
        btnDescripciones.setMinimumSize(new java.awt.Dimension(234, 70));
        btnDescripciones.setPreferredSize(new java.awt.Dimension(234, 70));
        btnDescripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescripcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMenuLateralLayout = new javax.swing.GroupLayout(pMenuLateral);
        pMenuLateral.setLayout(pMenuLateralLayout);
        pMenuLateralLayout.setHorizontalGroup(
            pMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnGestionLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDescripciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pMenuLateralLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreDelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pMenuLateralLayout.setVerticalGroup(
            pMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLateralLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblNombreDelUsuario)
                .addGap(6, 6, 6)
                .addComponent(lblRolUsuario)
                .addGap(34, 34, 34)
                .addComponent(btnPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnGestionLibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDescripciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                        .addComponent(btnCerrarAdmin))
                    .addComponent(panelCambiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrarAdmin)
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

    private void btnCerrarAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarAdminMouseClicked
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCerrarAdminMouseClicked

    private void btnCerrarAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarAdminMouseEntered
        Color colorTexto = new Color(53, 100, 252);
        btnCerrarAdmin.setForeground(colorTexto);
    }//GEN-LAST:event_btnCerrarAdminMouseEntered

    private void btnCerrarAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarAdminMouseExited
        Color colorTexto = new Color(0, 0, 0);
        btnCerrarAdmin.setForeground(colorTexto);
    }//GEN-LAST:event_btnCerrarAdminMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblNombreDelUsuario.setText(user.getNombre() + " " + user.getApellido());
        lblRolUsuario.setText(user.getUnrol().getNombre_rol());

    }//GEN-LAST:event_formWindowOpened

    private void btnPrestamosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamosActionPerformed

        cambiarColorBotones(btnPrestamos);
    }//GEN-LAST:event_btnPrestamosActionPerformed

    private void btnBuscarLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibrosActionPerformed

        cambiarColorBotones(btnBuscarLibros);
    }//GEN-LAST:event_btnBuscarLibrosActionPerformed

    private void btnNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPrestamoActionPerformed

        cambiarColorBotones(btnNuevoPrestamo);
    }//GEN-LAST:event_btnNuevoPrestamoActionPerformed

    private void btnGestionLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionLibrosActionPerformed

        cambiarColorBotones(btnGestionLibros);
    }//GEN-LAST:event_btnGestionLibrosActionPerformed

    private void btnGestionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUsuariosActionPerformed
        pintarPanel(pGestionUsuarios);
        cambiarColorBotones(btnGestionUsuarios);
    }//GEN-LAST:event_btnGestionUsuariosActionPerformed

    private void btnDescripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescripcionesActionPerformed
        pintarPanel(pGestionDescripciones);
        cambiarColorBotones(btnDescripciones);
    }//GEN-LAST:event_btnDescripcionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarLibros;
    private javax.swing.JLabel btnCerrarAdmin;
    private javax.swing.JButton btnDescripciones;
    private javax.swing.JButton btnGestionLibros;
    private javax.swing.JButton btnGestionUsuarios;
    private javax.swing.JButton btnNuevoPrestamo;
    private javax.swing.JButton btnPrestamos;
    private javax.swing.JLabel lblNombreDelUsuario;
    private javax.swing.JLabel lblRolUsuario;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pMenuLateral;
    private javax.swing.JPanel panelCambiante;
    // End of variables declaration//GEN-END:variables

    private void pintarPanel(JPanel p) {
        // Establecer layout manager del panel padre como BorderLayout
        panelCambiante.setLayout(new BorderLayout());

        // Añadir el panel al centro del panel padre
        panelCambiante.removeAll();
        panelCambiante.add(p, BorderLayout.CENTER);

        // Revalidar y repintar el panel padre
        panelCambiante.revalidate();
        panelCambiante.repaint();
    }

    private void cambiarColorBotones(JButton boton) {
        Color colorBotonSeleccionado = new Color(23, 46, 222);
        Color colorBotones = new Color(53, 100, 252);

        btnBuscarLibros.setBackground(colorBotones);
        btnPrestamos.setBackground(colorBotones);
        btnGestionLibros.setBackground(colorBotones);
        btnGestionUsuarios.setBackground(colorBotones);
        btnNuevoPrestamo.setBackground(colorBotones);
        boton.setBackground(colorBotonSeleccionado);
    }
}
