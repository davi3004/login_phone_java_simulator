package com.sistemadeseguridad.SistemaDeSeguridad;

import com.sistemadeseguridad.Interfaces.IniciarSesion;
import com.sistemadeseguridad.Interfaces.Registro;
import com.formdev.flatlaf.intellijthemes.FlatArcDarkIJTheme;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class FormularioPrincipal extends javax.swing.JFrame {

    public FormularioPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        IniciarSesion iniciarSesion = new IniciarSesion(this);
        cambiarPanel(iniciarSesion);
        setVisible(true);
    }

    public void cambiarPanel(JPanel panel) {
        panel.setSize(400, 600);
        panel.setLocation(0, 0);
        contenido.removeAll();
        contenido.add(panel, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        contenido = new javax.swing.JPanel();
        iniciarsesionbtn1 = new javax.swing.JButton();
        iniciarsesionbtn2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Simulador de login y registro");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(400, 650));
        setName("Frame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenido.setMaximumSize(new java.awt.Dimension(400, 600));
        contenido.setMinimumSize(new java.awt.Dimension(400, 600));
        contenido.setPreferredSize(new java.awt.Dimension(400, 600));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, -1));
        contenido.getAccessibleContext().setAccessibleName("Contenido");

        iniciarsesionbtn1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        iniciarsesionbtn1.setText("Registrarse");
        iniciarsesionbtn1.setBorder(null);
        iniciarsesionbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarsebtn(evt);
            }
        });
        getContentPane().add(iniciarsesionbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 40));

        iniciarsesionbtn2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        iniciarsesionbtn2.setText("Iniciar sesión");
        iniciarsesionbtn2.setBorder(null);
        iniciarsesionbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarsesionbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(iniciarsesionbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 40));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarsebtn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarsebtn
        Registro registro = new Registro(this);
        cambiarPanel(registro);
    }//GEN-LAST:event_registrarsebtn

    private void iniciarsesionbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarsesionbtn2ActionPerformed
        IniciarSesion initsession = new IniciarSesion(this);
        cambiarPanel(initsession);
    }//GEN-LAST:event_iniciarsesionbtn2ActionPerformed

    public static void main(String args[]) {

        try {
            FlatArcDarkIJTheme.setup();
            System.out.println("Look and Fell iniciado correctamente");
        }
        catch (Exception ex) {
            System.err.println("Se ha fallado al iniciar el Look and Feel");
        }

        java.awt.EventQueue.invokeLater(() -> {
            new FormularioPrincipal().setVisible(true);
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton iniciarsesionbtn1;
    private javax.swing.JButton iniciarsesionbtn2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
