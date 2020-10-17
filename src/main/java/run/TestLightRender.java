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

        this.setPreferredSize(new Dimension(1000,600));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //=============================================
        //            PANEL INIT
        //=============================================

        this.screen = new ScreenDisplay();
        this.screen.addShape(new shape.Line(100,300,800,550));


        //=============================================
        //             ADDING COMPONENT
        //=============================================
        this.add(this.screen);



        this.pack();
    }

    public static void main(String[] args){
        new TestLightRender().setVisible(true);
    }

}
