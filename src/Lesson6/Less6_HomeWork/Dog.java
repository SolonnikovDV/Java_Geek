package Lesson6.Less6_HomeWork;

public class Dog extends Animal{

    // константы:
    // указывают лимиты прыжка (верхний предел значение по классу) и бега согласно п.№3 задания

    static int DOG_RUN_DISTANCE = 500;
    static int DOG_SWIM_DISTANCE = 10;
    static double DOG_JUMP_HEIGHT = 0.5;


    // конструктор

    public Dog(String name, int runDistance, double jumpHeight, int swimDistance) {

        super(name, runDistance, jumpHeight, swimDistance);
    }


    // геттеры и сеттеры:
    // переопределенные геттеры


    @Override
    public String getName() {

        return super.getName();
    }


    @Override
    public void setName(String name) {

        super.setName(name);
    }


    // проверка не работает геттера на отрицательное значение и превышение лимита не раотает!!!
    @Override
    public void setRunDistance(int runDistance) {

        if (getRunDistance() < 0){
            System.out.println("Введено отрицательное значение дистанции бега");

        } else if(getRunDistance() > DOG_RUN_DISTANCE) {
            System.out.println("Дистанция бега величиной в " + getRunDistance() + " м слишком велика для собак");
        }

        super.setRunDistance(runDistance);
    }


    @Override
    public double getJumpHeight() {
        return super.getJumpHeight();
    }


    // проверка не работает геттера на отрицательное значение и превышение лимита не раотает!!!
    @Override
    public void setJumpHeight(double jumpHeight) {

        if (getRunDistance() < 0) {
            System.out.println("Введено отрицательное значение высоты прыжка");

        } else if (getRunDistance() > DOG_JUMP_HEIGHT) {
            System.out.println("Высота прыжка величиной в " + getRunDistance() + " м слишком велика для собак");
        }

        this.setJumpHeight(jumpHeight);
    }


    @Override
    public int getSwimDistance () {

        return super.getSwimDistance();
    }


    // проверка не работает геттера на отрицательное значение и превышение лимита не раотает!!!
    @Override
    public void setSwimDistance(int swimDistance) {

        if (getSwimDistance() < 0) {
            System.out.println("Введено отрицательное значение дистанции плавания");

        } else if (getSwimDistance() > DOG_JUMP_HEIGHT) {
            System.out.println("Дистанция плавания величиной в " + getSwimDistance() + " м слишком велика для собак");
        }

        this.setSwimDistance(swimDistance);
    }


    // методы / действия (переопределены из родительского класса Animal:

    // проверка вхлждения в лимиты класса и лимиты объекта при создании экземпляра класса котиков
    // проверка включена в метод согласно п. №4 задания


    @Override
    public void run(int run) {

        if (run < 0) {
            System.out.println("Введено отрицательное значение");

        } else if (run > DOG_RUN_DISTANCE) {
            System.out.println("Величина дистанции в " + run + " м слишком велика для всех собак в мире");

        } else if (run > getRunDistance()) {
            System.out.println("Величина дистанции в " + run + " м слишком велика для этой собаки");
            System.out.println("Собака " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else {
            System.out.println("Собака " + getName() + " успешно пробежал " + run + " м");
        }
    }


    @Override
    public void jump(double jump) {

        if (jump < 0) {
            System.out.println("Введено отрицательное значение");

        } else if (jump > DOG_JUMP_HEIGHT){
            System.out.println("Высота " + jump + " м слишком велика для для всех собак в мире");

        } else if (jump > getJumpHeight()){
            System.out.println("Высота " + jump + " м слишком велика для для этого котика");
            System.out.println("Собака " + getName() + " изловчился прыгнуть только на " + getJumpHeight() + " м");

        } else {
            System.out.println("Собака " + getName() + " успешно прыгнул на " + jump + " м");
        }
    }


    @Override
    public void swim(int swim) {

        if (swim < 0) {
            System.out.println("Введено отрицательное значение");

        } else if (swim > DOG_SWIM_DISTANCE) {
            System.out.println("Величина дистанции в " + swim + " м слишком велика для всех собак в мире");

        } else if (swim > getSwimDistance()) {
            System.out.println("Величина дистанции в " + swim + " м слишком велика для этой собаки");
            System.out.println("Собака " + getName() + " с трудом пробежал только " + getSwimDistance() + " м");

        } else {
            System.out.println("Собака " + getName() + " успешно пробежал " + swim + " м");
        }
    }


    @Override
    public void animalInfo() {

        super.animalInfo();
    }

}
