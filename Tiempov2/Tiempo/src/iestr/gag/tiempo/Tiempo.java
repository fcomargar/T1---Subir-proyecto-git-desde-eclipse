package iestr.gag.tiempo;

public class Tiempo {
    private static int contador=0;
    private int horas;
    private int minutos;
    private int segundos;

    private Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos =  minutos;
        this.segundos =  segundos;
        ajustar();
        contador++;
    }

    public static Tiempo nuevoTiempo(int horas, int minutos, int segundos) {
        Tiempo t;
        if(horas<0 || minutos<0 ||segundos<0){
            t=null;
        }else{
            t=new Tiempo(horas,minutos,segundos);
        }
        return t;
    }

    @Override
    public String toString() {
        return horas +"h "+minutos +"m "+ segundos +"s";
    }

    private void ajustar(){
        //Primero los segundos
        int minutosOcultos=segundos/60;
        segundos-=minutosOcultos*60;
        minutos+=minutosOcultos;
        //Ahora los minutos
        int horasOcultas=minutos/60;
        minutos-=horasOcultas*60;
        horas+=horasOcultas;
    }

    public void acumula(Tiempo t){
        this.horas+=t.horas;
        this.minutos+=t.minutos;
        this.segundos+=t.segundos;
        ajustar();
    }

    public Tiempo suma(Tiempo t1, Tiempo t2){
        return new Tiempo(t1.horas+t2.horas, t1.minutos+t2.minutos, t1.segundos+t2.segundos);
    }

    //////////////////////////////////////////


    public static int getContador() {
        return contador;
    }
}
