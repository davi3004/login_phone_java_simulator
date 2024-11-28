package com.sistemadeseguridad.Interfaces;

import com.sistemadeseguridad.SistemaDeSeguridad.FormularioPrincipal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.io.*;
import com.sistemadeseguridad.Tools.Usuario;

public class Registro extends javax.swing.JPanel {

    public Registro(FormularioPrincipal formulario) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        showPassword = new javax.swing.JCheckBox();
        boton = new javax.swing.JButton();
        nombreField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edadSpinner = new javax.swing.JSpinner();

        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Nunito ExtraLight", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Hola!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Correo");

        correoField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        correoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        passwordField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passwordField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        showPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        showPassword.setText("Mostrar contraseña");
        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        boton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boton.setText("Registrarse");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        nombreField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Edad");

        edadSpinner.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        edadSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPassword)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(edadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(showPassword)
                .addGap(46, 46, 46)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void correoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {

            passwordField.setEchoChar((char) 0);
        }
        else {

            passwordField.setEchoChar('•');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

        String nombre = nombreField.getText().replace(",", "");
        String correo = correoField.getText().replace(",", "");
        String edad = edadSpinner.getValue().toString().replace(",", "");
        String password = new String(passwordField.getPassword());

        if (!correo.contains("@") || !correo.contains(".")) {
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Por favor, ingrese un correo válido",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE
            );
        }
        else if (correo.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese su correo electrónico.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else if (password.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese su contraseña.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else if (nombre.trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese su nombre.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else if (edad.trim().isEmpty() || edad.equals("0")) {
            javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese su edad.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else if (Usuario.existeUsuario(correo)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Este correo ya está registrado.",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else {
            try {
                MessageDigest digest = MessageDigest.getInstance("SHA-256");

                byte[] hash = digest.digest(password.getBytes());

                StringBuilder hexString = new StringBuilder();
                for (byte b : hash) {
                    String hex = Integer.toHexString(0xff & b);
                    if (hex.length() == 1) {
                        hexString.append('0');
                    }
                    hexString.append(hex);
                }
                String hashedPassword = hexString.toString();

                try (FileWriter escritorDeBufer = new FileWriter("usuarios.txt", true); BufferedWriter bw = new BufferedWriter(escritorDeBufer)) {

                    bw.write(Usuario.toCsvLine(nombre, correo, Integer.parseInt(edad), hashedPassword));

                    javax.swing.JOptionPane.showMessageDialog(
                            this,
                            "Usted ha sido registrado con éxito",
                            "Éxito",
                            javax.swing.JOptionPane.INFORMATION_MESSAGE
                    );

                    nombreField.setText("");
                    correoField.setText("");
                    edadSpinner.setValue(0);
                    passwordField.setText("");
                }
                catch (IOException e) {
                    e.printStackTrace();

                    javax.swing.JOptionPane.showMessageDialog(
                            this,
                            "Error al guardar el registro",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                    );
                }
            }
            catch (NoSuchAlgorithmException e) {
                e.printStackTrace();

                javax.swing.JOptionPane.showMessageDialog(
                        this,
                        "Error al procesar la contraseña",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }//GEN-LAST:event_botonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField correoField;
    private javax.swing.JSpinner edadSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables
}
