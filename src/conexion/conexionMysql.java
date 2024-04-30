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
public class conexionMysql{
Connection cn;


@SuppressWarnings("UseSpecificCatch")
public Connection conectar(){
    
    try{
        Class.forName("com.mysql.jdbc.Driver");
        cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/login_parqueoya","root","miseleccioncolombia26");
        System.out.print("conectado");
    } catch (Exception e){
         System.out.print("Error de conexion"+e);
    }
    return cn;
}
}