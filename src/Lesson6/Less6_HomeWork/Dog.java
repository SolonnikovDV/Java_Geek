package Lesson6.Less6_HomeWork;

public class Dog extends Animal{

    // константы:
    // указывают лимиты прыжка и бега согласно п.№3 задания

    static int DOG_RUN_DISTANCE = 500;
    static int DOG_SWIM_DISTANCE = 10;
    static double DOG_JUMP_HEIGHT = 0.5;

    // поля присущие собакам
    private String name;
    private int runDistance;
    private int swimDistance;
    private double jumpHeight;

    // конструктор специально для собак (один из конструкторов унаследованный от от Animal)

    public Dog(int runDistance, int swimDistance, double jumpHeight, String name) {
        super(runDistance, swimDistance, jumpHeight, name);
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }


    // геттеры и сеттеры:
    // в сеттерах задана проверка на галавные условия для классов котиков и собак: дистанции прыжком и бега;
    // и отдельно дистанция плавания для класса собак

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

    public void setRunDistance(int runDistance) {
        if(runDistance <= DOG_RUN_DISTANCE) {
            this.runDistance = runDistance;
        }
        System.out.println("Дистанция бега величиной в " + runDistance + "м слишком велика для собак");
    }

    public double getJumpHeight() {

        return jumpHeight;
    }

    // проверка высоты прыжка (дублируется в методе run согласно п. 4 задания)

    public void setJumpHeight(double jumpHeight) {
        if(jumpHeight <= DOG_JUMP_HEIGHT){
            this.jumpHeight = jumpHeight;
        }
        System.out.println("Высота прыжка величиной в " + jumpHeight + "м слишком велика для всех собак");
    }

    public int getSwimDistance() {

        return runDistance;
    }

    // проверка дистанции плавания (дублируется в методе run согласно п. 4 задания)

    public void setSwimDistance(int swimDistance) {
        if(swimDistance <= DOG_SWIM_DISTANCE) {
            this.swimDistance = swimDistance;
        }
        System.out.println("Дистанция плавания величиной в " + swimDistance + "м слишком велика для всех собак");
    }


    // методы / действия (переопределены из родительского класса Animal:

    // проверка выполнения условия предела бега, который будет задан при создании экземпляра класса котиков
    // проверка включена в метод согласно п. №4 задания

    @Override
    public void run(int run) {

        if(run >= 0 && run > getRunDistance() && getRunDistance() <= DOG_RUN_DISTANCE) {
            System.out.println("Дистанция бега " + run + " м слишком велика для этой собаки");
            System.out.println("Собака " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else if (run >= 0 && run > DOG_RUN_DISTANCE) {
            System.out.println("Дистанция бега в " + run + " м слишком велика для всех собак");
            System.out.println("Собака " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else if (run >= 0 && run > getRunDistance() && run <= DOG_RUN_DISTANCE) {
            System.out.println("Дистанция бега в " + run + " м слишком велика для всех собак");
            System.out.println("Собака " + getName() + " с трудом пробежал только " + getRunDistance() + " м");

        } else {
            System.out.println("Собака " + getName() + " успешно пробежал " + run + " м");
        }
    }

    @Override
    public void jump(double jump) {

        if (jump >= 0 && jump > getJumpHeight() && getJumpHeight() <= DOG_JUMP_HEIGHT) {
            System.out.println("Высота прыжка " + jump + " м слишком велика для этой собаки");
            System.out.println("Собака " + getName() + " с трудом пробежал только " + getJumpHeight() + " м");

        } else if (jump >= 0 && jump > DOG_JUMP_HEIGHT){
            System.out.println("Высота прыжка " + jump + " м слишком велика для для всех собак");
            System.out.println("Собака " + getName() + " изловчился прыгнуть только на " + getJumpHeight() + " м");

        } else if (jump >= 0 && jump > getJumpHeight() && jump <= DOG_JUMP_HEIGHT){
            System.out.println("Высота прыжка " + jump + " м слишком велика для для всех собак");
            System.out.println("Собака " + getName() + " изловчился прыгнуть только на " + getJumpHeight() + " м");

        } else {
            System.out.println("Собака " + getName() + " успешно прыгнул на " + jump + " м");
        }
    }

    @Override
    public void swim(int swim) {

        if (swim >= 0 && swim > getSwimDistance() && getSwimDistance() <= DOG_SWIM_DISTANCE) {
            System.out.println("Дистанция плавания в " + swim + " м слишком велика для этой собаки");
            System.out.println("Собака " + getName() + " с трудом проплыла только " + getSwimDistance() + " м");

        } else if (swim >= 0 && swim > DOG_SWIM_DISTANCE){
            System.out.println("Дистанция плавания в " + swim + " м слишком велика для для всех собак");
            System.out.println("Собака " + getName() + " с трудом проплыла только на " + getSwimDistance() + " м");

        } else if (swim >= 0 && swim > getSwimDistance() && swim <= DOG_SWIM_DISTANCE){
            System.out.println("Дистанция плавания в " + swim + " м слишком велика для для всех собак");
            System.out.println("Собака " + getName() + " с трудом проплыла только на " + getSwimDistance() + " м");

        } else {
            System.out.println("Собака " + getName() + " успешно проплыла на " + swim + " м");
        }
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
    }
}
