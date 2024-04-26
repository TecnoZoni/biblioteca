package com.mycompany.biblioteca.igu;

import com.mycompany.biblioteca.logica.Controladora;
import com.mycompany.biblioteca.logica.Usuario;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

public class Login extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Mensaje mensaje = new Mensaje();

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        pImagenIzquierda = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pFormularioDerecha = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        btnPanelVisitante = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(789, 439));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        pFondo.setBackground(new java.awt.Color(255, 255, 255));

        pImagenIzquierda.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen del Login.png"))); // NOI18N

        javax.swing.GroupLayout pImagenIzquierdaLayout = new javax.swing.GroupLayout(pImagenIzquierda);
        pImagenIzquierda.setLayout(pImagenIzquierdaLayout);
        pImagenIzquierdaLayout.setHorizontalGroup(
            pImagenIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pImagenIzquierdaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pImagenIzquierdaLayout.setVerticalGroup(
            pImagenIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pImagenIzquierdaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(394, Short.MAX_VALUE))
        );

        pFormularioDerecha.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Iniciar Sesión");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel3.setLabelFor(txtDni);
        jLabel3.setText("DNI:");

        txtDni.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtDni.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        jLabel4.setLabelFor(txtContrasenia);
        jLabel4.setText("Contraseña:");

        txtContrasenia.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        txtContrasenia.setBorder(null);

        btnIniciarSesion.setBackground(new java.awt.Color(53, 100, 252));
        btnIniciarSesion.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        btnPanelVisitante.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        btnPanelVisitante.setForeground(new java.awt.Color(53, 100, 252));
        btnPanelVisitante.setText("Entrar como Miembro");
        btnPanelVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPanelVisitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPanelVisitanteMouseClicked(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(0, 0, 0));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCerrar.setText("X");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pFormularioDerechaLayout = new javax.swing.GroupLayout(pFormularioDerecha);
        pFormularioDerecha.setLayout(pFormularioDerechaLayout);
        pFormularioDerechaLayout.setHorizontalGroup(
            pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioDerechaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPanelVisitante))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, pFormularioDerechaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFormularioDerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        pFormularioDerechaLayout.setVerticalGroup(
            pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFormularioDerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pFormularioDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPanelVisitante)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addComponent(pImagenIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pFormularioDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pImagenIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pFormularioDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        if (!txtDni.getText().equals("")) {
            if (!txtContrasenia.getText().equals("")) {
                int dni = Integer.parseInt(txtDni.getText());
                String contrasenia = txtContrasenia.getText();

                Usuario user = control.comprobarUsuario(dni, contrasenia);
                if (user != null) {
                    if (user.getUnrol().getNombre_rol().equals("Administrador")) {
                        DashBoard abrir = new DashBoard(control, mensaje, user);
                        abrir.setVisible(true);

                        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                        abrir.setSize(screenSize.width, screenSize.height);

                        this.dispose();
                    }
                } else {
                    mensaje.mostrarMensaje("Usuario o Contraseña incorrectos", "Error", "Inicio de sesion");
                }
            } else {
                mensaje.mostrarMensaje("Por favor ingrese su contraseña", "Error", "Inicio de sesion");
            }
        } else {
            mensaje.mostrarMensaje("Por favor ingrese su Dni", "Error", "Inicio de sesion");
        }


    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnPanelVisitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPanelVisitanteMouseClicked
        DashBoard_Visitante abrir = new DashBoard_Visitante(control, mensaje);
        abrir.setVisible(true);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        abrir.setSize(screenSize.width, screenSize.height);

        this.dispose();
    }//GEN-LAST:event_btnPanelVisitanteMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        Color colorTexto = new Color(53, 100, 252);
        btnCerrar.setForeground(colorTexto);
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        Color colorTexto = new Color(0, 0, 0);
        btnCerrar.setForeground(colorTexto);
    }//GEN-LAST:event_btnCerrarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel btnPanelVisitante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pFormularioDerecha;
    private javax.swing.JPanel pImagenIzquierda;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
