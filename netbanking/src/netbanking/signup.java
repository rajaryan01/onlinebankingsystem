
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netbanking;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import com.sun.glass.events.KeyEvent;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author makka
 */
public class signup extends javax.swing.JFrame {

    /**
     * Creates new form signup
     */
    public signup() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        dobTF = new datechooser.beans.DateChooserCombo();
        phnTF = new javax.swing.JTextField();
        branchTF = new javax.swing.JTextField();
        accTF = new javax.swing.JTextField();
        atmTF = new javax.swing.JTextField();
        userTF = new javax.swing.JTextField();
        passTF = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Register for Netbanking");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("<-");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(200, 200, 200)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Set user name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Registered Mobno.");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Account no.");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Set password:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("ATM no.");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Branch code:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("DOB:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Name:");

        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTFKeyPressed(evt);
            }
        });

        phnTF.setPreferredSize(new java.awt.Dimension(69, 31));
        phnTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phnTFKeyPressed(evt);
            }
        });

        branchTF.setPreferredSize(new java.awt.Dimension(69, 31));
        branchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                branchTFKeyPressed(evt);
            }
        });

        accTF.setPreferredSize(new java.awt.Dimension(69, 31));
        accTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                accTFKeyPressed(evt);
            }
        });

        atmTF.setPreferredSize(new java.awt.Dimension(69, 31));
        atmTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                atmTFKeyPressed(evt);
            }
        });

        userTF.setPreferredSize(new java.awt.Dimension(69, 31));

        passTF.setMinimumSize(new java.awt.Dimension(6, 31));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dobTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                        .addComponent(accTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(branchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atmTF, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTF)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(atmTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(phnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(branchTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel10))
                    .addComponent(accTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(userTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(passTF, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel11))
                .addGap(55, 55, 55)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
           loginmain ebo = new loginmain();
    ebo.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     String sname=nameTF.getText();   
     //SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
     
     int satmno=Integer.parseInt(atmTF.getText());
     String sdob=dobTF.getText();
     int sbranch=Integer.parseInt(branchTF.getText());
     int saccount=Integer.parseInt(accTF.getText());
     String sphn=phnTF.getText();
      String user=userTF.getText();
        char[] pswd=passTF.getPassword();
     
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         
         Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/netbanking","root","meenu1");
         Statement st=(Statement) con.createStatement();
         String q="Select * from bank_customers where Account_no="+saccount+";";
         ResultSet rs=st.executeQuery(q);
        //   JOptionPane.showMessageDialog(null, "Incorrect Account!");
           int br,atm;
           String date="";
           String phn="";
       //  signup frame=new signup();
         if(rs.next())
         {
           String nam=rs.getString("name");
           phn=rs.getString("ph_no");
            br=rs.getInt("branch");
           atm=rs.getInt("atmno");
             date=rs.getString("dob");
             
             if(nam.equals(sname)==true &&(phn.equals(sphn))&&(br==sbranch)&&(atm==satmno))
             {
 
                 JOptionPane.showMessageDialog(null,"Registered Successfully");
                loginmain ebo = new loginmain();
                ebo.setVisible(true); // TODO add your handling code here:

             }
             else
             {
                  JOptionPane.showMessageDialog(null,"Incorrect Information!");
             }
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Incorrect Account!");
         }
     /*
     if(sname.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Name is mandatory");
     }
      if(sdob.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Date of birth is mandatory");
     }
       if(satmno == 0)
     {
         JOptionPane.showMessageDialog(null,"Atmno. is mandatory");
     }
        if(sph_no.equals(""))
     {
         JOptionPane.showMessageDialog(null,"Phone no. is mandatory");
     }
         if(sbranch==0)
     {
         JOptionPane.showMessageDialog(null,"Branch code is mandatory");
     }
          if(accTF.getText().isEmpty())
     {
         JOptionPane.showMessageDialog(null,"Name is mandatory");
     }
             
          
      if(sph_no.length()!=10)
      {
        JOptionPane.showMessageDialog(null,"Enter 10 digit mobile number");      
      }
     
     else
      {
         JOptionPane.showMessageDialog(null,"Registered Successfully"); 
      }
     }
     
     */
     }
     catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Not Registered Successfully");
        }
     
     catch (ClassNotFoundException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        } 
     
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void atmTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_atmTFKeyPressed
     int atmkey=evt.getKeyCode();
     if((atmkey>=evt.VK_0 && atmkey<=evt.VK_9)||(atmkey>=evt.VK_NUMPAD0  && atmkey<=evt.VK_NUMPAD9)
             ||(atmkey==KeyEvent.VK_BACKSPACE))
     {
        atmTF.setEditable(true);  
     }
     else
     {
         atmTF.setEditable(false); 
         JOptionPane.showMessageDialog(null,"Enter number");
     }
    }//GEN-LAST:event_atmTFKeyPressed

    private void phnTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnTFKeyPressed
        
        int atmkey=evt.getKeyCode();
     if((atmkey>=evt.VK_0 && atmkey<=evt.VK_9)||(atmkey>=evt.VK_NUMPAD0  && atmkey<=evt.VK_NUMPAD9)
             ||(atmkey==KeyEvent.VK_BACKSPACE))
     {
        phnTF.setEditable(true);  
     }
     else
     {
         phnTF.setEditable(false); 
         JOptionPane.showMessageDialog(null,"Enter number");
     }
        
        
    }//GEN-LAST:event_phnTFKeyPressed

    private void nameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyPressed

       char c=evt.getKeyChar();

    if((Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACKSPACE)||  c==KeyEvent.VK_DELETE ))
       nameTF.setEditable(true); 
     else
     {
         nameTF.setEditable(false); 
         JOptionPane.showMessageDialog(null,"Enter character");
     }

    }//GEN-LAST:event_nameTFKeyPressed

    private void branchTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_branchTFKeyPressed
        // TODO add your handling code here:
        
        int atmkey=evt.getKeyCode();
     if((atmkey>=evt.VK_0 && atmkey<=evt.VK_9)||(atmkey>=evt.VK_NUMPAD0  && atmkey<=evt.VK_NUMPAD9)
             ||(atmkey==KeyEvent.VK_BACKSPACE))
     {
        branchTF.setEditable(true);  
     }
     else
     {
         branchTF.setEditable(false); 
         JOptionPane.showMessageDialog(null,"Enter number");
     }
    }//GEN-LAST:event_branchTFKeyPressed

    private void accTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accTFKeyPressed
int atmkey=evt.getKeyCode();
     if((atmkey>=evt.VK_0 && atmkey<=evt.VK_9)||(atmkey>=evt.VK_NUMPAD0  && atmkey<=evt.VK_NUMPAD9)
             ||(atmkey==KeyEvent.VK_BACKSPACE))
     {
        accTF.setEditable(true);  
     }
     else
     {
         accTF.setEditable(false); 
         JOptionPane.showMessageDialog(null,"Enter number");
     }
    }//GEN-LAST:event_accTFKeyPressed

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
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accTF;
    private javax.swing.JTextField atmTF;
    private javax.swing.JTextField branchTF;
    private datechooser.beans.DateChooserCombo dobTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passTF;
    private javax.swing.JTextField phnTF;
    private javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
