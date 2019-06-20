package FeedTheCats;

import java.util.Scanner;

public class Plate {

        private int food;


        public Plate(int food) {

            this.food = food;
        }


        public void info() {

            System.out.println("In a plate " + food + " ui of food");
        }


        public boolean decreaseFood(int appetite) {
            if(food < appetite){
                return false;
            }else{
                food -= appetite;
                return true;
            }
        }

        public boolean addFoodInPlate (int appetite){
            Scanner scanner = new Scanner(System.in);
            int addFood;
            while (food < appetite){
                System.out.print("You should to add " + (appetite - food) + " ui in a plate: ");
                addFood = scanner.nextInt();
                food += addFood;
            }
            food -= appetite;
            return true;
        }
}
