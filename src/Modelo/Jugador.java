/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Nestor
 */
public class Jugador {
    private int ID;
    private String nombre;
    private String edad;
    private double altura;
    private String posicion;    
    private String apellidos;
    private int cedula;    
    private int sueldo;
    private Boolean estado;

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    
    public Jugador(){
        
    }

    public Jugador(int ID, String nombre, String apellidos, int goles) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.goles = goles;
    }

    public Jugador(int ID, String nombre, String apellidos, int cedula, int asistencias) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.asistencias = asistencias;
    }
 
    public Jugador(int ID, String nombre, int golesPI) {
        this.ID = ID;
        this.nombre = nombre;
        this.golesPI = golesPI;
    }
    
    public Jugador( String nombre, int ID, int golesPD) {
        this.ID = ID;
        this.nombre = nombre;
        this.golesPD = golesPD;
    }
    
   
    
    public Jugador(int ID, String nombre, String edad, String posicion, String apellidos, int cedula, int sueldo, String posicionAlternativa) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sueldo = sueldo;
        this.posicionAlternativa = posicionAlternativa;
        
    }

    public Jugador(int ID, String nombre, String apellidos, int cedula, int sueldo ,String edad, double altura, String posicion, String posicionAlternativa, int asistencias, int goles, String piernaHabil) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
        this.posicion = posicion;
        this.posicionAlternativa = posicionAlternativa;
        this.asistencias = asistencias;
        this.goles = goles;
        this.piernaHabil = piernaHabil;
        this.cedula = cedula;
        this.sueldo = sueldo;
    }

    public Jugador(int ID, String nombre, String edad, double altura, String posicion, String posicionAlternativa, int asistencias, int goles, String piernaHabil, int bloqueos, double minutosJugados, int golesPI, int golesPD, int golesC, int golesTL) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.posicion = posicion;
        this.posicionAlternativa = posicionAlternativa;
        this.asistencias = asistencias;
        this.goles = goles;
        this.piernaHabil = piernaHabil;
        this.bloqueos = bloqueos;
        this.minutosJugados = minutosJugados;
        this.golesPI = golesPI;
        this.golesPD = golesPD;
        this.golesC = golesC;
        this.golesTL = golesTL;
    }
    private String posicionAlternativa;
    private int asistencias;
    private int goles;
    private String piernaHabil;
    private int bloqueos;
    private double minutosJugados;
    private int golesPI;
    private int golesPD;
    private int golesC;
    private int golesTL;

    public Jugador(int asistencias, int goles, String piernaHabil, int bloqueos, int golesPI, int golesC, int golesTL) {
        this.asistencias = asistencias;
        this.goles = goles;
        this.piernaHabil = piernaHabil;
        this.bloqueos = bloqueos;
        this.golesPI = golesPI;
        this.golesC = golesC;
        this.golesTL = golesTL;
    }

    public Jugador(int id, String nombre, String edad, double altura, String posicion, String posicionA, String piernah, int goles, int asistencias) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getPiernaHabil() {
        return piernaHabil;
    }

    public void setPiernaHabil(String piernaHabil) {
        this.piernaHabil = piernaHabil;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    public double getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(double minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public int getGolesPI() {
        return golesPI;
    }

    public void setGolesPI(int golesPI) {
        this.golesPI = golesPI;
    }

    public int getGolesPD() {
        return golesPD;
    }

    public void setGolesPD(int golesPD) {
        this.golesPD = golesPD;
    }

    public int getGolesC() {
        return golesC;
    }

    public void setGolesC(int golesC) {
        this.golesC = golesC;
    }

    public int getGolesTL() {
        return golesTL;
    }

    public void setGolesTL(int golesTL) {
        this.golesTL = golesTL;
    }
    
    
    
    

    public Jugador(int ID, String nombre, String edad, double altura, String posicion, String posicionAlternativa) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.posicion = posicion;
        this.posicionAlternativa = posicionAlternativa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getPosicionAlternativa() {
        return posicionAlternativa;
    }

    public void setPosicionAlternativa(String posicionAlternativa) {
        this.posicionAlternativa = posicionAlternativa;
    }
    
  
    
}
