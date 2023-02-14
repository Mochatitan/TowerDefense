package game;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;

public class Tower {

    // image that represents the gear's position on the board
    protected BufferedImage image;
    protected Image newImage;
    // current position of the gear on the board grid
    protected Point pos;
    protected String imageFile;

    protected Tower(Point gpos, String imageFile) {
        // current position of the gear on the board grid
        this.pos = gpos;
        this.imageFile = imageFile;
        // load the assets
        loadImage();

        // initialize the state
        pos = gpos;
    }

    private void loadImage() {
        try {
            // you can use just the filename if the image file is in your
            // project folder, otherwise you need to provide the file path.
            image = ImageIO.read(new File(imageFile));
            newImage = image.getScaledInstance(Board.TILE_SIZE, Board.TILE_SIZE, Image.SCALE_DEFAULT);
        } catch (IOException exc) {
            System.out.println("Error opening image file: " + exc.getMessage());
        }
    }

    public void draw(Graphics g, ImageObserver observer) {
        // with the Point class, note that pos.getX() returns a double, but
        // pos.x reliably returns an int. https://stackoverflow.com/a/30220114/4655368
        // this is also where we translate board grid position into a canvas pixel
        // position by multiplying by the tile size.
        g.drawImage(
                newImage,
                pos.x * Board.TILE_SIZE,
                pos.y * Board.TILE_SIZE,
                observer);
    }

    public Point getPos() {
        return pos;
    }

    public void tick() {
        // called before repaint

    }

}
