package ietr.gag.incidencias;

public class Incidencia {
    public static final String ESTADO_PENDIENTE="Pendiente";
    public static final String ESTADO_RESUELTO="Resuelta";

    private static int contador=0;
    private static int pendientes=0;

    private int codigo;
    private String estado;
    private int puesto;
    private String descripcion;
    private String solucion;

    public Incidencia(int puesto, String descripcion) {
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.codigo=++contador;
        this.estado=ESTADO_PENDIENTE;
        pendientes++;
    }

    public void resuelve(String cadena){
        estado=ESTADO_RESUELTO;
        pendientes--;
        solucion=cadena;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Incidencia ")
                .append(codigo).append(" - Puesto: ")
                .append(puesto).append(" - ").append(descripcion)
                .append(" - ").append(estado);
        if(estado==ESTADO_RESUELTO){
            sb.append(" - ").append(solucion);
        }
        return sb.toString();
    }
}
