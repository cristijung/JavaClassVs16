package JavaClass.parteIII.aula06.collections;

import java.util.Map;
import java.util.TreeMap;

//TreeMap é como um dicionário e armazena chave-valor ORDENADOS de acordo com as chaves
//Chaves são únicas, não permite chaves duplicadas
public class MainTreeMap {
    public static void main(String[] args) {
        //criação

        TreeMap<String, Double> precoPorFruta = new TreeMap<>();

        //add elementos
        precoPorFruta.put("Banana", 1.99);
        precoPorFruta.put("Maçã", 4.99);
        precoPorFruta.put("Melancia", 2.99);
        precoPorFruta.put("Laranja", 8.99);
        precoPorFruta.put("Morango", 10.99);

        //exibindo
        System.out.println("Frutas e seus preços: " + precoPorFruta);
        //removendo
        precoPorFruta.remove("Banana");
        System.out.println("Removendo Banana: " + precoPorFruta);
        //iterando
        System.out.println("Iterando sobre Frutas: ");
        for (Map.Entry<String, Double> entrada : precoPorFruta.entrySet()) {
            System.out.println("Fruta: " + entrada.getKey() + ", Preço: " + entrada.getValue());
        }

        //Obtendo a primeira e a última Chave do mapa
        String primeiraFruta = precoPorFruta.firstKey();
        String ultimaFruta = precoPorFruta.lastKey();
        System.out.println("Primeira fruta: " + primeiraFruta);
        System.out.println("Última fruta: " + ultimaFruta);
    }
}
