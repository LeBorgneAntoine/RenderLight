package shape;

import java.util.ArrayList;
import util.*;

public abstract class Shape {

    public ArrayList<Vector> pointsList;

    public Shape(ArrayList<Vector> pointsList) {
        this.pointsList = pointsList;
    }

    public Shape(int startX, int startY, int pointNumber, float vertexLength) {

        pointsList = new ArrayList<Vector>();

        for(int i = 0;i<pointNumber;i++){
           //TODO construct shape from points
        }




    }
}
