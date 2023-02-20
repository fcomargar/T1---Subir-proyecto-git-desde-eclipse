/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itr.gag.proyectotelevisor;

/**
 *
 * @author profesor
 */
public class Televisor {
    
    public static final int CANAL_MIN=0;
    public static final int CANAL_MAX=99;
    private static final int VOL_MIN=0;
    private static final int VOL_MAX=100;
    
    private static int contador=1000;//para ir asignando númeors de serie
    
    private String marca;
    private String modelo;
    private int anio;
    private boolean panoramica;
    private boolean estereo;
    private boolean encendido=false;
    private int canal=0;
    private int volumen=0;
    private int numeroSerie;

    public Televisor(String marca, String modelo, int anio, boolean panoramica, boolean estereo) {
        this.marca = marca;
        this.modelo = modelo;
        if(anio<1950){
            anio=1950;
        }else if(anio>2200){
            anio=2200;
        }
        this.anio = anio;
        this.panoramica = panoramica;
        this.estereo = estereo;
        
        
        numeroSerie=contador;
        contador++;
    }
    
    public void encender(){
        if(!encendido){
            System.out.println("Encendiendo televisor ...");
            encendido=true;
        }
    }
    
    public void apagar(){
        if(!encendido){
            System.out.println("Televisor APAGADO!!");
            return;
        }else{
            System.out.println("Apagando televisor ...");
            encendido=false;
        } 
    }

    public void seleccionarCanal(int canal){
        if(!encendido){
            System.out.println("Televisor APAGADO!!");
            return;
        }
        if(canal>=CANAL_MIN && canal <=CANAL_MAX){
            System.out.println("Cambiando al canal "+canal+"...");
            this.canal=canal;
        }else{
            System.out.printf("No existe el canal %d\n",canal);
        }
    }

    public int obtenerCanal() {
        if(!encendido){
            System.out.println("Televisor APAGADO!!");
            return 0;
        }
        return canal;
    }
    
    void subirCanal(){
        seleccionarCanal(canal+1);
    }
    
    void bajarCanal(){
        seleccionarCanal(canal-1);
    }
    
    public void cambiarVolumen(int volumen){
        if(!encendido){
            System.out.println("Televisor APAGADO!!");
            return;
        }
        if(volumen>=VOL_MIN && volumen <=VOL_MAX){
            System.out.println("Cambiando el volumen a "+volumen+"...");
            this.volumen=volumen;
        }else{
            System.out.printf("No se puede cambia el volumen\n");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Televisor{ marca=").append(marca).append(", modelo=").append(modelo)
                .append(", anio=").append(anio).append(", panoramica=").append(panoramica).append(", ns=").append(numeroSerie);
        //return  + "" + marca + ", modelo=" + modelo + ", anio=" + anio + ", panoramica=" + panoramica + ", estereo=" + estereo + ", encendido=" + encendido + ", canal=" + canal + ", volumen=" + volumen + ", numeroSerie=" + numeroSerie + '}';
        return sb.toString();
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    

    
    
}
