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
            Desenvolvedor d = (Desenvolvedor) f;
            salario = d.getSalario();
            if(salario >= 3000.00f) {
                d.setDesconto((salario * 20) / 100);
                return d.getDesconto();
            } else {
                
            }
        }
        return 1.1f;
    }
}
