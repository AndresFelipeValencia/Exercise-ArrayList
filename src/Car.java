public class Car {

    int numDoor;
    String color;
    String brand;

    public Car(int numDoor, String color, String brand) {
        this.numDoor = numDoor;
        this.color = color;
        this.brand = brand;
    }

    public int getNumDoor(){
        return numDoor;
    }
    public void setNumDoor(int numDoor){
        this.numDoor = numDoor;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

}
