import atividade04.Calculadora;
import atividade04.Desenvolvedor;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author paulo
 */
public class calculadoraTest {
    
    @Test
    public void calcularDesenvolvedorMaiorIgual3000() {
        Calculadora c = new Calculadora();
        Desenvolvedor d = new Desenvolvedor();
        d.setSalario(3000.00f);
        float expected = 600.00f;
        float actual = c.calcular(d);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void calcularDesenvolvedorMenor3000() {
        Calculadora c = new Calculadora();
        Desenvolvedor d = new Desenvolvedor();
        d.setSalario(2999.99f);
        float expected = (2999.99f * 10) / 100;
        float actual = c.calcular(d);
        assertEquals(expected, actual, 0.01);
    }
}
