package JavaClass.parteII.aula03;

public class Funcionario {
    //atributos
    public String nome;
    protected double salarioBase;
    private final double valeRefeicao;

    //construtor
    public Funcionario(String nome, double salarioBase, double valeRefeicao) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.valeRefeicao = valeRefeicao;
    }

    //métodos
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
       if (salarioBase > 0) {
           this.salarioBase = salarioBase;
       } else {
           System.out.println("Salário base inválido");
       }
    }

    public double getValeRefeicao() {
        return valeRefeicao;
    }

    public double calcularSalarioBruto() {
        return salarioBase + valeRefeicao;
    }

    public double calcularFerias(){
        return salarioBase * ( 1 + (1.0/3));
    }

    public double calcularDecimoTerceiro(int mesesTrabalhados) {
        if (mesesTrabalhados > 0 && mesesTrabalhados <= 12) {
            return (salarioBase / 12) * mesesTrabalhados;
        } else {
            System.out.println("Número de meses inválidos.");
            return 0;
        }
    }
}
