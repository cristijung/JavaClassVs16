package JavaClass.parteII.aula04.enums;
//Subclasse Carro
class Carro extends Veiculo {
    private int numeroDePortas;
    private boolean arCondicionado;

    public Carro(String marca, String modelo, int ano, TipoCombustivel combustivel, int numeroDePortas, boolean arCondicionado) {
        super(marca, modelo, ano, combustivel); //chama o construtor da superclasse
        this.numeroDePortas = numeroDePortas;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public boolean temArCondicionado() {
        return arCondicionado;
    }

    // Sobrescrevendo o método exibirDetalhes para incluir informações específicas do Carro
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de Portas: " + numeroDePortas);
        System.out.println("Ar Condicionado: " + (arCondicionado ? "Sim" : "Não"));
    }

    public void ligarArCondicionado() {
        if (arCondicionado) {
            System.out.println("Ligando o ar condicionado do " + modelo + ".");
        } else {
            System.out.println("Este " + modelo + " não possui ar condicionado.");
        }
    }
}