package atividade04;

/**
 *
 * @author paulo
 */
public class Calculadora {
    
    Funcionario funcionario;
           
    public float calcular(Funcionario f) {
        float salarioBase;
        
        if(f.getClass() == Desenvolvedor.class) {
            salarioBase = f.getSalarioBase();
            if(salarioBase >= 3000.00f) {
                return ((salarioBase * 80) / 100);
            } else {
                return ((salarioBase * 90) / 100);
            }
        }
        
        if(f.getClass() == Dba.class) {
            salarioBase = f.getSalarioBase();
            if(salarioBase >= 2000.00f) {
                return ((salarioBase * 75) / 100);
            } else {
                return ((salarioBase * 85) / 100);
            }
        }
        
        if(f.getClass() == Testador.class) {
            salarioBase = f.getSalarioBase();
            if(salarioBase >= 2000.00f) {
                return ((salarioBase * 75) / 100);
            } else {
                return ((salarioBase * 85) / 100);
            }
        }
        
        if(f.getClass() == Gerente.class) {
            salarioBase = f.getSalarioBase();
            if(salarioBase >= 5000.00f) {
                return ((salarioBase * 70) / 100);
            } else {
                return ((salarioBase * 80) / 100);
            }
        }       
        return 0.0f;
    }
}
