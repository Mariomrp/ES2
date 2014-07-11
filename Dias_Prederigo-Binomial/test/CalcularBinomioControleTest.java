import Dias_Prederigo.CalcularBinomioControle;
import Dias_Prederigo.IBinomioEntidade;
import static org.junit.Assert.*;

/**
 *
 * @author 631220116
 */
public class CalcularBinomioControleTest {
    
    private void Testar(int n, int k, int coef) {
        IBinomioEntidade e = new IBinomioEntidadeFake(n, k, coef);
        CalcularBinomioControle c = new CalcularBinomioControle();
        int atual = c.calcular(n,k);
        int esperado = coef;
        assertEquals(esperado, atual);
    }
   public void testSeisDois() {
        testar(6,2,15);
    }
    
    public void testUmUm() {
        testar(1,1,2);
    }
    
    public void testDoisUm() {
        testar(2,1,2);
    }
    
    public void testDoisDois() {
        testar(2,2,1);
    }
}
