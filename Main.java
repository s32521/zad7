public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        //-----------------------------------------

        Lion lion = new Lion();
        lion.makeNoise();
        lion.roam();

        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.roam();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.roam();

        Dog dog = new Dog();
        dog.makeNoise();
        dog.roam();
    }
}
