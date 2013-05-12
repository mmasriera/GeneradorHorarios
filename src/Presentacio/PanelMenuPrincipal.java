/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacio;


/**
 *
 * @author miquel
 */
public class PanelMenuPrincipal extends javax.swing.JPanel {

    ControladorPresentacio cp;
    /**
     * Creates new form PanelMenuPrincipal
     */
    public PanelMenuPrincipal( ControladorPresentacio cpres ) {
        cp = cpres;
        initComponents();
        this.setBounds(0,0,700,500);
    }
    
    public void setNomUnitatDocent( String nomUD ){
        this.etiquetaNom.setText(nomUD);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        botoLogout = new javax.swing.JButton();
        etiquetaNom = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        jLayeredPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLayeredPane1FocusGained(evt);
            }
        });

        botoLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botoLogout.setText("Logout");
        botoLogout.setSelected(true);
        botoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoLogoutActionPerformed(evt);
            }
        });
        botoLogout.setBounds(275, 400, 150, 40);
        jLayeredPane1.add(botoLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        etiquetaNom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNom.setText("-");
        etiquetaNom.setBounds(100, 50, 500, 30);
        jLayeredPane1.add(etiquetaNom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        etiquetaNom.getAccessibleContext().setAccessibleName("UnitatDocent");

        jPanel1.setName("panelOpcions"); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton1.setLabel("Generar Horari");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton2.setText("Veure Horaris");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton3.setText("Modificar Dades");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jRadioButton1.getAccessibleContext().setAccessibleName("jRadioButton");

        jPanel1.setBounds(230, 140, 250, 250);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jPanel1.getAccessibleContext().setAccessibleName("panelOpcions");
        jPanel1.getAccessibleContext().setAccessibleDescription("Panel con opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoLogoutActionPerformed
        cp.canviaPanel("login");
    }//GEN-LAST:event_botoLogoutActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        //Esto es pk me falla nse pk el groupradiobutton :S
        if (jRadioButton2.isSelected()) jRadioButton2.doClick();
        if (jRadioButton3.isSelected()) jRadioButton3.doClick();
        cp.canviaPanel("PanelHorariLectiu");
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) jRadioButton1.doClick();
        if (jRadioButton3.isSelected()) jRadioButton3.doClick();
        cp.canviaPanel("PanelVisorHoraris");
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) jRadioButton1.doClick();
        if (jRadioButton2.isSelected()) jRadioButton2.doClick();
        cp.canviaPanel("PanelModificarDades");
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jLayeredPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLayeredPane1FocusGained

    }//GEN-LAST:event_jLayeredPane1FocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoLogout;
    private javax.swing.JLabel etiquetaNom;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}