import Dias_Prederigo.BinomioEntidade;
import Dias_Prederigo.IBinomioEntidade;
import static org.junit.Assert.*;

/**
 *
 * @author 631220116
 */
public class BinomioEntidadeTest {
    private int n;
    private int c;
    
    public BinomioEntidadeTest(int n, int k, int c) {
        IBinomioEntidade e = new BinomioEntidade();
        e.setN(n);
        e.setK(k);
        int atual = e.getCoeficiente();
        int esperado = c;
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
