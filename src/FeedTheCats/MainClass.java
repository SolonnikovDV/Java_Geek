package FeedTheCats;

public class MainClass {

    public static void main(String[] args) {


        Cat Barsik  = new Cat("Barsik", 400);
//        Cat Persik  = new Cat("Персик", 300);
//        Cat Richik  = new Cat("Ричик", 500);
        Plate plate = new Plate(300);

        plate.info();

        Barsik.needToEat(plate);
//        Barsik.hungerInfo();
//
//        Persik.needToEat(plate);
////        Persik.hungerInfo();
//
//        Richik.needToEat(plate);
////        Richik.hungerInfo();

        plate.info();
    }

}
