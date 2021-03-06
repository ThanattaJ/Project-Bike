/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

//import bike_gui.*;
import BikeRapair.Repair;
import Support.Support;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class SupportGUI extends javax.swing.JFrame {
    
    private Support sp = new Support();
    private String whatToSearch;
    public static SupportGUI support;
    /**
     * Creates new form 
     */
    
    public SupportGUI() {
        initComponents();
        jLBWhatsearch.setText(whatToSearch);
        jTAContact.setText(sp.contact()); 
        
    }

    SupportGUI(String whatToSearch) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTFSearch = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jBTSearch = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        supportPage = new javax.swing.JPanel();
        barTitle = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        bodySupport = new javax.swing.JPanel();
        jLBShowingResult = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLBWhatsearch = new javax.swing.JLabel();
        resultScroll = new javax.swing.JScrollPane();
        jTAShowyouSearch = new javax.swing.JTextArea();
        contactScroll = new javax.swing.JScrollPane();
        jTAContact = new javax.swing.JTextArea();
        contact = new javax.swing.JLabel();
        titleContact = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(25, 41, 65));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(13, 24, 35));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Leelawadee", 0, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SOCIETY");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 140, 50));

        jTFSearch.setBackground(new java.awt.Color(13, 24, 35));
        jTFSearch.setFont(new java.awt.Font("Leelawadee UI", 0, 20)); // NOI18N
        jTFSearch.setForeground(new java.awt.Color(255, 255, 255));
        jTFSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFSearch.setText("Search");
        jTFSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFSearchFocusGained(evt);
            }
        });
        jTFSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSearchActionPerformed(evt);
            }
        });
        jPanel8.add(jTFSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 120, 30));
        jPanel8.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, 120, 40));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Leelawadee", 0, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GREEN");
        jLabel12.setToolTipText("");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 50));

        jBTSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/magnifying-glass.png"))); // NOI18N
        jBTSearch.setContentAreaFilled(false);
        jBTSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSearchActionPerformed(evt);
            }
        });
        jPanel8.add(jBTSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 860, 60));

        jPanel6.setBackground(new java.awt.Color(22, 31, 39));

        jPanel7.setBackground(new java.awt.Color(13, 24, 35));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("     Bike Repairing");
        jLabel16.setToolTipText("");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 140, 20));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("     Can Counter");
        jLabel17.setToolTipText("");
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, 20));

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("     Bike Sharing");
        jLabel18.setToolTipText("");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 20));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("     History");
        jLabel20.setToolTipText("");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, 20));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("     PROFILE");
        jLabel21.setToolTipText("");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("     Timer");
        jLabel22.setToolTipText("");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, 20));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("     Support");
        jLabel23.setToolTipText("");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, 20));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("MENU");
        jLabel19.setToolTipText("");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 150, 480));

        supportPage.setBackground(new java.awt.Color(25, 41, 65));
        supportPage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barTitle.setBackground(new java.awt.Color(15, 30, 52));
        barTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 175, 248));
        jLabel3.setText("Support");
        barTitle.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 180, 50));

        supportPage.add(barTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 50));

        bodySupport.setBackground(new java.awt.Color(25, 41, 65));
        bodySupport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLBShowingResult.setBackground(new java.awt.Color(255, 255, 255));
        jLBShowingResult.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        jLBShowingResult.setForeground(new java.awt.Color(255, 255, 255));
        jLBShowingResult.setText("Showing results for:");
        bodySupport.add(jLBShowingResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 30));
        bodySupport.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 210, 30));

        jLBWhatsearch.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jLBWhatsearch.setForeground(new java.awt.Color(255, 255, 255));
        bodySupport.add(jLBWhatsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 210, 30));

        jTAShowyouSearch.setBackground(new java.awt.Color(25, 41, 65));
        jTAShowyouSearch.setColumns(20);
        jTAShowyouSearch.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTAShowyouSearch.setForeground(new java.awt.Color(255, 255, 255));
        jTAShowyouSearch.setRows(5);
        jTAShowyouSearch.setBorder(null);
        resultScroll.setViewportView(jTAShowyouSearch);

        bodySupport.add(resultScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 390, 300));

        jTAContact.setBackground(new java.awt.Color(25, 41, 65));
        jTAContact.setColumns(20);
        jTAContact.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
        jTAContact.setForeground(new java.awt.Color(255, 255, 255));
        jTAContact.setRows(5);
        contactScroll.setViewportView(jTAContact);

        bodySupport.add(contactScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 250, 300));
        bodySupport.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 170, 30));

        titleContact.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        titleContact.setForeground(new java.awt.Color(255, 255, 255));
        titleContact.setText("Contact");
        bodySupport.add(titleContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        supportPage.add(bodySupport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 730, 370));

        jPanel5.add(supportPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 740, 420));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSearchActionPerformed
        // TODO add your handling code here:
        whatToSearch = jTFSearch.getText();
        sp.searchSupport(whatToSearch);
        jLBWhatsearch.setText(whatToSearch);
        jTAShowyouSearch.setText(sp.getOutput());
    }//GEN-LAST:event_jBTSearchActionPerformed

    private void jTFSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSearchActionPerformed

    }//GEN-LAST:event_jTFSearchActionPerformed

    private void jTFSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFSearchFocusGained
        // TODO add your handling code here:
        jTFSearch.setText("");
    }//GEN-LAST:event_jTFSearchFocusGained
//
//    private void jTFSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
//        // ปุ่ม search หาข้อมูล Support:
//        whatToSearch = jTFSearch1.getText();
//        System.out.println(whatToSearch);
//    }    
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
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Support.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                support = new SupportGUI();
                support.setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barTitle;
    private javax.swing.JPanel bodySupport;
    private javax.swing.JLabel contact;
    private javax.swing.JScrollPane contactScroll;
    private javax.swing.JButton jBTSearch;
    private javax.swing.JLabel jLBShowingResult;
    private javax.swing.JLabel jLBWhatsearch;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTAContact;
    private javax.swing.JTextArea jTAShowyouSearch;
    private javax.swing.JTextField jTFSearch;
    private javax.swing.JScrollPane resultScroll;
    private javax.swing.JPanel supportPage;
    private javax.swing.JLabel titleContact;
    // End of variables declaration//GEN-END:variables
    
}
