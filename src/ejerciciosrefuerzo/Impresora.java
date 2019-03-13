/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosrefuerzo;

/**
 *
 * @author Javier
 */
public class Impresora {

    private String numeroSerie;
    private String marca;
    private String modelo;
// se omiten los métodos ‘get’ y ‘set’ de la clase

    public Impresora(String numSerie, String marca, String modelo) {
        numeroSerie = numSerie;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Impresora{" + "numeroSerie=" + numeroSerie + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
}
