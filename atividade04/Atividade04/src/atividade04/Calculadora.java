package atividade04;

/**
 *
 * @author paulo
 */
public class Calculadora {
    
    Funcionario funcionario;
    
       
    public float calcular(Funcionario f) {

        if(f.getClass() == Desenvolvedor.class)
            return 0.0f;
        else
            return 1.1f;
    }
}
