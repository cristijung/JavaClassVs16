package JavaClass.parteII.aula04.enums;
//Superclasse
class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected TipoCombustivel combustivel;

    public Veiculo(String marca, String modelo, int ano, TipoCombustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo de Combustível: " + combustivel.getDescricaoAmigavel()); // Usando o método do Enum
    }

    public void abastecer() {
        System.out.println("O veículo " + modelo + " está sendo abastecido com " + combustivel.getDescricaoAmigavel() + ".");
        if (combustivel == TipoCombustivel.ELETRICO) {
            System.out.println("Conectando à estação de recarga...");
        }
    }
}
