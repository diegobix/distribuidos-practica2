import org.junit.jupiter.api.Test;

import java.rmi.RemoteException;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testSumar() throws RemoteException {
        Calculadora calculadora = new Calculadora();
        assertEquals(5, calculadora.sumar(2, 3), 0); // Verifica que 2 + 3 sea igual a 5
    }

    @Test
    void testRestar() throws RemoteException {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.restar(5, 3), 0); // Verifica que 5 - 3 sea igual a 2
    }

    @Test
    void testMultiplicar() throws RemoteException {
        Calculadora calculadora = new Calculadora();
        assertEquals(15, calculadora.multiplicar(3, 5), 0); // Verifica que 3 * 5 sea igual a 15
    }

    @Test
    void testDividir() throws RemoteException {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.dividir(10, 5), 0); // Verifica que 10 / 5 sea igual a 2
    }

    @Test
    void testRaizCuadrada() throws RemoteException {
        Calculadora calculadora = new Calculadora();
        assertEquals(2, calculadora.raizCuadrada(4), 0); // Verifica que la raíz cuadrada de 4 sea igual a 2
    }
}