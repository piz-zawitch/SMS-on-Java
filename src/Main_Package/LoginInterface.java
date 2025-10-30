/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main_Package;


import static Main_Package.draftngcodelangto.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Leo
 */
public class LoginInterface extends javax.swing.JFrame {
    
    //jsut add on
   
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginInterface.class.getName());

    /**
     * Creates new form LoginInterface
     */
    public LoginInterface() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        UsernameField.addActionListener(e -> LOGINButtonActionPerformed(e));
        PasswordField.addActionListener(e -> LOGINButtonActionPerformed(e));
        
      
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        LOGINButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        AuthMeassage = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 283, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Schoolist");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        UsernameField.setBackground(new java.awt.Color(153, 255, 0));
        UsernameField.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        UsernameField.setBorder(null);
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });

        LOGINButton.setBackground(new java.awt.Color(0, 102, 102));
        LOGINButton.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        LOGINButton.setForeground(new java.awt.Color(255, 255, 255));
        LOGINButton.setText("LOGIN");
        LOGINButton.setBorder(null);
        LOGINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(0, 102, 102));
        ClearButton.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("X");
        ClearButton.setBorder(null);
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        AuthMeassage.setBackground(new java.awt.Color(255, 255, 255));
        AuthMeassage.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        AuthMeassage.setForeground(new java.awt.Color(255, 204, 51));

        PasswordField.setBackground(new java.awt.Color(153, 255, 0));
        PasswordField.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        PasswordField.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(218, 218, 218))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(LOGINButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(AuthMeassage, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PasswordField)))
                        .addContainerGap(156, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AuthMeassage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addComponent(ClearButton)
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LOGINButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void LOGINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINButtonActionPerformed
        String Usr = UsernameField.getText();
        String Pass = PasswordField.getText();
        //----------------------------
        //set up ng link galing database
        String url = "jdbc:sqlite:database/account.db"; 
        //mag connect na sa database
        try (Connection conn = DriverManager.getConnection(url)) {
            //I check kung nakaconnect[nasa terminal lang sa nakikita]
            System.out.println("Connected to SQLite database.\n");
            //command sya galing sql para hanapin yung mga column ng data
            String sql = "SELECT * FROM Accounts";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //result
            ResultSet rs = pstmt.executeQuery();
            //nag loop sya isa isa kung tama ba yung user easy
            while(rs.next()){
                String user = rs.getString("User");
                String pass = rs.getString("Pass");
                
                //yung gawa niyo na to
                  if(user.equals(Usr) && pass.equals(Pass)){
                        new StudentDashboard().setVisible(true);
                         this.dispose();
                        

        }else if(Usr.isEmpty()){
            
            UsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,204,51)));
            PasswordField.setBorder(null);
            AuthMeassage.setText("* Please fill up username field");
            
            }else if(Pass.isEmpty()){
            
            PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,204,51)));
            UsernameField.setBorder(null);
            AuthMeassage.setText("* Please fill up password field");
            
            
            
        }else{
            UsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
            PasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));
            AuthMeassage.setText("* Incorrect username or password");
            
        }
            }
           

        } 
        //mag error pag siya pag may mali
        //tips balik ka lang sa url or link
        catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
         
        
        
         
       //wala na to
        

       /* if(user.equals(Usr) && pass.equals(Pass)){

        
        JOptionPane.showMessageDialog(this, "login Successfully");
        new StudentDashboard().setVisible(true);
        this.dispose();
        
        
        
        }
        
    
    
        */
        
        
        
    }//GEN-LAST:event_LOGINButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
       
        UsernameField.setText("");
        PasswordField.setText("");
         UsernameField.setBorder(null);
          PasswordField.setBorder(null);
        AuthMeassage.setText("");
        
        
        
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        
        
        
     
        
        
    }//GEN-LAST:event_UsernameFieldActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginInterface().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthMeassage;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton LOGINButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
