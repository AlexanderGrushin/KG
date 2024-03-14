import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class Cloud {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Cloud(final int x, final int y, final Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        g.setColor(Color.WHITE);
        g.fillOval(this.x, this.y, this.width, this.height);
        g.fillOval((int)(this.x + 50), (int)(this.y + 15), 100, 50);
        g.fillOval((int)(this.x + 100), (int)(this.y + 50), 100, 50);
        g.fillOval((int)(this.x + 40), (int)(this.y + 50), 100, 50);

    }

}
