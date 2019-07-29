package Java_lvl_2.lsn_1.maraphon.Obsracle;

import Java_lvl_2.lsn_1.maraphon.competitors.Competitor;


public class Wall extends Obstacle {

    double height;

    public Wall() {

        this.height = (Math.random() * 4) + 0.5;
    }

    @Override
    public String doIt(Competitor competitor) {
        competitor.jump(height);
        return null;
    }

    // проверка
    public static void main(String[] args) {

        System.out.println( (new Wall().height));

    }

}
