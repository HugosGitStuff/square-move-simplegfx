package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Rectangle;
import com.codeforall.simplegraphics.graphics.Color;

public class Square {

    private Rectangle square;
    private int cellSize; // cell size
    private int gridStartX;     // grid start X
    private int gridStartY;     // grid start Y
    // private int gridSize;       // cells in grid
    private int maxX;
    private int maxY;

    // constructor
    public Square(int startX, int startY, int cellSize, int gridSize) {

        this.gridStartX = 10;     // grid starts at 10
        this.gridStartY = 10;     // grid starts at 10
        this.cellSize = cellSize;
        // this.gridSize = gridSize;

        // create square
        this.square = new Rectangle(startX, startY, cellSize, cellSize);
        this.square.setColor(Color.GREEN);  // square color
        this.square.fill();  // fill with color
        this.maxX = gridStartX + (gridSize * cellSize) - cellSize; // calculate rightmost position of square
        this.maxY = gridStartY + (gridSize * cellSize) - cellSize; // calculate bottommost position of square
    }

    public void moveLeft() {
        // check if moving left not passing edge
        if (square.getX() - cellSize >= gridStartX) {
            square.translate(-cellSize, 0);  // move one cell left
        }
    }
    public void moveRight() {
        // check if we can move right not passing edge
        int currentRightX = square.getX() + cellSize;
        if (currentRightX <= maxX) {
            square.translate(cellSize, 0); // move one cell right
        }
    }

    public void moveUp() {
        // check if moving up not passing top edge
        if (square.getY() - cellSize >= gridStartY) {
            square.translate(0, -cellSize);  // move one cell up
        }
    }

    public void moveDown() {
        // check if we can move down one full cell
        int currentBottomY = square.getY() + cellSize;
        if (currentBottomY <= maxY) {
            square.translate(0, cellSize);  // move one cell down
        }
    }
}