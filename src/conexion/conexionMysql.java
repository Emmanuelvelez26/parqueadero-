/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Sistems
 */
//ESTE ES EL CODIGO DE NUESTRA CONEXION A LA BASE DE DATOS
public class conexionMysql{
Connection cn;


@SuppressWarnings("UseSpecificCatch")
public Connection conectar(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/login","root","");
        System.out.print("conectado");
    } catch (Exception e){
         System.out.print("Error de conexion"+e);
    }
    return cn;
}
}