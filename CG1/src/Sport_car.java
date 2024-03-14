import java.awt.*;

public class Sport_car {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Sport_car(final int x, final int y, final int width, final int height, final Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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




        // cabin
        g.setColor(this.color);
        g.fillOval((int)(this.x + 0.02 * this.width), this.y, (int)(0.22 * this.width), (int)(0.75 * height));
        g.setColor(Color.BLACK);
        g.drawOval((int)(this.x + 0.02 * this.width), this.y, (int)(0.22 * this.width), (int)(0.75 * height));

        // windows
        g.setColor(Color.cyan);
        g.fillOval((int)(this.x + 0.043 * this.width), (int) (this.y + 0.05 * this.height), (int)(0.18 * this.width), (int)(0.68 * height));
        g.setColor(Color.BLUE);
        g.drawOval((int)(this.x + 0.043 * this.width), (int) (this.y + 0.05 * this.height), (int)(0.18 * this.width), (int)(0.68 * height));

        // body
        g.setColor(this.color);
        g.fillRoundRect(this.x, (int)(this.y + 0.25 * this.height), (int)(0.33 * this.width), (int)(0.5 * this.height),  30, 30);
        g.setColor(Color.BLACK);
        g.drawRoundRect(this.x, (int)(this.y + 0.25 * this.height), (int)(0.33 * this.width), (int)(0.5 * this.height), 30, 30);

        // handle
        g.setColor(Color.BLACK);
        g.fillOval((int) (this.x + 0.13 * this.width), (int) (this.y + 0.31 * this.height), (int) (0.02 * this.width), (int) (0.03 * height));
        g.drawOval((int) (this.x + 0.13 * this.width), (int) (this.y + 0.31 * this.height), (int) (0.02 * this.width), (int) (0.03 * height));

        // headlight
        Color myColor = new Color(230, 230, 240);
        g.setColor(myColor);
        g.fillOval((int) (this.x + 0.28 * this.width), (int) (this.y + 0.31 * this.height), (int) (0.04 * this.width), (int) (0.06 * height));
        g.drawOval((int) (this.x + 0.28 * this.width), (int) (this.y + 0.31 * this.height), (int) (0.04 * this.width), (int) (0.06 * height));

        // stop signal
        g.setColor(Color.red);
        g.fillOval((int) (this.x + 0.00 * this.width), (int) (this.y + 0.27 * this.height), (int) (0.02 * this.width), (int) (0.1 * height));
        g.drawOval((int) (this.x + 0.00 * this.width), (int) (this.y + 0.27 * this.height), (int) (0.02 * this.width), (int) (0.1 * height));

        // wheels
        g.setColor(Color.BLACK);
        g.fillOval((int) (this.x + 0.25 * this.width), (int) (this.y + 0.6 * this.height), (int) (0.06 * this.width), (int) (0.35 * height));
        g.drawOval((int) (this.x + 0.25  * this.width), (int) (this.y + 0.6 * this.height), (int) (0.06 * this.width), (int) (0.35 * height));

        g.fillOval((int) (this.x + 0.03 * this.width), (int) (this.y + 0.6 * this.height), (int) (0.06 * this.width), (int) (0.35 * height));
        g.drawOval((int) (this.x + 0.03 * this.width), (int) (this.y + 0.6 * this.height), (int) (0.06 * this.width), (int) (0.35 * height));


    }
}