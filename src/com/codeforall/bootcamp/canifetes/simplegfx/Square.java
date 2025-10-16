package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Rectangle;
import com.codeforall.simplegraphics.graphics.Color;

public class Square {

    private Rectangle square;
    private int cellSize;       // How big each cell is (10)
    private int gridStartX;     // Where grid starts X (10)
    private int gridStartY;     // Where grid starts Y (10)
    private int gridSize;       // How many cells in grid (50)

    // Constructor
    public Square(int startX, int startY, int cellSize, int gridSize) {
        this.cellSize = cellSize;
        this.gridStartX = 10;     // Grid starts at 10
        this.gridStartY = 10;     // Grid starts at 10
        this.gridSize = gridSize;

        // Create the square
        this.square = new Rectangle(startX, startY, cellSize, cellSize);
        this.square.setColor(Color.GREEN);  // Make it green so you can see it
        this.square.fill();  // Fill it with color
    }

    public void moveRight() {
        // Calculate the rightmost position the square can be
        int maxX = gridStartX + (gridSize * cellSize) - cellSize;

        // Check if we can move right (one full cell)
        if (square.getX() + cellSize <= maxX) {
            square.translate(cellSize, 0);  // Move one cell right
        }
    }

    public void moveLeft() {
        // Check if we can move left (don't go past left edge)
        if (square.getX() - cellSize >= gridStartX) {
            square.translate(-cellSize, 0);  // Move one cell left
        }
    }

    public void moveUp() {
        // Check if we can move up (don't go past top edge)
        if (square.getY() - cellSize >= gridStartY) {
            square.translate(0, -cellSize);  // Move one cell up
        }
    }

    public void moveDown() {
        // Calculate the bottommost position the square can be
        int maxY = gridStartY + (gridSize * cellSize) - cellSize;

        // Check if we can move down (one full cell)
        if (square.getY() + cellSize <= maxY) {
            square.translate(0, cellSize);  // Move one cell down
        }
    }
}