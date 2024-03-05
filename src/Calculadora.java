import java.rmi.RemoteException;

public class Calculadora implements Interfaz {

    /*
    Sobrescribir opcionalmente los métodos que escribimos en la interfaz
    */
    @Override
    public float sumar(float numero1, float numero2) throws RemoteException {
        return numero1 + numero2;
    };

    @Override
    public float multiplicar(float numero1, float numero2) throws RemoteException {
        return numero1 * numero2;
    };

    @Override
    public float dividir(float numero1, float numero2) throws RemoteException {
        return numero1 / numero2;
    };

    @Override
    public float restar(float numero1, float numero2) throws RemoteException {
        return numero1 - numero2;
    }

    @Override
    public double raizCuadrada(float numero) throws RemoteException {
        return Math.sqrt(numero);
    }
}
