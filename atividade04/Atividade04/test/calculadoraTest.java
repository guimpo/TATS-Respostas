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
        float salarioBase = 5000.00f;
        float salarioLiquido = ((80 * salarioBase) / 100);
        d.setSalarioBase(salarioBase);
        float expected = salarioLiquido;
        float actual = c.calcular(d);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void calcularDesenvolvedorMenor3000() {
        Calculadora c = new Calculadora();
        Desenvolvedor d = new Desenvolvedor();
        float salarioBase = 2999.99f;
        float salarioLiquido = ((90 * salarioBase) / 100);
        d.setSalarioBase(salarioBase);
        float expected = salarioLiquido;
        float actual = c.calcular(d);
        assertEquals(expected, actual, 0.01);
    }
}
