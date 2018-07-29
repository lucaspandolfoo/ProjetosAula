/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Windows
 */
public class Exercicio2 {
    
    public static void main(String[] args){
        
        System.out.println("Vai abrir a conexão com o banco de dados");
        ConnectionFactory.abreConexao();
        Connection con = ConnectionFactory.getConnection();
        
        System.out.println("Vai fechar a conexão com o banco de dados");
        ConnectionFactory.closeConnection(con);
    }
    
}
