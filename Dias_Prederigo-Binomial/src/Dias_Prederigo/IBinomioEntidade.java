package Dias_Prederigo;

/**
 *
 * @author 631220116
 */
public interface IBinomioEntidade {
    /**
     * @param n valor do primeiro coeficiente(população)     
     */
    void setN(int n);
    /**
     * @param k valor do segundo coeficiente     
     */
    void setK(int k);
    /**
     * @return valor do terceiro coeficiente(população)     
     */
    int getCoeficiente();
    
}
