
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hana hefny
 */
public class tables extends javax.swing.JFrame {

    /**
     * Creates new form tables
     */
    public tables() {
        initComponents();
        
    }
    int x;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        table1B = new javax.swing.JButton();
        table2B = new javax.swing.JButton();
        table3B = new javax.swing.JButton();
        table4B = new javax.swing.JButton();
        table6B = new javax.swing.JButton();
        table7B = new javax.swing.JButton();
        table5B = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table1B.setText("Table 1");
        table1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table1BActionPerformed(evt);
            }
        });

        table2B.setText("Table 2");
        table2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table2BActionPerformed(evt);
            }
        });

        table3B.setText("Table 3");
        table3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table3BActionPerformed(evt);
            }
        });

        table4B.setText("Table 4");
        table4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table4BActionPerformed(evt);
            }
        });

        table6B.setText("Table 6");
        table6B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table6BActionPerformed(evt);
            }
        });

        table7B.setText("Table 7");
        table7B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table7BActionPerformed(evt);
            }
        });

        table5B.setText("Table 5");
        table5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table5BActionPerformed(evt);
            }
        });

        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(table2B, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(table1B, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(table3B, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(table4B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(table5B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table7B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table6B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(table6B, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(table7B, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(table1B, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(table3B, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table4B, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(table5B, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(table2B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table4BActionPerformed
        try {
            orders anotherframe = new orders(4);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table4BActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        loginGui anotherframe = new loginGui();
        anotherframe.pack();
        anotherframe.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void table1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table1BActionPerformed
        try {
            orders anotherframe = new orders(1);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table1BActionPerformed

    private void table2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table2BActionPerformed
        try {
            orders anotherframe = new orders(2);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table2BActionPerformed

    private void table3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table3BActionPerformed
        try {
            orders anotherframe = new orders(3);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table3BActionPerformed

    private void table5BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table5BActionPerformed
        try {
            orders anotherframe = new orders(5);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table5BActionPerformed

    private void table6BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table6BActionPerformed
        try {
            orders anotherframe = new orders(6);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table6BActionPerformed

    private void table7BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table7BActionPerformed
        try {
            orders anotherframe = new orders(7);
            anotherframe.pack();
            anotherframe.setVisible(true);
            dispose();
        } catch (SQLException ex) {
            Logger.getLogger(tables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_table7BActionPerformed

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
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton table1B;
    private javax.swing.JButton table2B;
    private javax.swing.JButton table3B;
    private javax.swing.JButton table4B;
    private javax.swing.JButton table5B;
    private javax.swing.JButton table6B;
    private javax.swing.JButton table7B;
    // End of variables declaration//GEN-END:variables
}
