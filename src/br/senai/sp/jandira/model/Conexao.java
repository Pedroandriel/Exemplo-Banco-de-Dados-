package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String banco, password, servidor, user;


    public Connection conexao;

    public Conexao (){
        this.servidor = "Localhost";
        this.banco = "db_senai_jandira";
        this.user = "root";
        this.password = "bcd127";
    }

    public  boolean connectDrive (){
        try {

            this.conexao = DriverManager.getConnection("jdbc:mysql://" + this.servidor + "/" + this.banco, this.user, this.password);
            return true;


        }catch (Exception erro){
            System.out.println(erro);
            return false;
        }

    }
    public Connection getConnerction(){
        connectDrive();
        return conexao;
    }





}
