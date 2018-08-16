package atividade04;

/**
 *
 * @author paulo
 */
public class Calculadora {
    
    Funcionario funcionario;
           
    public float calcular(Funcionario f) {
        float salario;
        
        if(f.getClass() == Desenvolvedor.class) {
            salario = f.getSalario();
            if(salario >= 3000.00f) {
                Desenvolvedor d = (Desenvolvedor) f;
                d.setDesconto((salario * 20) / 100);
                return d.getDesconto();
            }
        }
        return 1.1f;
    }
}
