package Java_lvl_2.lsn_1.maraphon.competitors;



public class Human implements Competitor {

    String name;

    int maxRunDistance;
    double maxJumpHeight;
    int maxSwimDistance;

    boolean active;

    public Human( String name) {
        this.name = name;
        this.maxRunDistance = (int) (Math.random() * 5001) + 1000;
        this.maxJumpHeight = (double) (Math.random() * 3) + 1;
        this.maxSwimDistance = (int) (Math.random() * 301) + 25;
        this.active = true;
    }


    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " successfully run the distance");
        } else {
            System.out.println(name + " couldn't run the distance");
            active = false;
        }
    }


    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " successfully jumped");
        } else {
            System.out.println(name + " couldn't jump");
            active = false;
        }
    }


    @Override
    public void swim(int dist) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " cant swim");
            active = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.println(name + " successfully swam the distance");
        } else {
            System.out.println(name + " couldn't swim");
            active = false;
        }
    }

    @Override
    public boolean isDistance() {

        return active;
    }


    @Override
    public void info() {
        System.out.println(name + " keep on distance ");

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    // проверка рандомных значений
    public static void main(String[] args) {

        Human human = new Human("Tester");

        System.out.println(human.maxRunDistance);
        System.out.println(human.maxJumpHeight);
        System.out.println(human.maxSwimDistance);
    }

}