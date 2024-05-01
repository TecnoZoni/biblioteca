package com.mycompany.biblioteca.igu.Paneles;

import com.mycompany.biblioteca.igu.Mensaje;
import com.mycompany.biblioteca.igu.PantallaEditarDescripciones;
import com.mycompany.biblioteca.logica.Autor;
import com.mycompany.biblioteca.logica.Controladora;
import com.mycompany.biblioteca.logica.Editorial;
import com.mycompany.biblioteca.logica.Genero;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GestionDescripciones extends javax.swing.JPanel {

    Controladora control;
    Mensaje mensaje;
    PantallaEditarDescripciones pantaEditar;

    public GestionDescripciones(Mensaje mensaje, Controladora control) {
        initComponents();
        this.mensaje = mensaje;
        this.control = control;
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pTitulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAutores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreAutores = new javax.swing.JTextField();
        txtApellidoAutores = new javax.swing.JTextField();
        btnLimpiarAutor = new javax.swing.JButton();
        btnGuardarAutor = new javax.swing.JButton();
        btnModificarAutor = new javax.swing.JButton();
        btnEliminarAutor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEditoriales = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEditoriales = new javax.swing.JTextField();
        btnGuardarEditorial = new javax.swing.JButton();
        btnLimpiarEditorial = new javax.swing.JButton();
        btnModificarEditorial = new javax.swing.JButton();
        btnEliminarEditorial = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaGeneros = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreGeneros = new javax.swing.JTextField();
        btnGuardarGenero = new javax.swing.JButton();
        btnLimpiarGenero = new javax.swing.JButton();
        btnModificarGenero = new javax.swing.JButton();
        btnEliminarGenero = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pTitulo.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Titulo.setText("Gestion de Autores, Editoriales y Géneros");

        javax.swing.GroupLayout pTituloLayout = new javax.swing.GroupLayout(pTitulo);
        pTitulo.setLayout(pTituloLayout);
        pTituloLayout.setHorizontalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        pTituloLayout.setVerticalGroup(
            pTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tablaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaAutores);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel1.setText("Autores");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setText("Apellido:");

        txtNombreAutores.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        txtApellidoAutores.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        btnLimpiarAutor.setBackground(new java.awt.Color(53, 100, 252));
        btnLimpiarAutor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLimpiarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarAutor.setText("Limpiar");
        btnLimpiarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarAutorActionPerformed(evt);
            }
        });

        btnGuardarAutor.setBackground(new java.awt.Color(53, 100, 252));
        btnGuardarAutor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnGuardarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAutor.setText("Guardar");
        btnGuardarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAutorActionPerformed(evt);
            }
        });

        btnModificarAutor.setBackground(new java.awt.Color(53, 100, 252));
        btnModificarAutor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnModificarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarAutor.setText("Modifcar");
        btnModificarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAutorActionPerformed(evt);
            }
        });

        btnEliminarAutor.setBackground(new java.awt.Color(53, 100, 252));
        btnEliminarAutor.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnEliminarAutor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarAutor.setText("Eliminar");
        btnEliminarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnModificarAutor)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarAutor))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarAutor)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarAutor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombreAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtApellidoAutores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarAutor)
                            .addComponent(btnLimpiarAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarAutor)
                            .addComponent(btnEliminarAutor))))
                .addGap(257, 257, 257))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tablaEditoriales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaEditoriales);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Editoriales");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel6.setText("Nombre:");

        txtNombreEditoriales.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        btnGuardarEditorial.setBackground(new java.awt.Color(53, 100, 252));
        btnGuardarEditorial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnGuardarEditorial.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEditorial.setText("Guardar");
        btnGuardarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEditorialActionPerformed(evt);
            }
        });

        btnLimpiarEditorial.setBackground(new java.awt.Color(53, 100, 252));
        btnLimpiarEditorial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLimpiarEditorial.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarEditorial.setText("Limpiar");
        btnLimpiarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarEditorialActionPerformed(evt);
            }
        });

        btnModificarEditorial.setBackground(new java.awt.Color(53, 100, 252));
        btnModificarEditorial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnModificarEditorial.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarEditorial.setText("Modifcar");
        btnModificarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEditorialActionPerformed(evt);
            }
        });

        btnEliminarEditorial.setBackground(new java.awt.Color(53, 100, 252));
        btnEliminarEditorial.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnEliminarEditorial.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEditorial.setText("Eliminar");
        btnEliminarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnModificarEditorial)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarEditorial))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnGuardarEditorial)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpiarEditorial))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNombreEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarEditorial)
                            .addComponent(btnLimpiarEditorial))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarEditorial)
                            .addComponent(btnEliminarEditorial)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(277, 277, 277))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tablaGeneros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaGeneros);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setText("Géneros");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel7.setText("Nombre:");

        txtNombreGeneros.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N

        btnGuardarGenero.setBackground(new java.awt.Color(53, 100, 252));
        btnGuardarGenero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnGuardarGenero.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarGenero.setText("Guardar");
        btnGuardarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarGeneroActionPerformed(evt);
            }
        });

        btnLimpiarGenero.setBackground(new java.awt.Color(53, 100, 252));
        btnLimpiarGenero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLimpiarGenero.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarGenero.setText("Limpiar");
        btnLimpiarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarGeneroActionPerformed(evt);
            }
        });

        btnModificarGenero.setBackground(new java.awt.Color(53, 100, 252));
        btnModificarGenero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnModificarGenero.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarGenero.setText("Modifcar");
        btnModificarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGeneroActionPerformed(evt);
            }
        });

        btnEliminarGenero.setBackground(new java.awt.Color(53, 100, 252));
        btnEliminarGenero.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnEliminarGenero.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarGenero.setText("Eliminar");
        btnEliminarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnModificarGenero)
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminarGenero))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(btnGuardarGenero)
                            .addGap(18, 18, 18)
                            .addComponent(btnLimpiarGenero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombreGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarGenero)
                            .addComponent(btnLimpiarGenero))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModificarGenero)
                            .addComponent(btnEliminarGenero)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(277, 277, 277))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarAutorActionPerformed
        limpiarAutores();
    }//GEN-LAST:event_btnLimpiarAutorActionPerformed

    private void btnGuardarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAutorActionPerformed
        String nombreAutor = txtNombreAutores.getText();
        String apellidoAutor = txtApellidoAutores.getText();

        control.crearAutor(nombreAutor, apellidoAutor);

        mensaje.mostrarMensaje("El autor fue guardada con exito", "Info", "Guardado de Autor");
        limpiarAutores();
        cargarTablas();
    }//GEN-LAST:event_btnGuardarAutorActionPerformed

    private void btnModificarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAutorActionPerformed
        if (seleccionarId(tablaAutores) != 0) {
            mostrarPantaModificar(control, mensaje, "Autor", seleccionarId(tablaAutores));
        }
    }//GEN-LAST:event_btnModificarAutorActionPerformed

    private void btnEliminarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAutorActionPerformed
        if (seleccionarId(tablaAutores) != 0) {
            control.eliminarAutor(seleccionarId(tablaAutores));
            mensaje.mostrarMensaje("Se borró correctamente", "Info", "Eliminación Correcta");
            cargarTablas();
        }
    }//GEN-LAST:event_btnEliminarAutorActionPerformed

    private void btnGuardarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEditorialActionPerformed
        String nombreEditorial = txtNombreEditoriales.getText();

        control.crearEditorial(nombreEditorial);

        mensaje.mostrarMensaje("La editorial fue guardada con exito", "Info", "Guardado de editorial");
        limpiarEditorial();
        cargarTablas();
    }//GEN-LAST:event_btnGuardarEditorialActionPerformed

    private void btnLimpiarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarEditorialActionPerformed
        limpiarEditorial();
    }//GEN-LAST:event_btnLimpiarEditorialActionPerformed

    private void btnModificarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEditorialActionPerformed
        if (seleccionarId(tablaEditoriales) != 0) {
            mostrarPantaModificar(control, mensaje, "Editorial", seleccionarId(tablaEditoriales));
        }
    }//GEN-LAST:event_btnModificarEditorialActionPerformed

    private void btnEliminarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEditorialActionPerformed
        if (seleccionarId(tablaEditoriales) != 0) {
            control.eliminarEditorial(seleccionarId(tablaEditoriales));
            mensaje.mostrarMensaje("Se borró correctamente", "Info", "Eliminación Correcta");
            cargarTablas();
        }
    }//GEN-LAST:event_btnEliminarEditorialActionPerformed

    private void btnGuardarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarGeneroActionPerformed
        String nombreGenero = txtNombreGeneros.getText();

        control.crearGenero(nombreGenero);

        mensaje.mostrarMensaje("Genero guardado con exito", "Info", "Guardado de Genero");
        limpiarGeneros();
        cargarTablas();
    }//GEN-LAST:event_btnGuardarGeneroActionPerformed

    private void btnLimpiarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarGeneroActionPerformed
        limpiarGeneros();
    }//GEN-LAST:event_btnLimpiarGeneroActionPerformed

    private void btnModificarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGeneroActionPerformed
        if (seleccionarId(tablaGeneros) != 0) {
            mostrarPantaModificar(control, mensaje, "Genero", seleccionarId(tablaGeneros));
        }
    }//GEN-LAST:event_btnModificarGeneroActionPerformed

    private void btnEliminarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarGeneroActionPerformed
        if (seleccionarId(tablaGeneros) != 0) {
            control.eliminarGenero(seleccionarId(tablaGeneros));
            mensaje.mostrarMensaje("Se borró correctamente", "Info", "Eliminación Correcta");
            cargarTablas();
        }
    }//GEN-LAST:event_btnEliminarGeneroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnEliminarAutor;
    private javax.swing.JButton btnEliminarEditorial;
    private javax.swing.JButton btnEliminarGenero;
    private javax.swing.JButton btnGuardarAutor;
    private javax.swing.JButton btnGuardarEditorial;
    private javax.swing.JButton btnGuardarGenero;
    private javax.swing.JButton btnLimpiarAutor;
    private javax.swing.JButton btnLimpiarEditorial;
    private javax.swing.JButton btnLimpiarGenero;
    private javax.swing.JButton btnModificarAutor;
    private javax.swing.JButton btnModificarEditorial;
    private javax.swing.JButton btnModificarGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JTable tablaAutores;
    private javax.swing.JTable tablaEditoriales;
    private javax.swing.JTable tablaGeneros;
    private javax.swing.JTextField txtApellidoAutores;
    private javax.swing.JTextField txtNombreAutores;
    private javax.swing.JTextField txtNombreEditoriales;
    private javax.swing.JTextField txtNombreGeneros;
    // End of variables declaration//GEN-END:variables

    private void cargarTablas() {
        DefaultTableModel tablaAutor, tablaEditorial, tablaGenero;
        tablaAutor = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaEditorial = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaGenero = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulosAutor[] = {"id_autor", "Nombre", "Apellido"};
        tablaAutor.setColumnIdentifiers(titulosAutor);

        String titulosEditorial[] = {"id_editorial", "Nombre"};
        tablaEditorial.setColumnIdentifiers(titulosEditorial);

        String titulosGenero[] = {"id_genero", "Nombre"};
        tablaGenero.setColumnIdentifiers(titulosGenero);

        List<Autor> listaAutores = control.traerAutores();
        List<Editorial> listaEditoriales = control.traerEditoriales();
        List<Genero> listaGeneros = control.traerGeneros();

        if (listaAutores != null) {
            for (Autor aut : listaAutores) {
                Object[] objeto = {aut.getId_autor(), aut.getNombre(), aut.getApellido()};

                tablaAutor.addRow(objeto);
            }
        }

        if (listaEditoriales != null) {
            for (Editorial edi : listaEditoriales) {
                Object[] objeto = {edi.getId_editorial(), edi.getNombre()};

                tablaEditorial.addRow(objeto);
            }
        }

        if (listaGeneros != null) {
            for (Genero gen : listaGeneros) {
                Object[] objeto = {gen.getId_genero(), gen.getNombre()};

                tablaGenero.addRow(objeto);
            }
        }

        tablaAutores.setModel(tablaAutor);
        tablaEditoriales.setModel(tablaEditorial);
        tablaGeneros.setModel(tablaGenero);

    }

    private void limpiarAutores() {
        txtNombreAutores.setText("");
        txtApellidoAutores.setText("");
        cargarTablas();
    }

    private void limpiarEditorial() {
        txtNombreEditoriales.setText("");
        cargarTablas();
    }

    private void limpiarGeneros() {
        txtNombreGeneros.setText("");
        cargarTablas();
    }

    private int seleccionarId(JTable tabla) {
        if (tabla.getRowCount() > 0) {
            if (tabla.getSelectedRow() != -1) {
                int id_genero = Integer.parseInt(String.valueOf(tabla.getValueAt(tabla.getSelectedRow(), 0)));
                return id_genero;
            } else {
                mensaje.mostrarMensaje("No selecciono ningún resgistro", "Error", "Error al borrar");

            }
        } else {
            mensaje.mostrarMensaje("La tabla está vacia", "Error", "Error al borrar");

        }
        return 0;
    }

    private void mostrarPantaModificar(Controladora control, Mensaje mensaje, String tipo, int id) {
        pantaEditar = new PantallaEditarDescripciones(control, mensaje, tipo, id);
        pantaEditar.setVisible(true);
        pantaEditar.setLocationRelativeTo(null);
    }

}
