package JavaClass.parteIII.aula06.collections;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        //criação
        HashMap<String, Integer> idadePorNome = new HashMap<>();

        //add elementos ao HashMap
        idadePorNome.put("Ana", 30);
        idadePorNome.put("Bia", 45);
        idadePorNome.put("Bob", 78);

        //exibindo
        System.out.println("Nomes e idades: " + idadePorNome);
        //add um elemento
        idadePorNome.put("Mara", 28);
        //atualizar uma chave com valor incorreto
        idadePorNome.put("Bob", 58);
        System.out.println("Nomes e idades: " + idadePorNome);

        //remover
        idadePorNome.remove("Mara");
        System.out.println("Nomes e idades: " + idadePorNome);

        //iterar sobre os elementos do HashMap
        System.out.println("Iterando: ");
        for (Map.Entry<String, Integer> entrada : idadePorNome.entrySet()) {
            System.out.println("Nome: " + entrada.getKey() + ", Idade: " + entrada.getValue());
        }

        //verificando uma chave e valor
        boolean contemBob = idadePorNome.containsKey("Bob");
        System.out.println("O registro contém Bob? " + contemBob);

        //limpando o hashMap
        idadePorNome.clear();
        System.out.println("Nomes e idades: " + idadePorNome);
     }
}
