import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MouseExample implements MouseListener{
    Label status;
    Frame frame;
    MouseExample()
    {
        status = new Label("This is a mouse");
        frame = new Frame("Mouse Listener");
        frame.add(status);
        frame.addMouseListener(this);

        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new MouseExample();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        status.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        status.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        status.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        status.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        status.setText("Mouse Exited");
    }
}
