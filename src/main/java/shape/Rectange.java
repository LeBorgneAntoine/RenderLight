package shape;

import display.ScreenDisplay;
import util.Vector;

import java.util.ArrayList;

public class Rectange extends Shape{
    public Rectange(int posX, int poxY, int width, int height, ScreenDisplay screen) {
        super(new ArrayList<>(),screen);

        this.pointsList.add(new Vector(posX,poxY));
        this.pointsList.add(new Vector(posX+width,poxY));
        this.pointsList.add(new Vector(posX+width,poxY+height));
        this.pointsList.add(new Vector(posX,poxY+height));

    }
}
