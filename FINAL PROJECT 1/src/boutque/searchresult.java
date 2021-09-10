/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boutque;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author b0rN_pR0
 */
public class searchresult extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
    /**
     * Creates new form searchresult
     */
    public searchresult() {
        initComponents();
        DoConnect(); 
    }
    public void DoConnect( ) {
    try{
    
     String host= "jdbc:derby://localhost:1527/boutque";
     String uName="abc";
     String uPass="123";

     con = DriverManager.getConnection(host,uName,uPass);
     stmt = con.createStatement();
     String SQL = "Select * FROM DRESSDATABASE";
     rs = stmt.executeQuery( SQL );
     
     while(rs.next()) {
            if( searchbyprice.s.equalsIgnoreCase(rs.getString("GENDER"))){
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
                textsize.setText(size);
                textcolor.setText(color);
                textcostprice.setText(costprice);
                textsaleprice.setText(saleprice);
                textdiscountrate.setText(discountrate);
                textgender.setText(gender);
                textcompanyid.setText(companyid);
                 }
                         else {
                rs.previous( );
                JOptionPane.showMessageDialog(null, "Not found");
            }
    } }catch (Exception err ) {
     System.out.println( err.getMessage() );
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
        jPanel2 = new javax.swing.JPanel();
        textsize = new javax.swing.JTextField();
        textcolor = new javax.swing.JTextField();
        textcostprice = new javax.swing.JTextField();
        textsaleprice = new javax.swing.JTextField();
        textdiscountrate = new javax.swing.JTextField();
        textgender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnprevious = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        textserialno = new javax.swing.JTextField();
        textcompanyid = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        textsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textsizeActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("companyid");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("size");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("color");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("costprice");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("saleprice");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("discountrate");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("gender");

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        btnprevious.setText("PREV");
        btnprevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpreviousMouseClicked(evt);
            }
        });
        btnprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviousActionPerformed(evt);
            }
        });

        btnnext.setText("NEXT");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("serial no:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textsize)
                    .addComponent(textcolor)
                    .addComponent(textcostprice)
                    .addComponent(textsaleprice)
                    .addComponent(textdiscountrate)
                    .addComponent(textgender, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(textserialno)
                    .addComponent(textcompanyid))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(textserialno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textcostprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textsaleprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textdiscountrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnprevious)
                            .addComponent(btnnext)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textcompanyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textsizeActionPerformed
        // TODO add your handling code here:
        try {
            if ( rs.previous( ) ) 
            
            while(rs.next()) {
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String view="select serialno FROM DRESSDATABASE Where gender='"+searchbyprice.s+"'";
                rs=stmt.executeQuery(view);
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
                textsize.setText(size);
                textcolor.setText(color);
                textcostprice.setText(costprice);
                textsaleprice.setText(saleprice);
                textdiscountrate.setText(discountrate);
                textgender.setText(gender);
                textcompanyid.setText(companyid);

            
           /* 
            else {
                rs.next( );
                JOptionPane.showMessageDialog(null,"Start of file");
            }*/
        }
        }
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, err.getMessage());
        }       // TODO add your handling code here:
                                              

    }//GEN-LAST:event_textsizeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.setVisible(false);
        MainMenu mm= new MainMenu();
        mm.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void btnpreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpreviousMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        MainMenu mm= new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_btnpreviousMouseClicked

    private void btnpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviousActionPerformed
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
         textsize.setText(size);
         textcolor.setText(color);
          textcostprice.setText(costprice);
          textsaleprice.setText(saleprice);
          textdiscountrate.setText(discountrate);
          textgender.setText(gender);
          textcompanyid.setText(companyid);

         }
         else {
         rs.next( );
         JOptionPane.showMessageDialog(null, "Start of file");
          }
          }
         catch (SQLException err) {
         JOptionPane.showMessageDialog(null, err.getMessage());
}    
    }//GEN-LAST:event_btnpreviousActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
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
         textsize.setText(size);
         textcolor.setText(color);
          textcostprice.setText(costprice);
          textsaleprice.setText(saleprice);
          textdiscountrate.setText(discountrate);
          textgender.setText(gender);
          textcompanyid.setText(companyid);
         

         }
         else {
          rs.previous( );
         JOptionPane.showMessageDialog(null, "End of File");
          }
          }
         catch (SQLException err) {
         JOptionPane.showMessageDialog(null, err.getMessage());
}        // TODO add your handling code here:

    }//GEN-LAST:event_btnnextActionPerformed


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
            java.util.logging.Logger.getLogger(searchresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchresult().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textcolor;
    private javax.swing.JTextField textcompanyid;
    private javax.swing.JTextField textcostprice;
    private javax.swing.JTextField textdiscountrate;
    private javax.swing.JTextField textgender;
    private javax.swing.JTextField textsaleprice;
    private javax.swing.JTextField textserialno;
    private javax.swing.JTextField textsize;
    // End of variables declaration//GEN-END:variables
}