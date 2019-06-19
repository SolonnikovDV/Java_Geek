package Lesson7_HW_Doing;

import java.util.Scanner;

public class Plate {

    private int food;

//-----------------------------------------

    // конструктор
    public Plate(int food) {

        this.food = food;
    }

//----------------------------------------

    public int getFood() {

        return food;
    }


    public void setFood(int food) {
        if (food <= 0) {
            System.out.println("Wrong value");
        }
        this.food = food;
    }

//-----------------------------------------

    //методы
    public boolean decreaseFood(int appetite) {
        if (getFood() < appetite) {
            return false;
        } else {
            food -= appetite;
            return true;
        }
    }

    // выводит текущее значение переменной food используется только на старте
    public void info() {
        System.out.println("Plate: " + getFood() + " of food.");

    }



    public boolean addFood (Plate plate, int appetite){

        while (food < appetite){
            addFoodMessage(appetite);
            int addFood = new Scanner(System.in).nextInt();
            food += addFood;
        }
        food -= appetite;
        return true;
    }

    // метод только выводит сообщение для пользователя о том какое значение ему вводить в консоль
    public void addFoodMessage (int appetite){
        System.out.println("You have to add a food " + (appetite - getFood()) + "in the plate. ");
    }

}
