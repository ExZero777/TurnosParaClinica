package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Persona;
import visual.MenuPrincipal;

public class Consulta {
   
   public Persona recuperarPersonaUsuClave(Connection conexion, String textUsu, String textCont) throws SQLException {
      Persona unaPersona = null;
      try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero, dni from persona where usuario = ? and  contrasena = md5(?)");
         consulta.setString(1, textUsu);
         consulta.setString(2, textCont);
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             unaPersona = new Persona(resultado.getInt("id"), null, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni"));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return unaPersona;
   }
   
   public ArrayList<Persona> ListadoPersonas(Connection conexion) throws SQLException {
          ArrayList<Persona> listaPersonas = new ArrayList();
        try{
         PreparedStatement consulta = conexion.prepareStatement("select id, nombre, apellido, genero, dni from persona");
       
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             listaPersonas.add(new Persona(resultado.getInt("id"), null, resultado.getString("nombre"), resultado.getString("apellido"), resultado.getInt("dni")));
            
         }
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return listaPersonas;
   }
 
   public Persona ingresoPersona(Connection conexion, String textUsu, String textCont) throws SQLException {
        Persona ingPersona = null;
        try{
        PreparedStatement consulta = conexion.prepareStatement("select usuario, contrasena from persona");
       
        ResultSet resultado = consulta.executeQuery();
        ingPersona.add(new Persona(resultado.getString("usuario"), resultado.getString("contrasena")));
              
      
        if((textCont.toString() != ingPersona.getContraseña().toString()) && (textUsu.toString() != ingPersona.getUsuario().toString())){
            MenuPrincipal  abriVent = new MenuPrincipal();  
            abriVent.setVisible(true);
            }
         
      }catch(SQLException ex){
         throw new SQLException(ex);
      }
      return ingPersona;
   }
}
