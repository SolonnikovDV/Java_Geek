package FeedTheCats;

public class Cat {

        private String name;
        private int appetite;
        boolean hunger;


    public boolean getHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
            // кот появляется сразу голодный
            this.hunger = false;

        }


    public void needToEat (Plate plate) {    // в метод передается обеъкт класс Plate

        if (plate.decreaseFood(appetite)) {
            hunger = true;

        } else {
            System.out.println("For " + name + " not enough food in a plate.");
            System.out.println("The cat " + name + " is steel hungry!!");
            plate.addFoodInPlate(appetite);
        }

        System.out.println("The cat " + name + " have eat " + appetite + " ui of food.\n" + name + " feels good now ^_^");

    }

}
