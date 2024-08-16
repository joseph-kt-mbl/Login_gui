/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.sql.*;


/**
 *
 * @author user
 */
public class MyLoginDb {
    private Connection con = DBConnection.getConnection();
    static PreparedStatement ps ;
    
    
    public void save(String user,String phone,String email,String pwd){
        
        
        String query ="INSERT INTO users(id,usename,pwd,phone,email) VALUES (?,?,?,?,?)";
        
        
        try{
            ps = con.prepareStatement(query);
            
            ps.setInt(1, rowCount("users")+1);
            ps.setString(2,user);
            ps.setString(3,pwd);
            ps.setString(4, phone);
            ps.setString(5,email);
            
            ps.executeUpdate();
            
            
            
            
        }catch(SQLException e){
            
   
        }finally{
            try{
                con.close();
            }catch(SQLException es){
                
            }
        }
        
    }
    
    public int rowCount(String tab){
        String sql="SELECT COUNT(*) AS row_count FROM "+tab;
        try{
        PreparedStatement preparedStatement = con.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("row_count");
            }
        }catch(SQLException e){
                
        }
        return -1;
        
    }
    
}

    

