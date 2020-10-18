package shape;

import java.awt.*;
import java.util.ArrayList;

import display.ScreenDisplay;
import style.StyleScreen;
import util.*;

public abstract class Shape {

    public ArrayList<Vector> pointsList;
    private ScreenDisplay screen;
    int direction = 1;

    public Shape(ArrayList<Vector> pointsList, ScreenDisplay screen) {

        this.pointsList = pointsList;
        this.screen = screen;
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
        if(pointsList.size()>2)g2.drawLine((int)pointsList.get(0).x,(int)pointsList.get(0).y,(int)pointsList.get(pointsList.size()-1).x,(int)pointsList.get(pointsList.size()-1).y);


    }


    public void moving(){


        for(Vector point : pointsList){

            point.y += direction;

            if(point.y >= screen.getHeight() || point.y <= 0){
                direction *=-1;
            }


        }


    }


}
