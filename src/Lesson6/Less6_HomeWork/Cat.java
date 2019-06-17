package Lesson6.Less6_HomeWork;

public class Cat extends Animal {

    // поля присущие котикам
    private String name;
    private int runDistance;
    private double jumpHeight;


    // константы:
    // указывают лимиты прыжка и бега согласно п.№3 задания

    static int CAT_RUN_DISTANCE = 200;
    static int CAT_JUMP_HEIGHT = 2;


    // конструктор специально для котиков, в параметры передаются пределы значений бега и прыжков,
    // ведь котики не все стройные и резвые, есть и батончики, но они все равно милые козявыши!

    public Cat(int runDistance, double jumpHeight, String name) {
        super(runDistance, jumpHeight, name);
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }


    // геттеры и сеттеры:
    // в сеттерах задана проверка на галавные условия для классов котиков и собак: дистанции прыжком и бега

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRunDistance() {

        return runDistance;
    }

    // проверка дистанции бега (дублируется в методе run согласно п. 4 задания)

    // сеттер не отрабатывает, когда вводятся данные при создании экземпляра класса
    public void setRunDistance(int runDistance) {
        if(runDistance <= CAT_RUN_DISTANCE) {
            this.runDistance = runDistance;
        } else {
            System.out.println("Величина дистанции в " + runDistance + "м слишком велика для всех котиков");
        }
    }

    public double getJumpHeight() {

        return jumpHeight;
    }

    // проверка высоты прыжка на этапе ввода параметров полей при создании объекта
    // не работает!!!!! :(((

    public void setJumpHeight(double jumpHeight) {
        if (jumpHeight > CAT_JUMP_HEIGHT) {
            this.jumpHeight = jumpHeight;
        } else {
            System.out.println("Высота прыжка величиной в " + jumpHeight + "м слишком велика для всех котиков");
        }
    }


    // методы / действия:

    // проверка выполнения условия предела бега, который будет задан при создании экземпляра класса котиков
    // проверка включена в метод согласно п. №4 задания

    @Override
    public void run(int run) {

        if(run >= 0 && run > getRunDistance() && getRunDistance() <= CAT_RUN_DISTANCE) {
            System.out.println("Дистанция " + run + " м слишком велика для этого котика");
            System.out.println("Котик " + getName() + " с трудом пробежал только " + getRunDistance() + " м");
            // эту часть надо поменять местами с
        } else if (run >= 0 && run > CAT_RUN_DISTANCE) {
            System.out.println("Величина дистанции в " + run + " м слишком велика для всех котиков");
            System.out.println("Котик " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else if (run >= 0 && run > getRunDistance() && run <= CAT_RUN_DISTANCE) {
            System.out.println("Величина дистанции в " + run + " м слишком велика для всех котиков");
            System.out.println("Котик " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else {
            System.out.println("Котик " + getName() + " успешно пробежал " + run + " м");
        }
    }

    @Override
    public void jump(double jump) {

        if (jump >= 0 && jump > getRunDistance() && getRunDistance() <= CAT_JUMP_HEIGHT) {
            System.out.println("Высота " + jump + " м слишком велика для этого котика");
            System.out.println("Котик " + getName() + " с трудом пробежал только " + getJumpHeight() + " м");

        } else if (jump >= 0 && jump > CAT_JUMP_HEIGHT && jump > getJumpHeight()){
            System.out.println("Высота " + jump + " м слишком велика для для всех котиков");
            System.out.println("Котик " + getName() + " изловчился прыгнуть только на " + getJumpHeight() + " м");

        } else if (jump >= 0 && jump > getJumpHeight() && jump <= CAT_JUMP_HEIGHT){
            System.out.println("Высота " + jump + " м слишком велика для для всех котиков");
            System.out.println("Котик " + getName() + " изловчился прыгнуть только на " + getJumpHeight() + " м");

        } else {
            System.out.println("Котик " + getName() + " успешно прыгнул на " + jump + " м");
        }
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
    }
}
