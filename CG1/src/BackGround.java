import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class BackGround {

    private int x;
    private int y;
    private Color color;




    public BackGround(final int x, final int y, final Color color) {
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



    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        // цвет фона
        Color myColor = new Color(0, 94, 28);
        g.setColor(myColor);
        g.fillRect(0, 0,1200, 920);

        //небо
        Color myColor1 = new Color(150, 230, 255);
        g.setColor(myColor1);
        g.fillRect(0, 0,1200, 350);

        //дорога
        g.setColor(Color.GRAY);
        g.fillRect(0,430,3000,230);

        //разметка
        g.setColor(Color.WHITE);
        g.fillRect(0,530,3000,20);

    }
}
