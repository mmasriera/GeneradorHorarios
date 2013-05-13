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
        botoGenHorari = new javax.swing.JButton();
        etiquetaNom = new javax.swing.JLabel();
        botoLogout = new javax.swing.JButton();
        botoVeureHoraris = new javax.swing.JButton();
        botoModificarDades = new javax.swing.JButton();

        jLayeredPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLayeredPane1FocusGained(evt);
            }
        });

        botoGenHorari.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botoGenHorari.setText("Generar Horari");
        botoGenHorari.setSelected(true);
        botoGenHorari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoGenHorariActionPerformed(evt);
            }
        });
        botoGenHorari.setBounds(160, 130, 150, 40);
        jLayeredPane1.add(botoGenHorari, javax.swing.JLayeredPane.DEFAULT_LAYER);

        etiquetaNom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        etiquetaNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNom.setText("-");
        etiquetaNom.setBounds(-20, 50, 500, 30);
        jLayeredPane1.add(etiquetaNom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        etiquetaNom.getAccessibleContext().setAccessibleName("UnitatDocent");

        botoLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botoLogout.setText("Logout");
        botoLogout.setSelected(true);
        botoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoLogoutActionPerformed(evt);
            }
        });
        botoLogout.setBounds(160, 400, 150, 40);
        jLayeredPane1.add(botoLogout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botoVeureHoraris.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botoVeureHoraris.setText("Veure Horaris");
        botoVeureHoraris.setSelected(true);
        botoVeureHoraris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoVeureHorarisActionPerformed(evt);
            }
        });
        botoVeureHoraris.setBounds(160, 290, 150, 40);
        jLayeredPane1.add(botoVeureHoraris, javax.swing.JLayeredPane.DEFAULT_LAYER);

        botoModificarDades.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botoModificarDades.setText("Modificar Dades");
        botoModificarDades.setSelected(true);
        botoModificarDades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoModificarDadesActionPerformed(evt);
            }
        });
        botoModificarDades.setBounds(160, 210, 150, 40);
        jLayeredPane1.add(botoModificarDades, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botoGenHorariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoGenHorariActionPerformed
        cp.canviaPanel("PanelHorariLectiu");
    }//GEN-LAST:event_botoGenHorariActionPerformed

    private void jLayeredPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLayeredPane1FocusGained

    }//GEN-LAST:event_jLayeredPane1FocusGained

    private void botoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoLogoutActionPerformed
        // TODO add your handling code here:
        cp.canviaPanel("login");
    }//GEN-LAST:event_botoLogoutActionPerformed

    private void botoVeureHorarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoVeureHorarisActionPerformed
        // TODO add your handling code here:
        cp.canviaPanel("PanelVisorHoraris");
    }//GEN-LAST:event_botoVeureHorarisActionPerformed

    private void botoModificarDadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoModificarDadesActionPerformed
        // TODO add your handling code here:
        cp.canviaPanel("PanelModificarDades");
    }//GEN-LAST:event_botoModificarDadesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoGenHorari;
    private javax.swing.JButton botoLogout;
    private javax.swing.JButton botoModificarDades;
    private javax.swing.JButton botoVeureHoraris;
    private javax.swing.JLabel etiquetaNom;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
