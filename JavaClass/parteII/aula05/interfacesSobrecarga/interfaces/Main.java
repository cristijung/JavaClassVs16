package JavaClass.parteII.aula05.interfacesSobrecarga.interfaces;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Pity");
        Animal cat = new Cat("Mina");
        Animal jacare = new Jacare("Jack");


        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();

        jacare.eat();
        jacare.makeSound();
    }
}
