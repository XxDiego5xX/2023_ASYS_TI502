/*
 ITESS-TICS--TI502-ASYSC
 Agosto-Diciembre 2023
 U3-Transformada de Fourier
 Descripción: Clase ejemplo Sample1 f(t)= exp (-at)
 by FJMP 
 23/11/2023
 */
package fourier.transform;

import tools.ComplexNumber;

/**
 *
 * @author saman
 */
public class TFSample1 extends TFAbstract{

    public TFSample1(int wPoints) {
       super (wPoints);
    }
    
     public void computeFw(){
         
         float a = 1;
         for (int i = 0; i < wPoints; i++){
             float real = a/(a*a+w[i]*w[i]);
             float imag = -w[i]/(a*a+w[i]*w[i]);
             Fw[i] = new ComplexNumber(real, imag);
         }
     }
    
    
}
