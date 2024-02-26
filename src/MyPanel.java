
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {

    public MyPanel () {
        this.setBackground(new Color(136, 208, 248));

    }

    @Override
    public void paintComponent (Graphics g) {
        super.paintComponent(g);
        System.out.println("hi");
//

//        g.drawRect(40,90,160,160);
        //crafting
        for (int i=105, s=0; s<3; i+=40, s++) {
            for (int j=110, c=0; c<3; j+=40, c++) {
                g.drawRect(i,j,40,40);

            }
        }

        //output
        g.drawRect(345, 150, 40,40);

        //inventory
        for (int i=65, s=0; s<9; i+=40, s++) {
            for (int j=290, c=0; c<3; j+=40, c++) {
                g.drawRect(i,j,40,40);
            }

        }

        }



}
