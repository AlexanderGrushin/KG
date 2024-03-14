import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 100;

    private Sport_car car;
    private BackGround backGround;

    private Cloud cloud;
    private Cloud cloud2;
    private Cloud cloud3;
    private Cloud cloud4;
    private Cloud cloud5;



    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.car = new Sport_car(ticksFromStart, 470, 1000, 170, Color.GREEN);
        this.backGround = new BackGround(200, 200, Color.BLUE);
        this.cloud = new Cloud(50, 35, Color.WHITE);
        this.cloud2 = new Cloud(900, 55, Color.WHITE);
        this.cloud3 = new Cloud(500, 45, Color.WHITE);
        this.cloud4 = new Cloud(250, 100, Color.WHITE);
        this.cloud5 = new Cloud(750, 100, Color.WHITE);



    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        car.setX(ticksFromStart);
        backGround.draw(gr);
        car.draw(gr);
        cloud.draw(gr);
        cloud.setX(-ticksFromStart);
        cloud2.draw(gr);
        cloud2.setX(-ticksFromStart+900);
        cloud3.draw(gr);
        cloud3.setX(-ticksFromStart+500);
        cloud4.draw(gr);
        cloud4.setX(-ticksFromStart+250);
        cloud5.draw(gr);
        cloud5.setX(-ticksFromStart+750);
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}