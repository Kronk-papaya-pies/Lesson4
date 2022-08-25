package by.academy.Lesson7;

public class Start {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        Dog dog = new Dog("Пёс");
        Horse horse = new Horse("Лошадь");

        System.out.println(dog.name);
        System.out.println(dog.body);
        System.out.println(dog.eyes);

        Animal animal = new Animal("Животные");
        animal.makeNoise(cat.name);
        animal.eat(horse.name, horse.food);
        animal.voice(dog.name, dog.voice);
    }
}
