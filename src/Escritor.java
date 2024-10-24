public class Escritor extends Thread{
    Correo correo;
    public Escritor(Correo correo){
        this.correo = correo;
    }

    public void run(){
        while(true){
            if(correo.mensaje == null){
                String emisor = "Juan"+Math.random();
                String receptor = "Pedro"+Math.random();
                String mensaje = "Hola"+Math.random();
                correo.recibirCorreo(emisor, receptor, mensaje);
            }
        }
    }
}
