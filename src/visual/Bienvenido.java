package visual;

import controladores.ControladorBienvenidoEntrar;
import controladores.ControladorBienvenidoRegistrar;
import controladores.ControladorBienvenidoWindowKey;


public class Bienvenido extends javax.swing.JFrame {

      public Bienvenido() {
        initComponents();
        this.setLocationRelativeTo(null);
        controladorEntar = new ControladorBienvenidoEntrar(textUsu, textCont);
        botIng.addMouseListener(controladorEntar);
       
        controladorRegistrar = new ControladorBienvenidoRegistrar(); //genero un objeto
        botReg.addMouseListener(controladorRegistrar); //agrego una accion a el boton

        controladorWindowRegKey = new ControladorBienvenidoWindowKey();
        this.addKeyListener(controladorWindowRegKey);
        textUsu.addKeyListener(controladorWindowRegKey);
        textCont.addKeyListener(controladorWindowRegKey);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labUsu = new javax.swing.JLabel();
        textUsu = new javax.swing.JTextField();
        labCont = new javax.swing.JLabel();
        textCont = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botSalir = new javax.swing.JButton();
        botIng = new javax.swing.JButton();
        botReg = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botReg1 = new javax.swing.JButton();
        botSalir1 = new javax.swing.JButton();
        botPersonal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labUsu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labUsu.setText("Usuario:");
        getContentPane().add(labUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));
        labUsu.getAccessibleContext().setAccessibleDescription("labUsu");
        labUsu.getAccessibleContext().setAccessibleParent(labUsu);

        textUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuActionPerformed(evt);
            }
        });
        getContentPane().add(textUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 150, -1));
        textUsu.getAccessibleContext().setAccessibleDescription("textUsu");
        textUsu.getAccessibleContext().setAccessibleParent(textUsu);

        labCont.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCont.setText("Contraseña:");
        getContentPane().add(labCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));
        labCont.getAccessibleContext().setAccessibleDescription("labCont");
        labCont.getAccessibleContext().setAccessibleParent(labCont);

        textCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textContActionPerformed(evt);
            }
        });
        getContentPane().add(textCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 150, -1));
        textCont.getAccessibleContext().setAccessibleDescription("textCont");
        textCont.getAccessibleContext().setAccessibleParent(textCont);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/images (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 100));

        botSalir.setText("Salir del programa");
        botSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalirActionPerformed(evt);
            }
        });
        getContentPane().add(botSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 140, -1));
        botSalir.getAccessibleContext().setAccessibleDescription("botSalir");
        botSalir.getAccessibleContext().setAccessibleParent(botSalir);

        botIng.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botIng.setText("INGRESAR");
        botIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botIngActionPerformed(evt);
            }
        });
        getContentPane().add(botIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 150, -1));
        botIng.getAccessibleContext().setAccessibleDescription("botIng");
        botIng.getAccessibleContext().setAccessibleParent(botIng);

        botReg.setText("REGISTRARSE");
        botReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRegActionPerformed(evt);
            }
        });
        getContentPane().add(botReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 150, -1));
        botReg.getAccessibleContext().setAccessibleDescription("botReg");
        botReg.getAccessibleContext().setAccessibleParent(botReg);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Turnos para Consultorio Médico");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 600, -1));

        botReg1.setText("REGISTRARSE");
        botReg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botReg1ActionPerformed(evt);
            }
        });
        getContentPane().add(botReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 150, -1));

        botSalir1.setText("Salir del programa");
        botSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSalir1ActionPerformed(evt);
            }
        });
        getContentPane().add(botSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 140, -1));

        botPersonal.setText("INGRESO PARA PERSONAL");
        botPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botPersonalActionPerformed(evt);
            }
        });
        getContentPane().add(botPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 190, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/visual/imagenes/bienvenida.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalirActionPerformed
  
        
    }//GEN-LAST:event_botSalirActionPerformed

    private void botIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botIngActionPerformed

      
        
    }//GEN-LAST:event_botIngActionPerformed

    private void botRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRegActionPerformed

    }//GEN-LAST:event_botRegActionPerformed

    private void botReg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botReg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botReg1ActionPerformed

    private void botSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botSalir1ActionPerformed

    private void botPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botPersonalActionPerformed
        
       
    }//GEN-LAST:event_botPersonalActionPerformed

    private void textUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuActionPerformed
        

    }//GEN-LAST:event_textUsuActionPerformed

    private void textContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textContActionPerformed
      
    }//GEN-LAST:event_textContActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botIng;
    private javax.swing.JButton botPersonal;
    private javax.swing.JButton botReg;
    private javax.swing.JButton botReg1;
    private javax.swing.JButton botSalir;
    private javax.swing.JButton botSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labCont;
    private javax.swing.JLabel labUsu;
    private javax.swing.JTextField textCont;
    private javax.swing.JTextField textUsu;
    // End of variables declaration//GEN-END:variables
    private ControladorBienvenidoEntrar controladorEntar;
    private ControladorBienvenidoRegistrar controladorRegistrar;
    private ControladorBienvenidoWindowKey controladorWindowRegKey;
   
}
