package iestr.gag.tiempo;

public class Main {
    public static void main(String[] args) {
        Tiempo t1=Tiempo.nuevoTiempo(-3,40,58);
        System.out.println(t1);
        Tiempo t2=Tiempo.nuevoTiempo(1,2,3);
        System.out.println(t2);
        Tiempo t3=Tiempo.nuevoTiempo(-1,-1,-1);
        System.out.println(t3);
        Tiempo t4=Tiempo.nuevoTiempo(23,34,666);
        System.out.println(t4);
        System.out.println(Tiempo.getContador());
    }
}