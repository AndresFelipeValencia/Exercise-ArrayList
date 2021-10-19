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

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getColor() {
        return color;
    }

    public String getCar() {
        return car;
    }
}
