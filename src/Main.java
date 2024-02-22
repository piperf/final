import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //stuff i need:
        //arraylist of items to craft, gen random num from 0-size
        //mypanel class? graphics scared emoji
        //bro i forgor
        //honesly a separate class just of the items
        //could i make the actual crafting menu a 2d array of items? and like display it?
        //give each item xy coords, use mouse listener to detect if im clicking on one of them
        //can mouse listener detect dragging and dropping? gonnna findo ut
        //do a thing where if the xy coords are within a box they go exactly in the middle of it, if not in any box they go back to inventory, if between boxes it goes to closest one or soemtime..?


        JFrame frame= new JFrame();
        frame.setSize(500,500);
        MyPanel panel=new MyPanel();
        frame.add(panel);
        frame.setVisible(true);

    }
}