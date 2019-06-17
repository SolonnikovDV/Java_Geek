package Lesson6.Less6_HomeWork;

import java.text.MessageFormat;

public class Animal {

    private String name;
    private int runDistance;
    private int swimDistance;
    private double jumpHeight;

//*************************************************************
    // конструкторы

    // конструктор для наследников, которые умеют бегать, прыгать, плавать
    public Animal(String name, int runDistance, double jumpHeight, int swimDistance) {

        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    // конструктор для наследников, которые умеют бегать, прыгать, но не могут или отказыватся плавать
    public Animal(String name, int runDistance, double jumpHeight) {

        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

 //*************************************************************
    // getters / setters

    public String getName() {

        return name;
    }


    public void setName(String name) {

        this.name = name;
    }


    public int getRunDistance() {

        return runDistance;
    }


// проверка дистанции бега (не работает)

    public void setRunDistance(int runDistance) {

        if (runDistance < 0){
            System.out.println("Введено отрицательное значение дистанции бега");
        }

        this.runDistance = runDistance;
    }


    public double getJumpHeight() {

        return jumpHeight;
    }


    // проверка высоты прыжка (дублируется в методе run согласно п. 4 задания)

    public void setJumpHeight(double jumpHeight) {

        if(jumpHeight < 0){
            System.out.println("Введено отрицательное значение высоты прыжка");
        }

        this.jumpHeight = jumpHeight;
    }


    public int getSwimDistance() {

        return runDistance;
    }

    // проверка дистанции плавания (дублируется в методе run согласно п. 4 задания)

    public void setSwimDistance(int swimDistance) {

        if (swimDistance < 0){
            System.out.println("Введено отрицательное значение дистанции плавания");
        }

        this.swimDistance = swimDistance;
    }

//*************************************************************
    // методы / действия
    // с проверкой на дистанции

    public void run (int run){

        if(run > getRunDistance()){
            System.out.println("Дистанция " + run + "м слишком велика для этого животного");
            System.out.println("Животное " + getName() + " с трудом пробежало только " + getRunDistance() + " м");

        } else {
            System.out.println("Животное " + getName() + " пробежало " + run + " м");
        }
    }

    public void swim (int swim){

        if (swim > getSwimDistance()){
            System.out.println("Высота " + swim + " м слишком велика для этого животного");
            System.out.println("Животное " + getName() + " изловчилось прыгнуть только на " + getSwimDistance() + " м");

        } else {
            System.out.println("Животное " + getName() + " проплыло " + swim + " м");
        }
    }

    public void jump (double jump){

        if (jump > getJumpHeight()){
            System.out.println("Высота " + jump + " м слишком велика для этого животного");
            System.out.println("Животное " + getName() + " изловчилось прыгнуть только на " + getJumpHeight() + " м");

        } else {
            System.out.println("Животное " + getName() + " успешно прыгнуло на " + jump + " м");
        }
    }

    public void animalInfo (){

        System.out.println(MessageFormat.format(
                "Создано животное по имени {0} \n" +
                        "Для этого {0} при создании задали следующие величины: \n"
                        + " - дистания бега {1} \n"
                        + " - дистанция плавания {2} \n"
                        + " - высота прыжка {3} \n",
                getName(), getRunDistance(), getSwimDistance(), getJumpHeight()

        ));
    }

}
