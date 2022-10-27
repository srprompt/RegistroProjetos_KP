/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.ConexaoBD;

/**
 *
 * @author Giovanni
 */
public class EfetuaConexao {
     public static void conectaBanco(String servidor, ConexaoBD bd, String usuario, String senha){

            bd.Conectar(servidor, usuario, senha); 

    }
}
