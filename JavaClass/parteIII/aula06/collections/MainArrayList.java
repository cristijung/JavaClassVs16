package JavaClass.parteIII.aula06.collections;

import java.util.ArrayList;

public class MainArrayList {
    public static void main(String[] args) {
        //criação do ArrayList
        ArrayList<String> nomes = new ArrayList<>();

        //add elementos no ArrayList
        nomes.add("Alice");
        nomes.add("Ana");
        nomes.add("Caio");

        //exibir todos os nomes da lista
        System.out.println("Nomes na lista: " + nomes);
        //add um nome em 1 posição específica
        nomes.add(1, "Pedro");
        System.out.println("Adicionamos mais um nome, na posição 1: " + nomes);
        //remover um nome de uma posição
        nomes.remove(3);
        System.out.println("Removemos o nome da posição 3: " + nomes);
        //remover um nome específico
        nomes.remove("Caio");
        System.out.println("Removemos Caio: " + nomes);

        //iterar sobre o ArrayList
        System.out.println("Iterando sobre o ArrayList: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        //pesquisar nos elementos do ArrayList
        boolean contemPedro = nomes.contains("Pedro");
        System.out.println("A lista contém Pedro? " + contemPedro);
    }
}
