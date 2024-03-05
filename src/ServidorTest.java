import org.junit.jupiter.api.Test;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import static org.junit.jupiter.api.Assertions.*;

class ServidorTest {

    @Test
    void main() throws AlreadyBoundException, RemoteException, NotBoundException {
        Servidor.main(new String[]{});

        Registry registry = LocateRegistry.getRegistry("localhost", 1100);
        Interfaz interfaz = (Interfaz) registry.lookup("Calc");
        assertEquals(interfaz.sumar(4,3), 7);
        assertEquals(interfaz.multiplicar(4,3), 12);
        assertEquals(interfaz.dividir(12,4), 3);
        assertEquals(interfaz.restar(4,3), 1);
        assertEquals(interfaz.raizCuadrada(49), 7);
    }
}