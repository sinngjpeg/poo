/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.jpegsinng.poo;

/**
 *
 * @author ingrid
 */
public class Celular {
    
    String marca;
    String modelo;
    String cor;
    Boolean Ligado; 
    
    void ligado(){
        if (this.Ligado == true){
            System.out.println("Olá amigo!.");
        } else {
            System.out.println("Telefone descarregado, por favor carregue seu celular");
        }
    }
    
    void status(){
        System.out.println("Olá seu celular é da marca: " + this.marca + " do modelo: " +  this.modelo + "da cor: " + this.cor + "e ele esta: " );
    }
    
}
