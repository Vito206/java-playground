public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog max = new Dog("max", 5, "Peng");
        Rabbit rabbit = new Rabbit("snowball", 3, "black");
        Toy robot = new Toy("curious George");

        Animal[] animals = new Animal[]{coco, max, rabbit};
        for (Animal animal : animals) {
            animal.play();
        }

        robot.play();


    }
}
