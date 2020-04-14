
package edu.cecar.controlador;

import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 * Clase: ControladorMultiplicador
 * 
 * @version: 0.1
 *  
 * @since: Apr 12, 2020
 * 
 * Fecha de Modificación:
 * 
 * @author: Vincenzo Angelone
 * 
 * Copyrigth: CECAR
 */
public class ControladorMultiplicador {
    public BigInteger multiplicar(BigInteger n1, BigInteger n2){
        BigInteger resultado = n1.multiply(n2); 
        return resultado;
    }
}
