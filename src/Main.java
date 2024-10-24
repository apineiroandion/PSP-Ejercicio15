import java.util.ArrayList;

public class Main {
    /**
     * ArrayList de lectores
     */
    static ArrayList<Lector> lectores;
    /**
     * ArrayList de escritores
     */
    static ArrayList<Escritor> escritores;
    /**
     * Número de hilos
     */
    static final int NUM_HILOS = 10;

    /**
     * Metodo main
     * @param args
     */
    public static void main(String[] args) {
        Correo correo = new Correo();
        lectores = cearLectores(correo);
        escritores = crearEscritores(correo);
        iniciarLectores();
        iniciarEscritores();
    }

    /**
     * Metodo para crear lectores
     * @param correo
     * @return ArrayList de lectores
     */
    public static ArrayList<Lector> cearLectores(Correo correo) {
        ArrayList<Lector> lectores = new ArrayList<>();
        for (int i = 0; i < NUM_HILOS; i++) {
            lectores.add(new Lector(correo));
        }
        return lectores;
    }

    /**
     * Metodo para iniciar lectores
     */
    public static void iniciarLectores() {
        for (Lector lector : lectores) {
            lector.start();
        }
    }

    /**
     * Metodo para crear escritores
     * @param correo
     * @return ArrayList de escritores
     */
    public static ArrayList<Escritor> crearEscritores(Correo correo) {
        ArrayList<Escritor> escritores = new ArrayList<>();
        for (int i = 0; i < NUM_HILOS; i++) {
            escritores.add(new Escritor(correo));
        }
        return escritores;
    }

    /**
     * Metodo para iniciar escritores
     */
    public static void iniciarEscritores() {
        for (Escritor escritor : escritores) {
            escritor.start();
        }
    }
}
