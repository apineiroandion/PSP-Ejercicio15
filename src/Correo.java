public class Correo {
    Mensaje mensaje;
    Object lock = new Object();

    public Correo(Mensaje mensaje) {
        synchronized (lock){
            this.mensaje = mensaje;
        }
    }

    public Mensaje getMensaje() {
        synchronized (lock){
            return mensaje;
        }
    }

    public void setMensaje(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public void leerCorreo(){
        if(mensaje == null){
                System.out.println("No hay mensajes");
        }else{
                System.out.println("De: " + mensaje.getEmisor());
                System.out.println("Para: " + mensaje.getReceptor());
                System.out.println("Mensaje: " + mensaje.getMensaje());
        }
    }

    public void recibirCorreo(String emisor, String receptor, String mensaje){
        this.mensaje = new Mensaje(emisor, receptor, mensaje);
    }

    public void eliminarCorreo(){
            mensaje = null;
    }
}
