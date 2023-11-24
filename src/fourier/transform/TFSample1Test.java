/*
 ITESS-TICS--TI502-ASYSC
 Agosto-Diciembre 2023
 U3-Transformada de Fourier
 Descripción: Test Clase ejemplo Sample1 f(t)= exp (-at)
 by FJMP 
 23/11/2023
 */
package fourier.transform;

import tools.ComplexNumber;

/**
 *
 * @author saman
 */
public class TFSample1Test {
    
    public static void main (String [] args){
        TFSample1 tf1 = new TFSample1 (5);
        tf1.computeW();
        tf1.computeFw();
        tf1.computeFwMod();
        tf1.computeFwPhase();
        
        ComplexNumber [] cn = tf1.getFw();
        System.out.println("FW: ");
        for ( int i = 0; i < cn.length; i++ ){
            System.out.println(cn[i]);
        }
    }
    
}
