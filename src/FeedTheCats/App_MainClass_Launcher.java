package FeedTheCats;

import javax.swing.*;

public class App_MainClass_Launcher {
    public static void main(String[] args) {

//      Buttons

        JButton buttonStart = new JButton("Want to start?"); // add listener to start the app
        JButton buttonFinish = new JButton("Finish"); // add EXIT_ON_CLICK
        JButton buttonRepeat = new JButton("Want to repeat?"); // add listener to go back on stat of app
        JButton buttonConfirm = new JButton("Confirm"); // any confirm action

//      TextFields

        JTextField textName = new JTextField(); // only for name
        JTextField textValueObjects = new JTextField("Set the number of objects"); // number of cat to create
        JTextField textValueAppetite = new JTextField("Enter a value of appetite"); // here user will set a value of appetite for any cat
        JTextField textValueFood = new JTextField("Enter a value of appetite"); // start value of Plate or add food in a Plate

//      Panels

        JPanel panelOfCreateMenu = new JPanel(); // start panel
        JPanel panelAddJbjectMenu = new JPanel(); // on that panel added class objects
        JPanel panelOfPlate = new JPanel(); // on that panel user input param value of Plates object
        JPanel panelInfo = new JPanel(); // here showing info about status of Cats objects
        JPanel paneAddFoodMenu = new JPanel(); // here we'll se status of not satisfied Cats objects, here user add food in plate
        JPanel paneExit = new JPanel(); // Text label "Congratulatios!" and two buttons "End" "Repeat"

//      TextLabels

        JLabel lableOfCreateMenu = new JLabel("Imput a number of cats You want to create");
        JLabel lableAddJbjectMenu = new JLabel("Imput a value of name and appetite");
        JLabel lableSetFoodValue = new JLabel("Set value of food in a plate");
        JLabel lableAddFood = new JLabel("Add food in a plate");
        JLabel lableExit = new JLabel("Congratulatios!");

    }




}
