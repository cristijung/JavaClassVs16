package JavaClass.parteIII.aula06.collections;
//HashSet é uma coleção que não permite elementos duplicados e não garante a ordem em que os
//elementos serão armazenados
import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args) {
        //criação do HashSet
        HashSet<String> nomes = new HashSet<>();

        //add elementos
        nomes.add("Ana");
        nomes.add("Bia");
        nomes.add("Beto");

        //exibindo
        System.out.println("Nomes do conjunto: " + nomes);
        //tentando add um nome existente
        //O HashSet não adiciona elementos iguais
        nomes.add("Ana");
        System.out.println("Nomes do conjunto: " + nomes);

        //removendo
        nomes.remove("Beto");
        System.out.println("Nomes do conjunto: " + nomes);

        System.out.println("Iterando sobre o conjunto: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        boolean contemBeto = nomes.contains("Beto");
        System.out.println("Localizando Beto? " + contemBeto);

        int tamanho = nomes.size();
        System.out.println("Número de elementos do conjunto: " + tamanho);
    }
}
