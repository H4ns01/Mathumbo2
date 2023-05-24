/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import bean.votacao;
/**
 *
 * @author Hans Langa
 */
public class dataBD {
    private Conexao conexao;
    private Connection conn;
    
    
    //data data 
    public  dataBD(){
        this.conexao=new Conexao();
        this.conn=this.conexao.getConexao();
        
    }
    
    public void insert (votacao votacao){
      
        String sql= "INSERT INTO votacao(cod,nome,nrdebi,provincia,distrito,nrderecenseamentores) VALUES " + "(?,?,?,?,?) ";
       try {
            PreparedStatement stmt = this.conn.prepareStatement("");
             stmt.setInt(1,votacao.getCod());
             stmt.setString(2,votacao.getNome());
             stmt.setString(3,votacao.getDistrito());
             stmt.setString(4,votacao.getProvincia());
             stmt.setString(5,votacao.getNrdereceamentores());
             stmt.execute();
           



    }catch(Exception e ) {
        
    }
    
    }
}
