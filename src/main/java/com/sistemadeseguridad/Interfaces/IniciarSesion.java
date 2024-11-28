package com.sistemadeseguridad.Interfaces;

import com.sistemadeseguridad.SistemaDeSeguridad.FormularioPrincipal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sistemadeseguridad.Tools.Usuario;
import com.sistemadeseguridad.Tools.Modelos;

public class IniciarSesion extends javax.swing.JPanel {

    public IniciarSesion(FormularioPrincipal formulario) {
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

        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setPreferredSize(new java.awt.Dimension(400, 600));

        jLabel1.setFont(new java.awt.Font("Nunito ExtraLight", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Bienvenid@!");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Correo");

        correoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        passwordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        passwordField.setActionCommand("null");
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
        boton.setText("Iniciar sesión");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(showPassword)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
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


    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed

        String correo = correoField.getText();
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

                if (!Usuario.existeUsuario(correo)) {
                    javax.swing.JOptionPane.showMessageDialog(
                            this,
                            "Usuario no encontrado, favor de introducir un usuario válido o registrarse.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                    );
                }
                else if (!Usuario.validarCredenciales(correo, hashedPassword)) {
                    javax.swing.JOptionPane.showMessageDialog(
                            this,
                            "Contraseña incorrecta",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                    );
                }
                else {
                    Modelos.setCorreo(correo);
                    
                    Directorio segundoDirectorio = new Directorio();
                    segundoDirectorio.setVisible(true);
                    
                    correoField.setText("");
                    passwordField.setText("");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JCheckBox showPassword;
    // End of variables declaration//GEN-END:variables
}
