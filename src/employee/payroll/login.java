/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.payroll;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author Mata
 */
public class login extends javax.swing.JFrame {
    Connection conn= null;
    ResultSet rs=null;
    PreparedStatement pst = null;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        Toolkit  toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        txt_combo.setVisible(false);
        jLabel4.setVisible(false);
        setLocation(size.width/2 - getWidth ()/2, size.height/2 - getHeight ()/2);
        this.setResizable(Boolean.FALSE);

        conn = db.java_db();
        currentDate();
    }
        public void currentDate(){
        
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        
        
        lbl_date.setText((month +1)+ "/"+day+"/"+year);
        
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        
        lbl_time.setText((hour+":"+(minute)+":"+second));

    
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt_combo = new javax.swing.JComboBox<>();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        lbl_date = new javax.swing.JMenu();
        lbl_time = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Window");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(java.awt.Color.pink);
        setSize(new java.awt.Dimension(300, 500));

        jPanel3.setBackground(new java.awt.Color(61, 94, 94));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Orator Std", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SYSTEM");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(300, 70, 180, 80);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(70, 220, 90, 30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(70, 270, 80, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Select Division:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 360, 92, 15);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(430, 310, 90, 23);

        txt_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Sales" }));
        txt_combo.setEnabled(false);
        txt_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_comboActionPerformed(evt);
            }
        });
        jPanel3.add(txt_combo);
        txt_combo.setBounds(150, 350, 190, 30);

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        jPanel3.add(txt_username);
        txt_username.setBounds(150, 220, 370, 30);

        txt_password.setText("jPasswordField1");
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        jPanel3.add(txt_password);
        txt_password.setBounds(150, 270, 370, 30);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(0, 170, 550, 10);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(0, 340, 550, 10);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mata\\Desktop\\logo.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(80, 20, 160, 130);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Please enter your username and password:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(70, 180, 310, 30);

        jLabel7.setFont(new java.awt.Font("Orator Std", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PAYROLL");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(290, 20, 210, 80);

        lbl_date.setText("Date");
        jMenuBar1.add(lbl_date);

        lbl_time.setText("Time");
        jMenuBar1.add(lbl_time);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Login button code here:
 
        String sql = "select id,username,password,division from Users where(username=? and password =? )";
        //comment
        try{
            
            int count =0;
            String ipasswd="";
            String passwd="";
            
            pst = conn.prepareStatement(sql);
            pst.setString(1, txt_username.getText());
            pst.setString(2, txt_password.getText());
          // pst.setString(3, txt_combo.getSelectedItem().toString());
           ipasswd=txt_password.getText();
           
            
            rs = pst.executeQuery();
            String access = (txt_combo.getSelectedItem().toString());
              
                while(rs.next()){
                    //int id = rs.getInt(1);
                   // Emp.empID = id;
                    String username = rs.getString("username");
                  //  Emp.empname = username;
                    passwd = rs.getString("password");
                    
                    count = count+1;
                
                }
          
           
            
                //if (access=="Admin") {
       //         if (passwd.equals(ipasswd) ){
                    if(count==1){
                        JOptionPane.showMessageDialog(null, "Success");
                        MainMenu j = new MainMenu();
                        j.setVisible(true);
                        this.dispose();
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Username and Password you entered are wrong!");
                    }
                }
            
            
        
        
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally{
            
            try{
                rs.close();
                pst.close();
            }
            catch(Exception e){
                
            }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void txt_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_comboActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenu lbl_date;
    private javax.swing.JMenu lbl_time;
    private javax.swing.JComboBox<String> txt_combo;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
