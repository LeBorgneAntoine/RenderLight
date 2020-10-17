package display;

import shape.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class screenDisplay extends JPanel {

    ArrayList<Shape> shapeList;

    public screenDisplay() {
        this.shapeList = new ArrayList<Shape>();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;





    }
}
