public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);
        dog.eat();
        cat.eat();
        dog.speak();
        cat.speak();
        System.out.println("---------------------------------");
        animal.eat();
        System.out.println("---------------------------------");
        plant.photosynthesize();
    }
}