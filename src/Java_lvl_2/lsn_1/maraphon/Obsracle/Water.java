package Java_lvl_2.lsn_1.maraphon.Obsracle;

import Java_lvl_2.lsn_1.maraphon.competitors.Competitor;


public class Water extends Obstacle {

    int length;

    public Water() {

        this.length = (int) (Math.random() * 350) + 5;
    }

    @Override
    public String doIt(Competitor competitor) {

        competitor.swim(length);
        return null;
    }

    // проверка
    public static void main(String[] args) {

        System.out.println( (new Water().length));

    }

}
