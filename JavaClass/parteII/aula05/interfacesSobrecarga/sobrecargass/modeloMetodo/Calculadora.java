package JavaClass.parteII.aula05.interfacesSobrecarga.sobrecargass.modeloMetodo;

//implementação da Sobrecarga (Calculadora): classe Calculadora cumpre o contrato da interface
//implementando somar(int, int). Além disso, ela oferece uma versão "extra" do
//mesmo método, somar(int, int, int), o que é um exemplo de sobrecarga de método.
//classe que implementa a interface e sobrecarrega o método somar
class Calculadora implements Operacao {

    //método obrigatório da interface Operacao!!
    @Override
    public int somar(int a, int b) {
        System.out.println("Usando a soma de dois números (da interface)");
        return a + b;
    }

    //método sobrecarregado (mesmo nome, mas com três parâmetros)
    public int somar(int a, int b, int c) {
        System.out.println("Usando a soma de três números (sobrecarga)");
        return a + b + c;
    }
}