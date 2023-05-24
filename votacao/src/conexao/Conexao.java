/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
  import java.sql.DriverManager;
    import java.sql.Statement;


/**
 *
 * @author Hans Langa morrer e daqui pra que
 */
public class Conexao {
 
public Connection getConexao()
{
    try {

  Connection conn =DriverManager .getConnection("jdbc:mysql://localhost:127.0.0.1/votaca","root","");
   Statement stm = conn.createStatement();
  return conn ;
    } catch (Exception e){
        
    
    return null;    
    }
    }
}

