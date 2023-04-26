/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases02;

public class Hospital {
    private String nombre;
    private int numeroCamas;
    private double presupuesto;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerNumerocamas(int n){
        numeroCamas = n;
    }
    public void establecerPresupuesto(double n){
        presupuesto = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerNumeroCamas(){
        return numeroCamas;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
