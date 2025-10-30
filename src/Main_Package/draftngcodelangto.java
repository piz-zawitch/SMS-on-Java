/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Package;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


/**
 *
 * @author rexel
 */
public class draftngcodelangto {

    
    public static void main(String[] args){
     connect();
    };
      public static void connect(){
          /**
        Connection conn = null;
        try {
            //connect sya
            String url = "jdbc:sqlite:C:/StudentManagementSystem_[Schoolist]/database/account.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection success");
           
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn!=null)
                    conn.close();

            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    
*/
          
        String url = "jdbc:sqlite:C:/StudentManagementSystem_[Schoolist]/database/account.db";  // change this to your .db file name if different

        try (Connection conn = DriverManager.getConnection(url)) {
            System.out.println("Connected to SQLite database.\n");
            
            String sql = "SELECT * FROM Accounts";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            String user = rs.getString("User");
            String pass = rs.getString("Pass");
            if(rs.next()){
                
                System.out.println(user + " " + pass);
            }
            // Close resources
           

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

      } 
          

}
