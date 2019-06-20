package FeedTheCats;

import java.util.Arrays;

/**
 * * Java. Level 1. Lesson 7. Homework doing.
 *  *
 *  * @autor @Dmitriy Solonnikov
 *  * @version dated Jun-21-2019
 *
 * Расширить задачу про котов и тарелки с едой.
 * Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 * Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
 * Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 * Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 * Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

public class MainClass {

    public static void main(String[] args) {


//        Cat Barsik  = new Cat("Barsik", 400);
//        Cat Persik  = new Cat("Персик", 300);
//        Cat Richik  = new Cat("Ричик", 500);
        Plate plate = new Plate(70);
//
//        plate.info();
//
//        Barsik.needToEat(plate);
//        Barsik.hungerInfo();
//
//        Persik.needToEat(plate);
////        Persik.hungerInfo();
//
//        Richik.needToEat(plate);
////        Richik.hungerInfo();

        plate.info();

        Cat [] cats = new Cat[2];
        cats[0] = new Cat("Barsik", 50);
        cats[1] = new Cat("Murzik", 30);
//        cats[2] = new Cat("Fluffy", 15);
//        cats[3] = new Cat("Sly", 45);
//        cats[3] = new Cat("Woolly Bully", 80);

        for (int i = 0; i < cats.length; i++) {

                cats[i].needToEat(plate);
                plate.info();
                System.out.println();

//            cats[i].hungerInfo(cats[i].getHunger());



            // ВЫЗОВ ГРАФИЧЕСКОГО ИНТЕРФЕЙСА


        }


    }

}
