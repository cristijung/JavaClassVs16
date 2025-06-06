package JavaClass.parteII.aula05.abstracao;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dobby");
        Cat cat = new Cat("Seth");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();
    }
}
