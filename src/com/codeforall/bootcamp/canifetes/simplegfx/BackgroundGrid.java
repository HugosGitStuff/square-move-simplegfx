package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Color;
import com.codeforall.simplegraphics.graphics.Rectangle;

public class BackgroundGrid {

    private int cellSize;      // cell size
    private int gridSize;      // cell quantity
    private int startX;        // grid start on x 10
    private int startY;        // grid start on y 10

    // constructor to create grid
    public BackgroundGrid(int startX, int startY, int gridSize, int cellSize) {
        this.startX = startX;
        this.startY = startY;
        this.gridSize = gridSize;
        this.cellSize = cellSize;
    }

    // method draw entire grid
    public void draw() {
        // out loop through each row
        for (int row = 0; row < gridSize; row++) {

            // in loop through each column in this row
            for (int col = 0; col < gridSize; col++) {

                // calculate position for this cell
                int x = startX + (col * cellSize);  // Move right for each column
                int y = startY + (row * cellSize);  // Move down for each row

                // create a rectangle for this cell
                Rectangle cell = new Rectangle(x, y, cellSize, cellSize);

                // set grid line color black
                cell.setColor(Color.BLACK);

                // draw cells
                cell.draw();
            }
        }
    }
}
