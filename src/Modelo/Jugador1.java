/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author nestoragredo
 */
public class Jugador1 {

     private int ID;
    private String nombre;
    private int golesC;
    private int golesTL;
    
    
    public Jugador1(int ID, String nombre, int golesC) {
        this.ID = ID;
        this.nombre = nombre;
        this.golesC = golesC;
    }

   public Jugador1( String nombre, int ID,int golesTL) {
        this.ID = ID;
        this.nombre = nombre;
        this.golesTL = golesTL;
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

}
