package game;

import java.awt.*;

class Cannon extends Tower {

    public Cannon(Point gpos) {
        // current position of the gear on the board grid
        this.pos = gpos;
        this.imageFile = "src/images/scratch_cat.png";
        // load the assets
        loadImage();

        // initialize the state
        pos = gpos;
    }

}