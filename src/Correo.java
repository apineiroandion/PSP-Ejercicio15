public class Correo {
    /**
     * Mensaje
     */
    private String mensaje;
    /**
     * Booleano para saber si hay mensaje
     */
    private Boolean lleno;

    /**
     * Constructor
     */
    public Correo() {
        this.lleno = false;
    }

    /**
     * Metodo para leer correo si hay mensaje
     */
    public synchronized void leerCorreo(){
        if(Boolean.TRUE.equals(lleno)){
            System.out.println("Mensaje: " + this.mensaje);
            mensaje = "";
            this.lleno = false;
        }else {
            System.out.println("No hay mensajes");
        }
    }

    /**
     * Metodo para crear un nuevo mensaje si no hay uno
     * @param mensaje
     */
    public synchronized void nuevoMensaje(String mensaje) {
        if (Boolean.FALSE.equals(lleno)) {
            System.out.println("creando mensaje: "+mensaje);
            this.mensaje = mensaje;
            this.lleno = true;
        } else {
            System.out.println("Ya hay un mensaje");
        }
    }

    /**
     * Metodo para generar un mensaje de prueba
     * @return mensaje
     */
    public String generarMensaje() {
        return "Mensaje de prueba "+Math.random();
    }

}
