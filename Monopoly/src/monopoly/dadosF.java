/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoly;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author jcarrenoa
 */
public class dadosF extends javax.swing.JFrame {

    /**
     * Creates new form dadosF
     */
    public dadosF() {
        initComponents();
    }

    static int dado1 = (int) (Math.random() * 6) * 1;
    static int dado2 = (int) (Math.random() * 6) * 1;

    ImageIcon uno = new ImageIcon(getClass().getResource("/monopoly.Imagenes.Dados/D_1.png"));
    ImageIcon  dos = new ImageIcon(getClass().getResource("/monopoly.Imagenes.Dados/D_2.png"));
    ImageIcon  tres = new ImageIcon(getClass().getResource("/monopoly.Imagenes.Dados/D_3.png"));
    ImageIcon  cuatro = new ImageIcon(getClass().getResource("/monopoly.Imagenes.Dados/D_4.png"));
    ImageIcon  cinco = new ImageIcon(getClass().getResource("/monopoly.Imagenes.Dados/D_5.png"));
    ImageIcon  seis = new ImageIcon(getClass().getResource("/monopoly.Imagenes.Dados/D_6.png"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new java.awt.Label();
        jLabel3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void rotard() {
        switch (dado1) {
            case 1:
                jLabel2.paint(uno);
                break;
            case 2:
                panel1.se;
                break;
            case 3:
                jLabel2.setIcon(tres);
                break;
            case 4:
                jLabel2.setIcon(cuatro);
                break;
            case 5:
                jLabel2.setIcon(cinco);
                break;
            case 6:
                jLabel2.setIcon(seis);
                break;

        }
        switch (dado2) {
            case 1:
                jLabel3.setIcon(uno);
                break;
            case 2:
                jLabel3.setIcon(dos);
                break;
            case 3:
                jLabel3.setIcon(tres);
                break;
            case 4:
                jLabel3.setIcon(cuatro);
                break;
            case 5:
                jLabel3.setIcon(cinco);
                break;
            case 6:
                jLabel3.setIcon(seis);
                break;

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dadosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dadosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dadosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dadosF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dadosF().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label jLabel2;
    private java.awt.Label jLabel3;
    // End of variables declaration//GEN-END:variables
}
