package game;

import java.awt.*;

class Gear extends Tower {

    public Gear(Point gpos) {
        // current position of the gear on the board grid
        this.pos = gpos;
        this.imageFile = "src/images/gear.png";
        // load the assets
        loadImage();

        // initialize the state
        pos = gpos;
    }

}