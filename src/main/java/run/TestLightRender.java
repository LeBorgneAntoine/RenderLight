package run;

import javax.swing.*;
import java.awt.*;
import display.*;


public class TestLightRender extends JFrame {

    ScreenDisplay screen;

    public TestLightRender() throws HeadlessException {
        this.init();
    }

    private void init() {

        //=============================================
        //            WINDOW INIT
        //=============================================

        this.setPreferredSize(new Dimension(800,800));

        //=============================================
        //            PANEL INIT
        //=============================================

        this.screen = new ScreenDisplay();
        this.screen.addShape(new shape.Line(4,5,60,80));
        this.add(this.screen);



        this.pack();
    }

    public static void main(String[] args){
        new TestLightRender().setVisible(true);
    }

}
