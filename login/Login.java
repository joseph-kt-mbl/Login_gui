
package login;

import java.sql.*;

public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n!__hello World__!\n");
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoFrame().setVisible(true);
            }
        });
        
        Connection con = DBConnection.getConnection();
        if(con!=null){
            System.out.println("Connected");
            
         
            
            //============================================
            
            
//            String query="SELECT * FROM users WHERE usename = 'Abdellaoui' ";
//            
//                try(PreparedStatement pst = con.prepareStatement(query)){
//
//                        ResultSet rs = pst.executeQuery();
//                        
//                        if(rs.next()){
//                            System.out.println(rs.getString(3));
//                        }
//
//                }catch(SQLException e){
//
//                e.printStackTrace();
//                }   
                
            //============================================
        }
        else{
            System.out.println("Connection Failed");

        }
 }
    
}
