/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notas;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Hack
 */
public class modelo {
    
 private String nombre[];
    private String asignatura[];
    private float nota[];
    private int nroelementos;
    
    public modelo(int tam){
        nroelementos = tam;
        nombre = new String[tam];
        asignatura = new String[tam];
        nota = new float[tam];
    }

    public String getNombre(int posicion) {
        return nombre[posicion];
    }

    public void setNombre(String elemento, int posicion) {
        nombre[posicion] = elemento;
    }

    public String getAsignatura(int posicion) {
        return asignatura[posicion];
    }

    public void setAsignatura(String elemento, int posicion) {
        asignatura[posicion] = elemento;
    }

    public float getNota(int posicion) {
        return nota[posicion];
    }

    public void setNota(int posicion, float elemento) {
        nota[posicion] = elemento;
    }

    public int getNroelementos() {
        return nroelementos;
    }

    public void setNroelementos(int nroelementos) {
        this.nroelementos = nroelementos;
    }
    
    public void aggelementos(){
        nroelementos++;
    }

    public int buscar(String element){
    int posicion = -1;
    int punto = 0;
        
    while(posicion == -1 && punto < getNroelementos()){
     if(element.equalsIgnoreCase(getNombre(punto))){
       posicion = punto;
       }
       else{
       punto++;
       }
       }
       return posicion;
    }
}
