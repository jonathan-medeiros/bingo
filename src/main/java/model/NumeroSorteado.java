/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jonathandamasiomedeiros
 */
public class NumeroSorteado {
    
    private int numeroSorteado;

    public NumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }
    
    

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    @Override
    public String toString() {
        return "Número: " + this.numeroSorteado;
    }
    
}
