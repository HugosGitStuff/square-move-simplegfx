package com.codeforall.bootcamp.canifetes.simplegfx;

import com.codeforall.simplegraphics.graphics.Color;
import com.codeforall.simplegraphics.graphics.Rectangle;

public class BackgroundGrid {

    private int cellSize;      // Size of each cell (10 pixels)
    private int gridSize;      // How many cells (50x50)
    private int startX;        // Where grid starts (10)
    private int startY;        // Where grid starts (10)

    // Constructor - creates the grid
    public BackgroundGrid(int startX, int startY, int gridSize, int cellSize) {
        this.startX = startX;
        this.startY = startY;
        this.gridSize = gridSize;
        this.cellSize = cellSize;
    }

    // Method to draw the entire grid
    public void draw() {
        // Outer loop: goes through each ROW (top to bottom)
        for (int row = 0; row < gridSize; row++) {

            // Inner loop: goes through each COLUMN in this row (left to right)
            for (int col = 0; col < gridSize; col++) {

                // Calculate position for this cell
                int x = startX + (col * cellSize);  // Move right for each column
                int y = startY + (row * cellSize);  // Move down for each row

                // Create a rectangle for this cell
                Rectangle cell = new Rectangle(x, y, cellSize, cellSize);

                // Set color (light gray for grid lines)
                cell.setColor(Color.LIGHT_GRAY);

                // Draw the cell
                cell.draw();
            }
        }
    }
}
