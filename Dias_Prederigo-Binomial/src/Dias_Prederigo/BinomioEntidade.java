package Dias_Prederigo;

/**
 *
 * @author 631220116
 */
public class BinomioEntidade implements IBinomioEntidade {
  
    private int n;
    private int k;
    
    @Override
    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void setK(int k) {
        this.k = k;
    }

    @Override
    public int getCoeficiente() {
        int r;
        r = n + k;
        return r;
    }
}
