public class Main {
    public static void main(String[] args) {
        Correo correo = new Correo(null);
        Escritor escritor = new Escritor(correo);
        Escritor escritor2 = new Escritor(correo);
        Lector lector = new Lector(correo);
        Lector lector2 = new Lector(correo);

        escritor.start();
        escritor2.start();
        lector.start();
        lector2.start();
    }
}
