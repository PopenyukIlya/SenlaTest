import java.util.ArrayList;
import java.util.Random;

public class Controller {

    Backpack bestBackpack=new Backpack(0,0,null);
    public void start(){
        ArrayList<Thing> listOfThings = new ArrayList<Thing>();
        listOfThings.add(new Thing("wallet",1,150));
        listOfThings.add(new Thing("water",2,2));
        listOfThings.add(new Thing("sandwich",1,5));
        listOfThings.add(new Thing("watch",1,150));
        listOfThings.add(new Thing("cap",1,15));
        listOfThings.add(new Thing("chain",1,200));
        listOfThings.add(new Thing("lighter",1,20));
        listOfThings.add(new Thing("glasses",1,150));
        listOfThings.add(new Thing("powerbank",1,20));
        listOfThings.add(new Thing("jacket",1,150));
        listOfThings.add(new Thing("boots",2,100));
        listOfThings.add(new Thing("cup",1,200));
        listOfThings.add(new Thing("laptop",3,2000));
        listOfThings.add(new Thing("phone",1,200));
        listOfThings.add(new Thing("radio",1,20));
        listOfThings.add(new Thing("helmet",3,150));
       choose(listOfThings);


    }//заново лист вещей пустая сумка
    public void choose( ArrayList<Thing> listOfThings) {
        Random random = new Random();
        ArrayList<Thing> backpackListOfThings = new ArrayList<Thing>();
        backpackListOfThings.clear();
        Backpack backpack=new Backpack(0,0,null);
        while (backpack.getCarryingСapacity()<10){
          int index=random.nextInt(listOfThings.size());
          Thing thing=listOfThings.get(index);
       backpack.cargoValue+=thing.getPrice();
       backpack.carryingСapacity+= thing.getWeight();
       backpackListOfThings.add(thing);
       listOfThings.remove(index);
        }if (backpack.carryingСapacity>10){start();}else {
        backpack.setListOfThings(backpackListOfThings);
        bestBackpack(backpack);}
    }

    public void bestBackpack(Backpack someBackpack){
        if (bestBackpack.getCargoValue()<someBackpack.getCargoValue()){
            bestBackpack=someBackpack;
            bestBackpack.setCarryingСapacity(someBackpack.getCarryingСapacity());
            bestBackpack.setCargoValue(someBackpack.getCargoValue());
            bestBackpack.setListOfThings(someBackpack.getListOfThings());
        }

    }


}
