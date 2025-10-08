package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.pictures.Picture;

public class Spaceship {
    
    private Picture picture;
    private String currentDirection; // Start current direction (facing right)

    public Spaceship(Picture picture) {
        this.picture = picture;
        this.currentDirection = "right";
        this.picture.draw();
    }

    public void changeDirection(String newDirection){
        // Only change if it's a different direction
        if(currentDirection.equals(newDirection)){
            return; // Already facing this way, do nothing
        }

        // Get current position
        int x = picture.getX();
        int y = picture.getY();

        // Delete old picture
        picture.delete();

        // Create new picture based on direction
        if (newDirection.equals("up")) {
            picture = new Picture(x, y, "resources/milenial-up.png");
        } else if (newDirection.equals("down")) {
            picture = new Picture(x, y, "resources/milenial-down.png");
        } else if (newDirection.equals("left")) {
            picture = new Picture(x, y,"resources/milenial-left.png");
        } else if (newDirection.equals("right")) {
            picture = new Picture(x, y,"resources/milenial-right.png");
        }

        // drawing in new direction
        picture.draw();
        currentDirection = newDirection;
    }
    
    public void moveRight() {
        changeDirection("right");
        // Check if right edge + movement stays within right boundary (910)
        if (picture.getMaxX() + 10 <= 910){
        picture.translate(10, 0);
        }
    }
    public void moveLeft() {
        changeDirection("left");
        // Check if left edge - movement stays within left boundary (10)
        if (picture.getX() - 10 >= 10) {
            picture.translate(-10, 0);
        }
    }
    public void moveUp() {
        changeDirection("up");
        // Check if top edge - movement stays within top boundary (10)
        if (picture.getY() - 10 >= 10) {
            picture.translate(0, -10);
        }
    }
    public void moveDown() {
        changeDirection("down");
        // Check if bottom edge + movement stays within bottom boundary (610)
        if (picture.getMaxY() + 10 <= 610) {
            picture.translate(0, 10);
        }
    }
}
