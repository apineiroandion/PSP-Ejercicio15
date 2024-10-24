public class Lector extends Thread {
    /**
     * Correo sobre el que se va a trabajar
     */
    private Correo correo;

    /**
     * Constructor
     * @param correo
     */
    public Lector(Correo correo) {
        this.correo = correo;
    }

    /**
     * Metodo run
     */
    @Override
    public void run() {
        while (true) {
            correo.leerCorreo();
            dormir();
        }
    }

    /**
     * Metodo para dormir
     */
    public void dormir(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
