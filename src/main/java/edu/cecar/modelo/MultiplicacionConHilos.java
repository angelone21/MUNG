package edu.cecar.modelo;

import edu.cecar.controlador.ControladorMultiplicador;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Clase: MultiplicacionConHilos
 *
 * @version: 0.1
 *
 * @since: Apr 11, 2020
 *
 * Fecha de Modificación:
 *
 * @author: Vincenzo Angelone
 *
 * Copyrigth: CECAR
 */
public class MultiplicacionConHilos extends Thread {

    public ArrayList<String> numeros = new ArrayList<String>();
    public BigInteger resultadoAnterior = new BigInteger("1");
    public int indice;
    public int indiceAnterior;
    ControladorMultiplicador cm = new ControladorMultiplicador();

    public MultiplicacionConHilos(ArrayList<String> lista, int size, int indexAnterior) {
        numeros = lista;
        indice = size;
        indiceAnterior = indexAnterior;
    }

    public BigInteger obtenerValor() {
        return resultadoAnterior;
    }

    @Override
    public void run() {

            for (int i = indiceAnterior; i < indice; i++) {
                resultadoAnterior = cm.multiplicar(resultadoAnterior, new BigInteger(numeros.get(i)));
                System.out.println(resultadoAnterior);
            }

    }

}
