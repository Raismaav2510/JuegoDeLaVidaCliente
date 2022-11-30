import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Controlador extends Remote {
    boolean getCelula(int posX, int posY) throws RemoteException;

    void inicializarJuego(int dimensiones) throws RemoteException;

    void llenarJuego() throws RemoteException;

    void avanzarSecuencial() throws RemoteException;

    void avanzarJorkJoin() throws RemoteException;

    void avanzarExecutor() throws RemoteException;

    long getTiempo() throws RemoteException;

    boolean listo() throws RemoteException;
}
