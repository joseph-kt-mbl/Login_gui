
package login;


import java.sql.*;

public class DBConnection {
    private static Connection con = null;
    public static Connection getConnection(){
        try{
            
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db","root","");
        
        return con;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return con;
    }
}
