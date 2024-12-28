import java.awt.*;
import java.awt.event.*;

class MovingCircleGame extends Frame implements MouseMotionListener {
    int circleX = 200, circleY = 200, circleRadius = 20;

    MovingCircleGame()
    {
        addMouseMotionListener(this);

        setSize(400,400);
        setLayout(null);
        setTitle("Ball Game");
        setVisible(true);
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.fillOval(circleX,circleY,2*circleRadius,2*circleRadius);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        if(x <circleX+circleRadius)
        {
            circleX++;
        }

        if(x > circleX+circleRadius)
        {
            circleX--;
        }

        if(y< circleY+circleRadius)
        {
            circleY++;
        }

        if(y>circleY+circleRadius)
        {
            circleY--;
        }

        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        int x = e.getX();
//        int y = e.getY();
//
//        if(x <circleX+circleRadius)
//        {
//            circleX++;
//        }
//
//        if(x > circleX+circleRadius)
//        {
//            circleX--;
//        }
//
//        if(y< circleY+circleRadius)
//        {
//            circleY++;
//        }
//
//        if(y>circleY+circleRadius)
//        {
//            circleY--;
//        }
//
//        repaint();
    }

    public static void main(String[] args) {
        new MovingCircleGame();
    }
}
