/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Clases.Data;

/**
 *
 * @author jalfonso2
 */
public class frmPrimary extends javax.swing.JFrame {

   
      //Create an object from the class Data
    private Data myData;
    
    public void setData (Data myData){
        this.myData = myData;
    }
    
    
    public frmPrimary() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        dpnDesktop = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        jMenuItemClients = new javax.swing.JMenuItem();
        jMenuItemProduct = new javax.swing.JMenuItem();
        jMenuItemUsr = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemChgPwd = new javax.swing.JMenuItem();
        jMenuItemChgUsr = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemExit = new javax.swing.JMenuItem();
        mnuRep = new javax.swing.JMenu();
        jMenuItemBill = new javax.swing.JMenuItem();
        jMenuItemBillReport = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();
        jMenuItemHelp = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to facturation and bill software");

        dpnDesktop.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDesktopLayout = new javax.swing.GroupLayout(dpnDesktop);
        dpnDesktop.setLayout(dpnDesktopLayout);
        dpnDesktopLayout.setHorizontalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        dpnDesktopLayout.setVerticalGroup(
            dpnDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 368, Short.MAX_VALUE)
        );

        mnuFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229214_Artboard_1.png"))); // NOI18N
        mnuFile.setText("File");

        jMenuItemClients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229644_unknown.png"))); // NOI18N
        jMenuItemClients.setText("Clients");
        mnuFile.add(jMenuItemClients);

        jMenuItemProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229772_objects.png"))); // NOI18N
        jMenuItemProduct.setText("Products");
        jMenuItemProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductActionPerformed(evt);
            }
        });
        mnuFile.add(jMenuItemProduct);

        jMenuItemUsr.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229588_supportmale.png"))); // NOI18N
        jMenuItemUsr.setText("Users");
        jMenuItemUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsrActionPerformed(evt);
            }
        });
        mnuFile.add(jMenuItemUsr);
        mnuFile.add(jSeparator2);

        jMenuItemChgPwd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229801_Lock_protected_safe_privacy_password_security.png"))); // NOI18N
        jMenuItemChgPwd.setText("Change password");
        mnuFile.add(jMenuItemChgPwd);

        jMenuItemChgUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229698_Myspace.png"))); // NOI18N
        jMenuItemChgUsr.setText("Change User");
        mnuFile.add(jMenuItemChgUsr);
        mnuFile.add(jSeparator1);

        jMenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490230001_8_-_Shutdown.png"))); // NOI18N
        jMenuItemExit.setText("Exit");
        jMenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExitActionPerformed(evt);
            }
        });
        mnuFile.add(jMenuItemExit);

        jMenuBar2.add(mnuFile);

        mnuRep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229194_receipt-paid-paper.png"))); // NOI18N
        mnuRep.setText("Reports");
        mnuRep.setToolTipText("");

        jMenuItemBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490230170_constr_account_statements.png"))); // NOI18N
        jMenuItemBill.setText("Bill");
        mnuRep.add(jMenuItemBill);

        jMenuItemBillReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490230083_advantage_diagram.png"))); // NOI18N
        jMenuItemBillReport.setText("Bill Report");
        jMenuItemBillReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBillReportActionPerformed(evt);
            }
        });
        mnuRep.add(jMenuItemBillReport);

        jMenuBar2.add(mnuRep);

        mnuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490229406_support.png"))); // NOI18N
        mnuHelp.setText("Help");

        jMenuItemAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490231109_sign-info.png"))); // NOI18N
        jMenuItemAbout.setText("About");
        mnuHelp.add(jMenuItemAbout);

        jMenuItemHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/1490230474_Lifebuoy.png"))); // NOI18N
        jMenuItemHelp.setText("Help");
        mnuHelp.add(jMenuItemHelp);

        jMenuBar2.add(mnuHelp);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemBillReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBillReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemBillReportActionPerformed

    private void jMenuItemUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsrActionPerformed
        frmusersinternal myusers = new frmusersinternal();
        myusers.setData(myData);
        /*name.add(formname); it works if you want to add a form to a desktoppane,
        in this case we add the form "frmusersinternal" to the pane called "dpnDesktop".*/
        dpnDesktop.add(myusers);
        /*To the internal forms we can use the option "JInternalFrameForm"
        in this case to show the form inside a especific window need to add the form to a desktop pane
        and show the form with the code
        name.show(); (The code .show() only can be used with a JInternalFrameForm)*/
        myusers.show();
             
    }//GEN-LAST:event_jMenuItemUsrActionPerformed

    private void jMenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExitActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jMenuItemExitActionPerformed

    private void jMenuItemProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductActionPerformed
        frmProducts myProducts = new frmProducts();
        myProducts.setData(myData);
        dpnDesktop.add(myProducts);
        myProducts.show();
    }//GEN-LAST:event_jMenuItemProductActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrimary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrimary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesktop;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemBill;
    private javax.swing.JMenuItem jMenuItemBillReport;
    private javax.swing.JMenuItem jMenuItemChgPwd;
    private javax.swing.JMenuItem jMenuItemChgUsr;
    private javax.swing.JMenuItem jMenuItemClients;
    private javax.swing.JMenuItem jMenuItemExit;
    private javax.swing.JMenuItem jMenuItemHelp;
    private javax.swing.JMenuItem jMenuItemProduct;
    private javax.swing.JMenuItem jMenuItemUsr;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuRep;
    // End of variables declaration//GEN-END:variables
}
