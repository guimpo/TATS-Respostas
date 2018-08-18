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
            Desenvolvedor d = (Desenvolvedor) f;
            salarioBase = d.getSalarioBase();
            if(salarioBase >= 3000.00f) {
                d.setSalarioLiquido((salarioBase * 80) / 100);
                return d.getSalarioLiquido();
            } else {
                d.setSalarioLiquido((salarioBase * 90) / 100);
                return d.getSalarioLiquido();
            }
        }
        
        if(f.getClass() == Dba.class) {
            Dba db = (Dba) f;
            salarioBase = db.getSalarioBase();
            if(salarioBase >= 2000.00f) {
                db.setSalarioLiquido((salarioBase * 75) / 100);
                return db.getSalarioLiquido();
            } else {
                db.setSalarioLiquido((salarioBase * 85) / 100);
                return db.getSalarioLiquido();
            }
        }
        return 0.0f;
    }
}
