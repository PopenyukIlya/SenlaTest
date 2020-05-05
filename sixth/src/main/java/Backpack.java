import java.util.ArrayList;

public class Backpack {
    int carryingСapacity;
    int cargoValue;
    ArrayList<Thing> listOfThings;

    public Backpack(int carryingСapacity, int cargoValue, ArrayList<Thing> listOfThings) {
        this.carryingСapacity = carryingСapacity;
        this.cargoValue = cargoValue;
        this.listOfThings = listOfThings;
    }

    public int getCarryingСapacity() {
        return carryingСapacity;
    }

    public void setCarryingСapacity(int carryingСapacity) {
        this.carryingСapacity = carryingСapacity;
    }

    public int getCargoValue() {
        return cargoValue;
    }

    public void setCargoValue(int cargoValue) {
        this.cargoValue = cargoValue;
    }

    public ArrayList<Thing> getListOfThings() {
        return listOfThings;
    }

    public void setListOfThings(ArrayList<Thing> listOfThings) {
        this.listOfThings = listOfThings;
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "carryingСapacity=" + carryingСapacity +
                ", cargoValue=" + cargoValue +
                ", listOfThings=" + listOfThings +
                '}';
    }
}
