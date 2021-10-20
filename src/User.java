import jdk.internal.cmm.SystemResourcePressureImpl;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class User {

        private final String name;
        private final int age;
        private final String color;
        private final String car;


    public User(String name, int age, String color, String car) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.car = car;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getCar() {
        return car;
    }

    public static void colorUser(){
        List<String> isColor = new ArrayList<>();
        isColor.add("Black");
        isColor.add("White");
        isColor.add("Yellow");
        isColor.add("Red");

        List<String> colorCar = new ArrayList<>(isColor);

        List<String> isCar = new ArrayList<>();
        isCar.add("BMW");
        isCar.add("BENZ");
        isCar.add("MAZDA");
        isCar.add("TOYOTA");

        colorCar.addAll(isCar);

        System.out.println(colorCar);

    }


}
