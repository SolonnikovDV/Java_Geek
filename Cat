package Lesson7_HW_Doing;

import java.text.MessageFormat;
import java.util.Scanner;

public class Cat {

    private String name;
    private int appetite;
    private boolean hunger;

//-----------------------------------------

    // конструктор
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = false;
    }

    //-----------------------------------------
//
    public String getName() {

        return name;
    }

    //
    public void setName(String name) {

        this.name = name;
    }

    //
    public int getAppetite() {
        return appetite;
    }

    //
    public void setAppetite(int appetite) {

        if (appetite < 0) {
            System.out.println("Wrong value");
        } else {
            this.appetite = appetite;
        }
    }

//
//-----------------------------------------

    // методы

    // в метод передается значение объекта Plate созданного в Main и объект класса Cat
    // для того, чтобы была возможность в методе обращаться к его параметрам, заданным при создании объета,
    // например getName()

    public boolean eat(Plate plate) {

        // сравнили требуемое кол-во пищи с имеющимся в тарелке количеством
        if (plate.getFood() < getAppetite() ) {
            return false;

        } else {
        // выполняется food -= appetite
            plate.decreaseFood(getAppetite() );
            System.out.println( "Cat " + getName() + " eat " + getAppetite() + " of food" );
            return true;
        }

    }

    // метод только для вывод текущей информации о действии метода eat()
    public void hungerInfo (Plate plate){

        if(eat(plate) == true ){
            System.out.println(MessageFormat.format(
                    "Cat {0} "
                            + "eat {1} "
                            + "of food. Now he's feeling good. \n",
                    getName(),  getAppetite()
                    ));


        } else {
            System.out.println(MessageFormat.format(
                    "Not enouth food for  {0} "
                            + "in the plate. Need to add {1} units "
                            + "of food in th plate. \n",
                    getName(), ( getAppetite() - plate.getFood() )
            ));
            plate.addFood(plate, getAppetite());
        }
    }


}
