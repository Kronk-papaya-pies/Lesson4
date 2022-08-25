package by.academy.Lesson7;

public class Animal {

    private  String type;

    String food;
    String location;

    public void voice(String name, String voice) {
        System.out.println(name + " говорит " + voice);
    }

    public void eat(String name, String food) {
        System.out.println(name + " ест " + food);
    }

    public void sleep(String name) {
        System.out.println(name + " спит кучу времени.");
    }

    public void makeNoise(String name) {
        System.out.println(name + " сейчас спит");
    }

    public Animal(String type) {
        this.type = type;
    }

}

