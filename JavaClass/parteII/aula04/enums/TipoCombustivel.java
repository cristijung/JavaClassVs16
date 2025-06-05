package JavaClass.parteII.aula04.enums;
//Enum é um tipo de dado especial que permite a uma variável ser
//um conjunto de constantes
enum TipoCombustivel {
    GASOLINA("Gasolina Comum"),
    DIESEL("Diesel S10"),
    ETANOL("Etanol Hidratado"),
    ELETRICO("Eletricidade"),
    GNV("Gás Natural Veicular");

    private final String descricaoAmigavel;

    TipoCombustivel(String descricao) {
        this.descricaoAmigavel = descricao;
    }

    public String getDescricaoAmigavel() {
        return descricaoAmigavel;
    }
}
