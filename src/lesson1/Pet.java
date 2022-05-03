package lesson1;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum colorEnum;
    private Shelter shelter;

    public int getAge() {
    return age;
    }

    public ColorEnum getColorEnum() {
    return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
    this.colorEnum = colorEnum;
    }

    public Shelter getShelter() {
    return shelter;
    }

    public void setShelter(Shelter shelter) {
    this.shelter = shelter;
    }

    private int generateDefaultAge() {
    return new Random().nextInt(10) + 1;
    }

    @Override
    public String toString() {
    return "{" +
            "age=" + age +
            ", color=" + colorEnum +
            ", shelter=" + shelter.getName() + ", address=" + shelter.getAddress() +
            '}';
    }
}

