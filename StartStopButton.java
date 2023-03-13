import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartStopButton implements ActionListener{
    public int x = 10;
    private JButton fBtn;
    private JButton sBtn;
    private JLabel label;
    public StartStopButton () {
        JFrame frame = new JFrame("Timer");
        frame.setSize(220,150);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fBtn = new JButton("Start");
        sBtn = new JButton("Stop");
        label = new JLabel("Press a button");

        fBtn.addActionListener(this);
        sBtn.addActionListener(this);

        frame.getContentPane().add(fBtn);
        frame.getContentPane().add(sBtn);
        frame.getContentPane().add(label);

        //display the frame
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            for (int i = x; i >= 0; i--) {
                System.out.println(i);
                label.setText(String.valueOf(i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        else {

        }
    }
}
