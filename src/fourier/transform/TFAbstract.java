/*
 ITESS-TICS--TI502-ASYSC
 Agosto-Diciembre 2023
 U3-Transformada de Fourier
 Descripción: Clase abstracta transformada de fourier
 by FJMP 
 23/11/2023
 */
package fourier.transform;

import tools.ComplexNumber;

/**
 *
 * @author saman
 */
public abstract class TFAbstract {
    protected int wPoints;
    protected float w[];
    protected ComplexNumber Fw[];
    protected float FwMod[];
    protected float FwPhase[];

    public TFAbstract(int wPoints) {
        this.wPoints = wPoints;
        this.w = new float [wPoints];
        this.Fw = new ComplexNumber[wPoints];
        this.FwMod = new float [wPoints];
        this.FwPhase = new float [wPoints];
    }
    
    public void computeW(){
        for (int i = 0; i < wPoints; i++){
            w[i] = i;
        }
    }
    
    public abstract void computeFw();
    
    public void computeFwMod(){
         for (int i = 0; i < wPoints; i++){
            FwMod[i] = Fw[i].mod();
        }
    }
    
    public void computeFwPhase(){
         for (int i = 0; i < wPoints; i++){
            FwPhase[i] = Fw[i].angle();
        }
    }

    public int getwPoints() {
        return wPoints;
    }

    public float[] getW() {
        return w;
    }

    public ComplexNumber[] getFw() {
        return Fw;
    }

    public float[] getFwMod() {
        return FwMod;
    }

    public float[] getFwPhase() {
        return FwPhase;
    }
    
    
}
