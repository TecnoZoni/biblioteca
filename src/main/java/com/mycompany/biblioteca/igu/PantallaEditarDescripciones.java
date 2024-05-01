package com.mycompany.biblioteca.igu;

import com.mycompany.biblioteca.logica.Autor;
import com.mycompany.biblioteca.logica.Controladora;
import com.mycompany.biblioteca.logica.Editorial;
import com.mycompany.biblioteca.logica.Genero;

public class PantallaEditarDescripciones extends javax.swing.JFrame {

    String tipo;
    Controladora control;
    Mensaje mensaje;
    int id;
    Genero gen;
    Autor aut;
    Editorial edit;

    public PantallaEditarDescripciones(Controladora control, Mensaje mensaje, String tipo, int id) {
        initComponents();
        this.mensaje = mensaje;
        this.control = control;
        this.tipo = tipo;
        this.id = id;
        txtApellido.setVisible(false);
        lblApellido.setVisible(false);

        ponerTitulo();
        cargarDato(this.tipo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFonto = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pFonto.setBackground(new java.awt.Color(255, 255, 255));
        pFonto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pTitulo.setBackground(new java.awt.Color(99, 146, 255));

        txtTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(255, 255, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setText("Modificar ...");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        lblApellido.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        lblApellido.setText("Apellido:");

        btnModificar.setBackground(new java.awt.Color(53, 100, 252));
        btnModificar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(53, 100, 252));
        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pFontoLayout = new javax.swing.GroupLayout(pFonto);
        pFonto.setLayout(pFontoLayout);
        pFontoLayout.setHorizontalGroup(
            pFontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pFontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pFontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(pFontoLayout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(pFontoLayout.createSequentialGroup()
                        .addComponent(lblApellido)
                        .addGap(33, 33, 33)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pFontoLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFontoLayout.setVerticalGroup(
            pFontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFontoLayout.createSequentialGroup()
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pFontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(pFontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellido))
                .addGap(18, 18, 18)
                .addGroup(pFontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (tipo.equals("Autor")) {
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();

            control.editarAutor(aut, nombre, apellido);
            mensaje.mostrarMensaje("Autor modificado con exito", "Info", "Modificacion Exitosa");
            this.dispose();
        }

        if (tipo.equals("Editorial")) {
            String nombre = txtNombre.getText();

            control.editarEditorial(edit, nombre);
            mensaje.mostrarMensaje("Editorial modificada con exito", "Info", "Modificacion Exitosa");
            this.dispose();
        }

        if (tipo.equals("Genero")) {
            String nombre = txtNombre.getText();
            
            control.editarGenero(gen,nombre);
             mensaje.mostrarMensaje("Genero modificado con exito", "Info", "Modificacion Exitosa");
            this.dispose();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JPanel pFonto;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    private void ponerTitulo() {
        txtTitulo.setText("Mosidicar " + tipo);
    }

    private void cargarDato(String tipo) {
        if (tipo.equals("Autor")) {
            aut = control.traerAutor(id);

            txtApellido.setVisible(true);
            lblApellido.setVisible(true);

            txtNombre.setText(aut.getNombre());
            txtApellido.setText(aut.getApellido());
        }

        if (tipo.equals("Editorial")) {
            edit = control.traerEditorial(id);

            txtNombre.setText(edit.getNombre());
        }

        if (tipo.equals("Genero")) {
            gen = control.traerGenero(id);

            txtNombre.setText(gen.getNombre());
        }

    }

}
