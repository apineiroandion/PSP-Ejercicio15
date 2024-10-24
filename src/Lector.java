public class Lector extends Thread{
    Correo correo;
    public Lector(Correo correo){
        this.correo = correo;
    }

    public void run(){
        while(true){
            if(correo.mensaje != null){
                correo.leerCorreo();
                correo.eliminarCorreo();
            }
        }
    }
}
