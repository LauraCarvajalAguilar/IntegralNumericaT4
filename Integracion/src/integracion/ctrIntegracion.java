
package integracion;

public class ctrIntegracion {
    csTrapecio trapecio;

    public ctrIntegracion(csTrapecio trapecio) {
        this.trapecio = trapecio;
    }
    
    public double getTrapecio(){
        double resultado;
        double fb = this.fx(this.trapecio.getB());
        double fa = this.fx(this.trapecio.getA());
        double suma = 0;
        for(int i=1; i<=this.trapecio.getN()-1;i++){
            suma = this.fx(i*this.trapecio.getH()+this.trapecio.getA());
        }
        resultado = (this.trapecio.getH()/2)*(fa + fb + 2*suma);
        return resultado;
    }
    
    public double fx(double x){
        return Math.PI*(Math.pow(1+(Math.pow(x, 2)/2), 2));
    }
}
