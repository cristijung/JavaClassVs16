package JavaClass.parteII.aula05.abstracao;

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " diz: Au Au!");
    }
}
