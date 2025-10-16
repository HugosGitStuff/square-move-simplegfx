package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Canvas;

public class Main {

    public static void main(String[] args) {

        // Set up canvas size
        Canvas.setMaxX(520);
        Canvas.setMaxY(520);

        // Define grid properties
        int gridStartX = 10;
        int gridStartY = 10;
        int cellSize = 10;      // Each cell is 10x10 pixels
        int gridSize = 50;       // 50x50 grid of cells

        // Step 1: Draw the background grid
        BackgroundGrid grid = new BackgroundGrid(gridStartX, gridStartY, gridSize, cellSize);
        grid.draw();

        // Step 2: Create the movable square (starts at top-left of grid)
        Square square = new Square(gridStartX, gridStartY, cellSize, gridSize);

        // Step 3: Set up keyboard controls
        MyKeyboard myKeyboard = new MyKeyboard();
        myKeyboard.setSquare(square);
        myKeyboard.init();

        System.out.println("Use arrow keys to move the green square!");
    }
}
