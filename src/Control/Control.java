/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import BD.BD;
import Jugador.Actualizar;
import Jugador.Agregar;
import Jugador.Estadisticas;
import Jugador.Listar;
import Modelo.Jugador;
import Modelo.Jugador1;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nestor
 */
public class Control {
    
    BD man = new BD();
    
    public void controlAgregarPersona() throws SQLException{
        //1. recuperar los datos
        
         
        String nombres = Agregar.jTextFieldNombres.getText();
        String apellidos = Agregar.jTextFieldApellidos.getText();
        String cedulaSt = Agregar.jTextFieldCedula.getText();
        int cedula = Integer.parseInt(cedulaSt);
        String posicion = Agregar.jTextFieldPosicionOriginal.getText();
        String sueldoSt = Agregar.jTextFieldSueldo.getText();
        int sueldo = Integer.parseInt(sueldoSt);
        String edadSt = Agregar.jTextFieldEdad.getText();
        int edad = Integer.parseInt(edadSt);
        String posicionAux1 = Agregar.jTextFieldPosicionAux1.getText();
        
        
        //invoco al metodo para agregar
        man.agregarJugador(cedula, nombres, apellidos, sueldo, edad, cedula, posicion, posicionAux1);
        
        JOptionPane.showMessageDialog(null,"Jugador Agregado Exitosamente!!!");
    }
    
    public ArrayList<Jugador> controlBuscartop5() {
        return man.buscartop5();
    }
    
    
    public ArrayList<Jugador> controlBuscarPersona() {
        return man.buscarJugador();
    }
    
    public void actualizarEvento() throws SQLException{
        int cedula = Integer.parseInt(Listar.jTextFieldCedulaBus.getText());        
        int sueldo = Integer.parseInt(Actualizar.jTextSueldoact.getText());
        String PosOriginal = Actualizar.jTextPosOriginalact.getText();
        String PosAux1 = Actualizar.jTextPosAux1act.getText();
        
        //invoco al metodo para agregar
        man.actualizarRegistro(cedula, PosOriginal, sueldo, PosAux1);
        
        JOptionPane.showMessageDialog(null,"Evento actualizado Exitosamente!!!");
    }
    
    public void eliminarEvento() throws SQLException{
        String id1=Listar.idActulizar.getText();
        int idB=Integer.parseInt(id1);
        
        man.eliminarjugador(idB);
        
    }
    
    public Jugador ActualizaEstadisticas() throws SQLException{
        int id = Integer.parseInt(Listar.idActulizar.getText());
        String piernah =Estadisticas.jTextFieldPiernaHE.getText();
        int asistencias = Integer.parseInt(Estadisticas.jTextFieldAsistenciasE.getText());
        int goles = Integer.parseInt(Estadisticas.jTextFieldGolesME.getText());
        int golespi = Integer.parseInt(Estadisticas.jTextFieldGolesPIE.getText());
        int golespd = Integer.parseInt(Estadisticas.jTextFieldGolesPDE.getText());
        int golesc = Integer.parseInt(Estadisticas.jTextFieldGolesCE.getText());
        int golestl = Integer.parseInt(Estadisticas.jTextFieldGolesTL.getText());
        int minutosj = Integer.parseInt(Estadisticas.jTextFieldMinuJE.getText());
        int bloqueos = Integer.parseInt(Estadisticas.jTextFieldBloqueosE.getText());
        
        man.agregarEstadisticasJugador(id, asistencias, goles, piernah, bloqueos, minutosj, golestl, golestl, golesc, golestl);
        return ActualizaEstadisticas();
    }
    
    public Jugador actualizarJugador() throws SQLException{
        int idBuscar=Integer.parseInt(Listar.idActulizar.getText());
        
        return  man.buscarDatosJugador(idBuscar);
    }
    
    public Jugador controlBuscarEjugador()throws SQLException{
        
        int idBuscar=Integer.parseInt(Listar.idActulizar.getText());
        return man.verEstadisticas(idBuscar);
    }
    
    public ArrayList<Jugador> controlBuscartop5Asistencias() {
        return man.buscartop5Asistencias();
    }
    
    public ArrayList<Jugador> controlBuscargolesPI() {
        return man.buscarGolesPI();
    }
     public ArrayList<Jugador> controlBuscargolesPD() {
        return man.buscarGolesPD();
    }
      public ArrayList<Jugador1> controlBuscargolesCabeza() {
        return man.buscarGolesCabeza();
    }
       public ArrayList<Jugador1> controlBuscargolesLT() {
        return man.buscarGolesTL();
    }
}
