package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Canvas;
import com.codeforall.simplegraphics.graphics.Rectangle;
import com.codeforall.simplegraphics.pictures.Picture;

public class Main {
    
    public static void main(String[] args) {
        
        Canvas.setMaxX(910);
        Canvas.setMaxY(610);
        
        // Rectangle rectangle = new Rectangle(10, 10, 900, 600);
        // rectangle.draw();

        // Draw background first (bottom layer)
        // Picture: CLASS that already exists in the SimpleGFX library
        // created by the library devs. It provides methods
        Picture background = new Picture(10, 10, "resources/stars-background.png");
        background.draw();

        // Draw spaceship on top
        Spaceship spaceship = new Spaceship(new Picture(10, 10, "resources/milenial-right.png"));
        MyKeyboard myKeyboard = new MyKeyboard();
        myKeyboard.setSpaceship(spaceship);
        myKeyboard.init();
    }
}
