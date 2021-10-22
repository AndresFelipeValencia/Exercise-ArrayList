import java.util.List;

public class Car {

    int numDoor;
    String colors;
    String brands;

    public Car(int numDoor, String colors, String brands) {
        this.numDoor = numDoor;
        this.colors = colors;
        this.brands = brands;
    }

    public int getNumDoor(){
        return numDoor;
    }
    public void setNumDoor(int numDoor){
        this.numDoor = numDoor;
    }
    public String getColors(){
        return colors;
    }
    public void setColors(String colors){
        this.colors = colors;
    }
    public String getBrands(){
        return brands;
    }
    public void setBrand(String brands){
        this.brands = brands;
    }

}
