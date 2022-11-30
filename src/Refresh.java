public class Refresh extends Thread {
    Interfaz interfaz;
    Controlador controlador;

    Refresh(Interfaz interfaz) {
        this.interfaz = interfaz;
    }
    public void run() {
        try {
            sleep(100);
            while (true){
                interfaz.actualizarTablero();
                sleep(15);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}