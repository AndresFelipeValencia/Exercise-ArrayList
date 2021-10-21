import jdk.internal.cmm.SystemResourcePressureImpl;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {

    private String name;
    private Integer age;
    private List<String> colors;
    private List<String> cars;


    public User(String name, Integer age, List<String> colors, List<String> cars) {
        this.name = name;
        this.age = age;
        this.colors = colors;
        this.cars = cars;

    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
            this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public List<String> getColors()
    {
        return colors;
    }
    public void setColors(List<String> colors)
    {
        this.colors = colors;
    }
    public List<String> getCars()
    {
        return cars;
    }
    public void setCars(List<String> cars)
    {
        this.cars = cars;
    }

}

