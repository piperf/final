import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Item {

    ArrayList<Item> items=new ArrayList<Item>();

    private String name;

    //ImageIcon icon = new ImageIcon("Images/MyCards/2C.png");
    private ImageIcon icon;

    public Item(String name, ImageIcon file) {
        this.name=name;
        this.icon=icon;
    }

    //store all the items in here by name
    //brute force enter all the items. We'll limit to just oak, spruce, stone, cobble, iron, redstone, coal, dia, etc just basic stuff
}
