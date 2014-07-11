package Dias_Prederigo;

/**
 *
 * @author 631220116
 */
public class CalcularBinomioControle {
    private IBinomioEntidade e;
    
    public CalcularBinomioControle(IBinomioEntidade e) {
        this.e = e;
    }
    
    public int calcular(int n, int k) {
        e.setN(n);
        e.setK(k);
        return e.getCoeficiente();
}
}
