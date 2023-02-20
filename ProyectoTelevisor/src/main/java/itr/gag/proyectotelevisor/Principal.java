/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itr.gag.proyectotelevisor;

import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Televisor[] partida=new Televisor[10];
        
        for(int i=0;i<10;i++){
            partida[i]=new Televisor("Samsung", "Barato", 1800+i*100, true, true);
            System.out.println(partida[i]);
        }
        System.out.println("Qué televisor quieres falsificar a LG (nºserie)?");
        int numeroSerie=sc.nextInt();
        for(Televisor t:partida){
            if(t.getNumeroSerie()==numeroSerie){
                t.setMarca("LG");
                System.out.println(t);
                break;
            }
        }
    }
}
