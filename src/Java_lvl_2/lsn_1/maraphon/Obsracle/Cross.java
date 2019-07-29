package Java_lvl_2.lsn_1.maraphon.Obsracle;

import Java_lvl_2.lsn_1.maraphon.competitors.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross() {

        this.length = (int) (Math.random() * 5501) + 500;
    }

    @Override
    public String doIt(Competitor competitor) {
        competitor.run(length);
        return null;
    }

    // проверка
    public static void main(String[] args) {

        System.out.println( (new Cross().length));

    }

}
