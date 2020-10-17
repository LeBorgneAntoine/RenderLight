package shape;

import util.Vector;

import java.util.ArrayList;

public class Line extends Shape{

    public Line(int x1,int y1, int x2, int y2) {

        super(new ArrayList<Vector>());

        this.pointsList.add(new Vector(x1,y1));
        this.pointsList.add(new Vector(x2,y2));

    }
}
