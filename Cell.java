
import java.awt.Color;
import java.awt.Graphics;

public class Cell {

    public Graphics paint(Graphics g, int width, int height, int x, int y ){
        g.setColor(Color.GRAY);
        g.fillRect(width, height, x, y);
        g.setColor(Color.BLACK);
        g.drawRect(width, height, x, y);
        return g;
    }
}
