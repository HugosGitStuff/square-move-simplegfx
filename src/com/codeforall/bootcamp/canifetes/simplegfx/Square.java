package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Rectangle;
import com.codeforall.simplegraphics.pictures.Picture;



public class Square {
    
    private Rectangle square;
    private String currentPosition; // Start current position (facing right)

    public Square(Rectangle square) {
        this.square = square;
        this.currentPosition = "";
        this.square.draw();
    }


    public void changePosition(String newPosition){
        // Only change if it's a different position
        if(currentPosition.equals(newPosition)){
            return; // Already facing this way, do nothing
        }

        // Get current position
        int x = square.getX();
        int y = square.getY();

        // Delete old picture
        square.delete();

        // Create new picture based on direction
        if (newPosition.equals("up")) {
            square = new Rectangle();
        } else if (newPosition.equals("down")) {
            square = new Rectangle();
        } else if (newPosition.equals("left")) {
            square = new Rectangle();
        } else if (newPosition.equals("right")) {
            square = new Rectangle();
        }

        // drawing in new direction
        square.draw();
        currentPosition = newPosition;
    }
    
    public void moveRight() {
        // changeDirection("right");
        // Check if right edge + movement stays within right boundary (910)
        if (square.getX() + 10 <= 910){
        square.translate(10, 0);
        }
    }
    public void moveLeft() {
        // changeDirection("left");
        // Check if left edge - movement stays within left boundary (10)
        if (square.getWidth() - 10 >= 10) {
            square.translate(-10, 0);
        }
    }
    public void moveUp() {
        // changeDirection("up");
        // Check if top edge - movement stays within top boundary (10)
        if (square.getY() - 10 >= 10) {
            square.translate(0, -10);
        }
    }
    public void moveDown() {
        // changeDirection("down");
        // Check if bottom edge + movement stays within bottom boundary (610)
        if (square.getHeight() + 10 <= 610) {
            square.translate(0, 10);
        }
    }
}
