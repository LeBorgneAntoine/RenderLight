package shape;

import java.awt.*;
import java.util.ArrayList;

import style.StyleScreen;
import util.*;

public abstract class Shape {

    public ArrayList<Vector> pointsList;

    public Shape(ArrayList<Vector> pointsList) {
        this.pointsList = pointsList;
    }

    public Shape(int startX, int startY, int pointNumber, float vertexLength) {

        pointsList = new ArrayList<>();


    }

    public void render(Graphics2D g2){

        for(int i = 0;i<pointsList.size()-1;i++){
            g2.setStroke(new BasicStroke(4));
            g2.setColor(StyleScreen.WALL);
            g2.drawLine((int) pointsList.get(i).x,(int) pointsList.get(i).y,(int) pointsList.get(i+1).x,(int) pointsList.get(i+1).y);

        }

    }


}
