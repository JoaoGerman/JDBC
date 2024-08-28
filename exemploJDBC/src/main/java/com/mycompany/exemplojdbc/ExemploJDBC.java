/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class ExemploJDBC {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.driver");
            Connection ExemploJDBC = DriverManager.getConnection("jdbc:mysql://localhost/NomeDoBanco", "usuario", "1234");
        } catch (ClassNotFoundException ex) {
            System.out.println("driver do banco de dados não encontrado.");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + ex.getMessage());
        }
    }
}
