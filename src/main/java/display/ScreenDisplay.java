package display;

import render.LightRender;
import shape.Shape;
import style.StyleScreen;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ScreenDisplay extends JPanel {

    private ArrayList<Shape> shapeList;
    private ArrayList<LightRender> lightPoints;

    public ScreenDisplay() {
        this.shapeList = new ArrayList<>();
        this.lightPoints = new ArrayList<>();

        //=================================
        //             SET STYLE
        //=================================

        this.setBackground(StyleScreen.BACKGROUND);

        new Thread(){
            @Override
            public void run() {
                super.run();
                for(;;)
                repaint();
            }
        }.start();

    }

    public void addShape(Shape shape){
        this.shapeList.add(shape);
    }

    public void addLigthPoint(LightRender ligthPoint){
        this.lightPoints.add(ligthPoint);
    }

    public ArrayList<Shape> getShapeList() {
        return shapeList;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;


        for (LightRender lr : lightPoints) {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();

            lr.update(x, y);
            lr.render(g2);
        }


        for (Shape shape : shapeList) {
            shape.render(g2);
            shape.moving();
        }





    }
}
