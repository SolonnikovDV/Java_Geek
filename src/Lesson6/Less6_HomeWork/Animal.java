package Lesson6.Less6_HomeWork;

import java.text.MessageFormat;

/**
 *
 * Java. Level 1. Lesson 6. Homework doing. Exc #1
 *
 * @autor @Dmitriy Solonnikov
 * @version dated Jun-14-2019
 *
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 *
 * 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу
 * передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
 *
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
 * плавание: кот не умеет плавать, собака 10 м.).
 *
 * 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
 * (Например, dog1.run(150); -> результат: run: true)
 *
 * 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
 */

public class Animal {
    private String name;
    private int runDistance;
    private int swimDistance;
    private double jumpHeight;


    // конструкторы

    // это ну совсем общий конструктор, в данном случае не нужен
//    public Animal(int runDistance, double jumpHeight, String name) {
//        this.name = name;
//        this.runDistance = runDistance;
//        this.swimDistance = swimDistance;
//        this.jumpHeight = jumpHeight;
//    }

    // конструктор для наследников, которые умеют бегать, прыгать, плавать
    public Animal(int runDistance, int swimDistance, double jumpHeight, String name) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }

    // конструктор для наследников, которые умеют бегать, прыгать, но не могут или отказыватся плавать
    public Animal(int runDistance, double jumpHeight, String name) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setSwimDistance(int swimDistance) {
        this.swimDistance = swimDistance;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public String getName() {

        return name;
    }

    public int getRunDistance() {

        return runDistance;
    }

    public int getSwimDistance() {

        return swimDistance;
    }

    public double getJumpHeight() {

        return jumpHeight;
    }


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
