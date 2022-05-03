package lesson1;

public class Main {

    public static void main(String[] args) {
        String[] commands = {"Сидеть", "Лежать"};
        Shelter shelter = new Shelter("GAV", "Kant-12");
        Dog dog = new Dog("Volt", "Ovcharka", commands, shelter, ColorEnum.BLACK);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув гув");

        String[] commands1 = {"Сидеть", "Лежать"};
        Shelter shelter1 = new Shelter("GAV", "Kant-12");
        Dog dog1 = new Dog("Scooby", "Russian", commands, shelter1, ColorEnum.BLACK);
        System.out.println(dog1.getInfo());
        dog1.makeVoice();
        dog1.makeVoice("Вув вув");

        String[] commands2 = {"Сидеть", "Лежать"};
        Shelter shelter2 = new Shelter("GAV", "Kant-12");
        Dog dog2 = new Dog("Gufi", "Alabay", commands2, shelter2, ColorEnum.BLACK);
        System.out.println(dog2.getInfo());
        dog2.makeVoice();
        dog2.makeVoice("Ррра Рраа");
    }
}
