/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Modelo.Jugador;
import Modelo.Jugador1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nestor
 */
public class BD {
    
    public Connection getConnexion() throws SQLException {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/deportes", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public void agregarJugador(int cedula,String nombre, String apellido,int sueldo, int edad,double altura, String posicion, String posicionA) throws SQLException {

        Statement stmt = getConnexion().createStatement();
        
        stmt.executeUpdate("INSERT INTO jugador(nombre,apellido, sueldo,edad,altura,posicion,posicionA,cedula, estado) values('" + nombre + "','" + apellido + "'," + sueldo + "," + edad + "," + altura + ",'" + posicion + "','" + posicionA + "'," + cedula+","+ 1 +")");
        stmt.close();
        

    }

    public ArrayList<Jugador> buscarJugador() {
        ArrayList<Jugador> lista = new ArrayList();
        try {
            int un = 1;
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT * FROM jugador where estado = " + un);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String nombres = res.getString("nombre");
                String apellidos = res.getString("apellido");
                int cedula = res.getInt("cedula");
                String posicionOriginal = res.getString("posicion");
                int sueldo = res.getInt("sueldo");
                String edad = res.getString("edad");
                String posicionAux = res.getString("posicionA");
                
                Jugador e = new Jugador(id, nombres, edad, posicionAux, apellidos, cedula, sueldo, posicionOriginal);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void actualizarRegistro(int cedula, String posicionOriginal, int sueldo, String posicionAux1) {
                
        Statement stmt;
        try {
            stmt = getConnexion().createStatement();            
            stmt.executeUpdate("UPDATE jugador SET sueldo ="+sueldo+",posicion='"+posicionOriginal+"',posicionA='"+posicionAux1+"' WHERE cedula =" + cedula );
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void agregarEstadisticasJugador(int id,int asistencias, int goles,String piernah,int bloqueos, int minutosJugados,int golesPI,int GolesPD,int golesC,int golesTL) throws SQLException{

        Statement stmt = getConnexion().createStatement();
        
        stmt.executeUpdate("INSERT INTO detallesjugador() values('" + id + "'," + asistencias + "," + goles + ",'" + piernah + "','" + bloqueos + "'," + minutosJugados + ",'" + golesPI + "','" + GolesPD + "','" + golesC + "','" + golesTL + "')");
        stmt.close();
        JOptionPane.showMessageDialog(null, "Estadisticas actualizadas Correctamente XXXXX");
        
    }
    
    public void actualizarD(int id, String nombre, int edad,double altura, String posicion, String posicionA) {
                
        Statement stmt;
        try {
            stmt = getConnexion().createStatement();
            String sql="UPDATE jugador SET nombre ='"+nombre+"',edad='"+edad+"',altura='"+altura+"',posicion='"+posicion+"',posicionA='"+posicionA+"' WHERE id =" + id;
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public ArrayList<Jugador> buscarEstaJugador() {
        ArrayList<Jugador> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT * FROM detallejugador");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int goles=res.getInt("goles");
                int asistencias=res.getInt("Asistencias");
                String piernah=res.getString("piernah");
                int bloqueos=res.getInt("bloqueos");
                int minutosj=res.getInt("minutosJ");
                int golespi=res.getInt("GolesPI");
                int golespd=res.getInt("GolesPD");
                int golesc=res.getInt("GolesC");
                int golestl=res.getInt("GolesTL");
                
                Jugador e = new Jugador(asistencias, goles, piernah, bloqueos, golestl, golesc, golestl);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return lista;
    }
    
    public Jugador buscarDatosJugador(int id) {
        Jugador jugador = null;
        try {
            String sql ="SELECT * FROM jugador where id="+ id;
            PreparedStatement pstm = this.getConnexion().prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int ced = res.getInt("id");
                System.out.println("llega id"+ced);
                String nombre = res.getString("nombre");
                String edad = res.getString("edad");
                double altura= res.getDouble("Altura");
                String posicion = res.getString("posicion");
                String posicionA = res.getString("posicionA");
            

                jugador  = new Jugador(ced, nombre, edad, altura, posicion,posicionA);
                
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jugador;
    }
    
    public Jugador verEstadisticas(int id)throws SQLException{
        Jugador jugador = null;
        try {
            String sql ="SELECT * FROM detallesjugador where idDetalle="+ id;
            PreparedStatement pstm = this.getConnexion().prepareStatement(sql);
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int goles=res.getInt("goles");
                int asistencias=res.getInt("Asistencias");
                String piernah=res.getString("piernah");
                int bloqueos=res.getInt("bloqueos");
                int minutosj=res.getInt("minutosJ");
                int golespi=res.getInt("GolesPI");
                int golespd=res.getInt("GolesPD");
                int golesc=res.getInt("GolesC");
                int golestl=res.getInt("GolesTL");

                jugador  = new Jugador(asistencias, goles, piernah, bloqueos, golestl, golesc, golestl);
                
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        return jugador;
        
        
    }
    
    public void eliminarjugador(int id)throws SQLException{
        Statement stmt;
        try {
            stmt = getConnexion().createStatement();
            String sql="UPDATE jugador SET estado = '"+0+" 'WHERE id =" + id;
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
    
    public ArrayList<Jugador> buscartop5() {
        ArrayList<Jugador> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT id,nombre,apellido,C.goles FROM  jugador inner join \n" +
            "(SELECT idfk, goles FROM detallesjugador order by goles desc) AS C on jugador.id =C.idfk ; ");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                String nombres = res.getString("nombre");
                String apellidos = res.getString("apellido");
                int goles = res.getInt("goles");
                         
                                
                Jugador e = new Jugador(id, nombres, apellidos, goles);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    
    } 
    
    public ArrayList<Jugador> buscartop5Asistencias() {
        ArrayList<Jugador> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT id,nombre,apellido,cedula,C.Asistencias FROM  jugador inner join (SELECT idfk, Asistencias FROM detallesjugador order by Asistencias desc) AS C on jugador.id =C.idfk order by Asistencias desc;");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");
                int cedula = res.getInt("cedula");
                String nombres = res.getString("nombre");
                String apellidos = res.getString("apellido");
                int asistencias = res.getInt("Asistencias");
                         
                                
                Jugador e = new Jugador(id, nombres, apellidos, cedula, asistencias);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    
    }
    
    public ArrayList<Jugador> buscarGolesPI() {
        ArrayList<Jugador> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT id,nombre,C.GolesPI FROM  jugador inner join (SELECT idfk, GolesPI FROM detallesjugador order by GolesPI desc) AS C on jugador.id =C.idfk order by GolesPI desc");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");                
                String nombres = res.getString("nombre");                
                int golesPI = res.getInt("GolesPI");
                         
                                
                Jugador e = new Jugador(id, nombres, golesPI);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    
    }

    
     public ArrayList<Jugador> buscarGolesPD() {
        ArrayList<Jugador> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT id,nombre,C.GolesPD FROM  jugador inner join (SELECT idfk, GolesPD FROM detallesjugador order by GolesPD desc) AS C on jugador.id =C.idfk order by GolesPD desc");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");                
                String nombres = res.getString("nombre");                
                int golesPD = res.getInt("GolesPD");
                         
                                
                Jugador e = new Jugador(nombres, id, golesPD);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    
    }
     
      public ArrayList<Jugador1> buscarGolesCabeza() {
        ArrayList<Jugador1> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT id,nombre,C.GolesC FROM  jugador inner join (SELECT idfk, GolesC FROM detallesjugador order by GolesC desc) AS C on jugador.id =C.idfk order by GolesC desc");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");                
                String nombres = res.getString("nombre");                
                int golesC = res.getInt("GolesC");
                         
                                
                Jugador1 e = new Jugador1(id, nombres, golesC);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    
    }
      
       public ArrayList<Jugador1> buscarGolesTL() {
        ArrayList<Jugador1> lista = new ArrayList();
        try {
            PreparedStatement pstm = this.getConnexion().prepareStatement("SELECT id,nombre,C.GolesTL FROM  jugador inner join (SELECT idfk, GolesTL FROM detallesjugador order by GolesTL desc) AS C on jugador.id =C.idfk order by GolesTL desc");
            ResultSet res = pstm.executeQuery();
            while (res.next()) {
                int id = res.getInt("id");                
                String nombres = res.getString("nombre");                
                int golesTL = res.getInt("GolesTL");
                         
                                
                Jugador1 e = new Jugador1(nombres, id, golesTL);
                lista.add(e);
            }
            res.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    
    }
}
