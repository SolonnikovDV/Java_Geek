package Java_lvl_2.lsn_1.maraphon.competitors;

import Java_lvl_2.lsn_1.maraphon.Obsracle.Cross;
import Java_lvl_2.lsn_1.maraphon.Obsracle.Obstacle;
import Java_lvl_2.lsn_1.maraphon.Obsracle.Wall;
import Java_lvl_2.lsn_1.maraphon.Obsracle.Water;

import java.util.ArrayList;

/**
 * Java. Level 2. Lesson 1. Homework doing.
 *
 * @autor @Dmitry Solonnikov
 * @version dated Jul-29-2019
 */

/**
 * 2. Добавить класс Team, который будет содержать: название команды, массив из 4-х участников
 * (т.е. в конструкторе можно сразу всех участников указывать), метод для вывода информации о
 * членах команды прошедших дистанцию, метод вывода информации обо всех членах команды.
 */

// задача по созданию класса Team и Course реализована через вложенные (внутренние) классы

public class Team {


    String teamName;
    Competitor[] competitors;
    ArrayList<Competitor> teamInfoNotPass;
    ArrayList<Competitor> teamInfoIsPass;

    // конструктор, в котором задаем имя команды, членов команды и способ вывода результатов
    Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
        this.teamInfoNotPass = new ArrayList<Competitor>();
        this.teamInfoIsPass = new ArrayList<Competitor>();
    }


    // метод выводит список участников непрошедших дистанцию и прошедшх отдельно
    void showResults(Team team) {

//        Competitor[] competitors = team.competitors;

        // в этой конструкции элементы ArrayList выводятся в виде Human{name ...},
        // победить это никак не получается
        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i] != null && competitors[i].isDistance() == false) {
                teamInfoNotPass.add(competitors[i]);
            }
        }

        // проверяем, если в массиве есть элементы удовлетворящие условию выше,
        // то значит есть участники не прошедшие дистанцию и информация о них выводится в консоль
        if (teamInfoNotPass.size() > 0) {
            System.out.println("-------------------------------");
            System.out.println("Not pass the distance: ");
            teamInfoNotPass.forEach(System.out::println);
        }


        for (int i = 0; i < competitors.length; i++) {
            if (competitors[i] != null && competitors[i].isDistance() == true) {
                teamInfoIsPass.add(competitors[i]);
            }
        }

        // проверяем, если в массиве есть элементы удовлетворящие условию выше,
        // то значит есть участники, которые справились с дистанцией, информация о них выводится в консоль
        if (teamInfoIsPass.size() > 0) {
            System.out.println("-------------------------------");
            System.out.println("Is pass the distance: ");
            teamInfoIsPass.forEach(System.out::println);
        }

    }


        /**
         * 3. Добавить класс Course (полоса препятствий), в котором будут находиться:
         * массив препятствий, метод который будет просить команду пройти всю полосу;
         */


        public static class Course {

            Obstacle[] obstacles;

            // конструктор, в который передаем перечень препятствий
            Course(Obstacle... obstacles) {

                this.obstacles = obstacles;
            }


            // метод проводит каждого участника через каждое препятствие (foreach),
            // если препятствие оказывается неприодолимым, то выводится результат по каждому участнику (прогресс)
            // и информация об успешных участниках

            void startDist(Team team) {

                Competitor[] competitors = team.competitors;

                // выводит для каждого уастника статус и прервывется на неудачно попытке преодолеть препятствие
                for (Competitor c : competitors) {
                    for (Obstacle o : obstacles) {
                        o.doIt(c);
                        if (!c.isDistance()) {
                            break;
                        }
                    }

                }
            // выводим участников, успешно прошедших всю дистанцию
            team.showResults(team);
            }

        }


        public static void main (String[]args){

            // создаются препятствия с рандомными значениями
            Course courses = new Course(new Cross(), new Water(), new Wall());

            // содание участников, в задумке все участники являются человеками,
            // все характеристики рандомные
            Team dreamTeam = new Team("Avengers",
                    new Human("Iron Man"),
                    new Human("Hulk"),
                    new Human("SpiderMan"),
                    new Human("Alcoholic Kolya")
            );

            // возвращает результат команды
            courses.startDist(dreamTeam);
        }

}