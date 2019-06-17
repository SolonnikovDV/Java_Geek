package Lesson6.Less6_HomeWork;

public class Cat extends Animal {

    // константы:
    // указывают лимиты прыжка (верхний предел значение по классу) и бега согласно п.№3 задания

    static int CAT_RUN_DISTANCE = 200;
    static int CAT_JUMP_HEIGHT = 2;


    // конструктор

    public Cat(String name, int runDistance, double jumpHeight) {

        super(name, runDistance, jumpHeight);
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

        } else if(getRunDistance() > CAT_RUN_DISTANCE) {
            System.out.println("Дистанция бега величиной в " + getRunDistance() + "м слишком велика для котиков");
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

        if(jumpHeight > CAT_JUMP_HEIGHT){
            System.out.println("Введены параметры превышющие заданны лимит в " + CAT_JUMP_HEIGHT + " м");

        } else {
            this.setJumpHeight(jumpHeight);
        }
    }


    // методы / действия:

    // проверка вхлждения в лимиты класса и лимиты объекта при создании экземпляра класса котиков
    // проверка включена в метод согласно п. №4 задания


    @Override
    public void run(int run) {

        if (run < 0) {
            System.out.println("Введено отрицательное значение");

        } else if (run > CAT_RUN_DISTANCE) {
            System.out.println("Величина дистанции в " + run + " м слишком велика для всех котиков в мире");

        } else if (run > getRunDistance()) {
            System.out.println("Величина дистанции в " + run + " м слишком велика для этого котика");
            System.out.println("Котик " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else {
            System.out.println("Котик " + getName() + " успешно пробежал " + run + " м");
        }
    }


    @Override
    public void jump(double jump) {

        if (jump < 0) {
            System.out.println("Введено отрицательное значение");

        } else if (jump > CAT_JUMP_HEIGHT){
            System.out.println("Высота " + jump + " м слишком велика для для всех котиков");

        } else if (jump > getJumpHeight()){
            System.out.println("Высота " + jump + " м слишком велика для для этого котика");
            System.out.println("Котик " + getName() + " изловчился прыгнуть только на " + getJumpHeight() + " м");

        } else {
            System.out.println("Котик " + getName() + " успешно прыгнул на " + jump + " м");
        }
    }


    // исключение для класса котиков
    @Override
    public void swim(int swim) {

        System.out.println("Любой допропорядочный гражданин наверняка знает, что котикам непристало плавать по указу!");
    }


    @Override
    public void animalInfo() {

        super.animalInfo();
    }

}
