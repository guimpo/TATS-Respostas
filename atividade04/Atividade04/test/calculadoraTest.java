import atividade04.Calculadora;
import atividade04.Dba;
import atividade04.Desenvolvedor;
import atividade04.Testador;
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
    
    @Test
    public void calcularDBAMaiorIgual2000() {
        Calculadora c = new Calculadora();
        Dba d = new Dba();
        float salarioBase = 2000.00f;
        float salarioLiquido = ((75 * salarioBase) / 100);
        d.setSalarioBase(salarioBase);
        float expected = salarioLiquido;
        float actual = c.calcular(d);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void calcularDBAMenor2000() {
        Calculadora c = new Calculadora();
        Dba d = new Dba();
        float salarioBase = 1999.99f;
        float salarioLiquido = ((85 * salarioBase) / 100);
        d.setSalarioBase(salarioBase);
        float expected = salarioLiquido;
        float actual = c.calcular(d);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void calcularTestadorMaiorIgual2000() {
        Calculadora c = new Calculadora();
        Testador t = new Testador();
        float salarioBase = 2000.00f;
        float salarioLiquido = ((75 * salarioBase) / 100);
        t.setSalarioBase(salarioBase);
        float expected = salarioLiquido;
        float actual = c.calcular(t);
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void calcularTestadorMenor2000() {
        Calculadora c = new Calculadora();
        Testador t = new Testador();
        float salarioBase = 1999.99f;
        float salarioLiquido = ((85 * salarioBase) / 100);
        t.setSalarioBase(salarioBase);
        float expected = salarioLiquido;
        float actual = c.calcular(t);
        assertEquals(expected, actual, 0.01);
    }
}
