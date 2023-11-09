package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpresaController {

    public void consultarFuncionarios() throws SQLException {
     // Instanciar Coonexão //
        Conexao conexao = new Conexao();

     // Referência do nosso banco no controller da arquitetura //
        Connection connection = conexao.getConnerction();

     // Responsavel por executar a query //
        Statement statement = connection.createStatement();

        // Query
        String queryConsulta =  "SELECT * FROM funcionario";

        // Armazena o retorno do banco //
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){
             int idfuncionario =  resultSet.getInt("idfuncionario");
             String nome = resultSet.getString("nome");
             String sobrenome = resultSet.getString("sobrenome");
             int matricula =  resultSet.getInt("matricula");

            System.out.println(idfuncionario);
            System.out.println(nome + " " + sobrenome);
            System.out.println(matricula);
            System.out.println("-***********-*-*-*-*-*-*-**-*-*-*-*");



        }



    }
}
