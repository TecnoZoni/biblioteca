package com.mycompany.biblioteca.igu;

import com.mycompany.biblioteca.logica.Controladora;
import com.mycompany.biblioteca.logica.Usuario;
import java.awt.Color;

public class DashBoard extends javax.swing.JFrame {

    Controladora control;
    Mensaje mensaje;
    Usuario user;

    public DashBoard(Controladora control, Mensaje mensaje, Usuario user) {
        initComponents();
        this.control = control;
        this.mensaje = mensaje;
        this.user = user;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pFondo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("X");

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoLayout.createSequentialGroup()
                .addContainerGap(679, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(480, Short.MAX_VALUE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnCerrar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pFondo;
    // End of variables declaration//GEN-END:variables
}
