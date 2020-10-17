package display;

import shape.Shape;
import style.StyleScreen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ScreenDisplay extends JPanel {

    private ArrayList<Shape> shapeList;

    public ScreenDisplay() {
        this.shapeList = new ArrayList<>();

        //=================================
        //             SET STYLE
        //=================================

        this.setBackground(StyleScreen.BACKGROUND);

    }

    public void addShape(Shape shape){
        this.shapeList.add(shape);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        for(Shape shape : shapeList){
            shape.render(g2);
        }


    }
}
