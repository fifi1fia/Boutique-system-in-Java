/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boutque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author ASCC
 */
public class discountrate extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;

    /**
     * Creates new form discountrate
     */
    public discountrate() {
        initComponents();
        DoConnect();
    }
    
    
    public void DoConnect( ) {
    try{
    
     String host= "jdbc:derby://localhost:1527/boutque";
     String uName="abc";
     String uPass="123";

     con = DriverManager.getConnection(host,uName,uPass);
     stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
     String SQL = "SELECT * FROM DRESSDATABASE";
     rs = stmt.executeQuery( SQL );

     while(rs.next( )){
         int id_col = rs.getInt("serialno");
         String serialno = Integer.toString(id_col);
         String size = rs.getString("size");
         String color = rs.getString("color");
         double cp = rs.getDouble("costprice");
         String costprice=Double.toString(cp);
         double sp=rs.getDouble("saleprice");
         String saleprice=Double.toString(sp);
         double dr=rs.getDouble("discountrate");
         String discountrate=Double.toString(dr);
         String gender=rs.getString("gender");
         int cid=rs.getInt("companyid");
         String companyid=Integer.toString(cid);
         
         double ac= sp * dr/100;
         double ac1 = sp -ac;
         
         
         String acc = Double.toString(ac1);
    
    textserialno.setText(serialno);
    textsaleprice.setText(saleprice);
    textdiscountrate.setText(discountrate);
    textaccumulatedprice.setText(acc);
    
   
    
    }
    
    }
  


     catch (Exception err ) {
     System.out.println( err.getMessage( ) );
     }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textserialno = new javax.swing.JTextField();
        textsaleprice = new javax.swing.JTextField();
        textdiscountrate = new javax.swing.JTextField();
        textaccumulatedprice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("serial no");

        jLabel2.setText("saleprice");

        jLabel3.setText("discount rate");

        jLabel4.setText("accumulated price");

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Previous");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textserialno)
                        .addComponent(textsaleprice)
                        .addComponent(textdiscountrate)
                        .addComponent(textaccumulatedprice, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textserialno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textsaleprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textdiscountrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textaccumulatedprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
          if ( rs.next( ) ) {
      int id_col = rs.getInt("serialno");
         String serialno = Integer.toString(id_col);
         String size = rs.getString("size");
         String color = rs.getString("color");
         double cp = rs.getDouble("costprice");
         String costprice=Double.toString(cp);
         double sp=rs.getDouble("saleprice");
         String saleprice=Double.toString(sp);
         double dr=rs.getDouble("discountrate");
         String discountrate=Double.toString(dr);
         String gender=rs.getString("gender");
         int cid=rs.getInt("companyid");
         String companyid=Integer.toString(cid);         
         
         textserialno.setText(serialno);
          textsaleprice.setText(saleprice);
          textdiscountrate.setText(discountrate);
       
           double ac= sp * dr/100;
         double ac1 = sp -ac;
         String acc = Double.toString(ac1);
             textaccumulatedprice.setText(acc);
          

         }
         else {
          rs.previous( );
         JOptionPane.showMessageDialog(discountrate.this, "End of File");
          }
          }
         catch (SQLException err) {
         JOptionPane.showMessageDialog(discountrate.this, err.getMessage());
         }        // TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try {
          if ( rs.previous( ) ) {
         int id_col = rs.getInt("serialno");
         String serialno = Integer.toString(id_col);
         String size = rs.getString("size");
         String color = rs.getString("color");
         double cp = rs.getDouble("costprice");
         String costprice=Double.toString(cp);
         double sp=rs.getDouble("saleprice");
         String saleprice=Double.toString(sp);
         double dr=rs.getDouble("discountrate");
         String discountrate=Double.toString(dr);
         String gender=rs.getString("gender");
         int cid=rs.getInt("companyid");
         String companyid=Integer.toString(cid);         
         
         textserialno.setText(serialno);
          textsaleprice.setText(saleprice);
          textdiscountrate.setText(discountrate);
          
           double ac= sp * dr/100;
         double ac1 = sp -ac;
         String acc = Double.toString(ac1);
             textaccumulatedprice.setText(acc);
         
         }
         else {
         rs.next( );
         JOptionPane.showMessageDialog(discountrate.this, "Start of file");
          }
          }
         catch (SQLException err) {
         JOptionPane.showMessageDialog(discountrate.this, err.getMessage());
}       // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
ACCOUNT a = new ACCOUNT();
a.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(discountrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(discountrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(discountrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(discountrate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new discountrate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textaccumulatedprice;
    private javax.swing.JTextField textdiscountrate;
    private javax.swing.JTextField textsaleprice;
    private javax.swing.JTextField textserialno;
    // End of variables declaration//GEN-END:variables
}
