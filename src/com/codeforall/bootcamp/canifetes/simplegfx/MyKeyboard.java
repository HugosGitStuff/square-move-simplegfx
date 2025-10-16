package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Rectangle;
import com.codeforall.simplegraphics.keyboard.Keyboard;
import com.codeforall.simplegraphics.keyboard.KeyboardEvent;
import com.codeforall.simplegraphics.keyboard.KeyboardEventType;
import com.codeforall.simplegraphics.keyboard.KeyboardHandler;
import com.codeforall.simplegraphics.pictures.Picture;

import java.awt.*;

public class MyKeyboard implements KeyboardHandler {
    
    private Keyboard keyboard;
    private Rectangle square;
    
    public void init() {
        
        keyboard = new Keyboard(this);
        
        //set up the event
        KeyboardEvent goRight = new KeyboardEvent();
        KeyboardEvent goLeft = new KeyboardEvent();
        KeyboardEvent goUp = new KeyboardEvent();
        KeyboardEvent goDown = new KeyboardEvent();

        //set the key to the event
        //Right
        goRight.setKey(KeyboardEvent.KEY_RIGHT);
        goRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        // Left
        goLeft.setKey(KeyboardEvent.KEY_LEFT);
        goLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        // Up
        goUp.setKey(KeyboardEvent.KEY_UP);
        goUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        // Down
        goDown.setKey(KeyboardEvent.KEY_DOWN);
        goDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        
        //add event to the keyboard
        keyboard.addEventListener(goRight);
        keyboard.addEventListener(goLeft);
        keyboard.addEventListener(goUp);
        keyboard.addEventListener(goDown);
    }
    
    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_RIGHT) {
            // System.out.println("go right");
            square.moveRight();
        } else if(keyboardEvent.getKey() == KeyboardEvent.KEY_LEFT) {
            // System.out.println("go left");
            square.moveLeft();
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_UP) {
            // System.out.println("go up");
            square.moveUp();
        } else if (keyboardEvent.getKey() == KeyboardEvent.KEY_DOWN) {
            // System.out.println("go down");
            square.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public void setSquare(Rectangle square) {
        this.square = square;
    }
}
