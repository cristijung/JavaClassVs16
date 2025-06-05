package JavaClass.parteII.aula04.enums;

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
