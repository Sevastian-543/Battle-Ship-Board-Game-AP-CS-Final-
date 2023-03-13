import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI implements ActionListener{
    public int x = 10;
    private JButton start;
    private JLabel picLabel;
    public GUI () throws IOException {
        JFrame frame = new JFrame("Battleship");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        frame.setSize(720,720);
        frame.setLayout(new BorderLayout(10,10));
        frame.setResizable(false);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.blue);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.blue);
        panel5.setBackground(Color.white);

        panel1.setPreferredSize(new Dimension(100,90));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,90));
        panel5.setPreferredSize(new Dimension(100,100));

        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);

        JButton button0 = new JButton();
        button0.setPreferredSize(new Dimension(44,44));

        JButton button1 = new JButton();
        button1.setPreferredSize(new Dimension(44,44));

        JButton button2 = new JButton();
        button2.setPreferredSize(new Dimension(44,44));

        JButton button3 = new JButton();
        button3.setPreferredSize(new Dimension(44,44));

        JButton button4 = new JButton();
        button4.setPreferredSize(new Dimension(44,44));

        JButton button5 = new JButton();
        button5.setPreferredSize(new Dimension(44,44));

        JButton button6 = new JButton();
        button6.setPreferredSize(new Dimension(44,44));

        JButton button7 = new JButton();
        button7.setPreferredSize(new Dimension(44,44));

        JButton button8 = new JButton();
        button8.setPreferredSize(new Dimension(44,44));

        JButton button9 = new JButton();
        button9.setPreferredSize(new Dimension(44,44));

        JButton button10 = new JButton();
        button10.setPreferredSize(new Dimension(44,44));

        JButton button11 = new JButton();
        button11.setPreferredSize(new Dimension(44,44));

        JButton button12 = new JButton();
        button12.setPreferredSize(new Dimension(44,44));

        JButton button13 = new JButton();
        button13.setPreferredSize(new Dimension(44,44));

        JButton button14 = new JButton();
        button14.setPreferredSize(new Dimension(44,44));

        JButton button15 = new JButton();
        button15.setPreferredSize(new Dimension(44,44));

        JButton button16 = new JButton();
        button16.setPreferredSize(new Dimension(44,44));

        JButton button17 = new JButton();
        button17.setPreferredSize(new Dimension(44,44));

        JButton button18 = new JButton();
        button18.setPreferredSize(new Dimension(44,44));

        JButton button19 = new JButton();
        button19.setPreferredSize(new Dimension(44,44));

        JButton button20 = new JButton();
        button20.setPreferredSize(new Dimension(44,44));

        JButton button21 = new JButton();
        button21.setPreferredSize(new Dimension(44,44));

        JButton button22 = new JButton();
        button22.setPreferredSize(new Dimension(44,44));

        JButton button23 = new JButton();
        button23.setPreferredSize(new Dimension(44,44));

        JButton button24 = new JButton();
        button24.setPreferredSize(new Dimension(44,44));

        JButton button25 = new JButton();
        button25.setPreferredSize(new Dimension(44,44));

        JButton button26 = new JButton();
        button26.setPreferredSize(new Dimension(44,44));

        JButton button27 = new JButton();
        button27.setPreferredSize(new Dimension(44,44));

        JButton button28 = new JButton();
        button28.setPreferredSize(new Dimension(44,44));

        JButton button29 = new JButton();
        button29.setPreferredSize(new Dimension(44,44));

        JButton button30 = new JButton();
        button30.setPreferredSize(new Dimension(44,44));

        JButton button31 = new JButton();
        button31.setPreferredSize(new Dimension(44,44));

        JButton button32 = new JButton();
        button32.setPreferredSize(new Dimension(44,44));

        JButton button33 = new JButton();
        button33.setPreferredSize(new Dimension(44,44));

        JButton button34 = new JButton();
        button34.setPreferredSize(new Dimension(44,44));

        JButton button35 = new JButton();
        button35.setPreferredSize(new Dimension(44,44));

        JButton button36 = new JButton();
        button36.setPreferredSize(new Dimension(44,44));

        JButton button37 = new JButton();
        button37.setPreferredSize(new Dimension(44,44));

        JButton button38 = new JButton();
        button38.setPreferredSize(new Dimension(44,44));

        JButton button39 = new JButton();
        button39.setPreferredSize(new Dimension(44,44));

        JButton button40 = new JButton();
        button40.setPreferredSize(new Dimension(44,44));

        JButton button41 = new JButton();
        button41.setPreferredSize(new Dimension(44,44));

        JButton button42 = new JButton();
        button42.setPreferredSize(new Dimension(44,44));

        JButton button43 = new JButton();
        button43.setPreferredSize(new Dimension(44,44));

        JButton button44 = new JButton();
        button44.setPreferredSize(new Dimension(44,44));

        JButton button45 = new JButton();
        button45.setPreferredSize(new Dimension(44,44));

        JButton button46 = new JButton();
        button46.setPreferredSize(new Dimension(44,44));

        JButton button47 = new JButton();
        button47.setPreferredSize(new Dimension(44,44));

        JButton button48 = new JButton();
        button48.setPreferredSize(new Dimension(44,44));

        JButton button49 = new JButton();
        button49.setPreferredSize(new Dimension(44,44));

        JButton button50 = new JButton();
        button50.setPreferredSize(new Dimension(44,44));

        JButton button51 = new JButton();
        button51.setPreferredSize(new Dimension(44,44));

        JButton button52 = new JButton();
        button52.setPreferredSize(new Dimension(44,44));

        JButton button53 = new JButton();
        button53.setPreferredSize(new Dimension(44,44));

        JButton button54 = new JButton();
        button54.setPreferredSize(new Dimension(44,44));

        JButton button55 = new JButton();
        button55.setPreferredSize(new Dimension(44,44));

        JButton button56 = new JButton();
        button56.setPreferredSize(new Dimension(44,44));

        JButton button57 = new JButton();
        button57.setPreferredSize(new Dimension(44,44));

        JButton button58 = new JButton();
        button58.setPreferredSize(new Dimension(44,44));

        JButton button59 = new JButton();
        button59.setPreferredSize(new Dimension(44,44));

        JButton button60 = new JButton();
        button60.setPreferredSize(new Dimension(44,44));

        JButton button61 = new JButton();
        button61.setPreferredSize(new Dimension(44,44));

        JButton button62 = new JButton();
        button62.setPreferredSize(new Dimension(44,44));

        JButton button63 = new JButton();
        button63.setPreferredSize(new Dimension(44,44));

        JButton button64 = new JButton();
        button64.setPreferredSize(new Dimension(44,44));

        JButton button65 = new JButton();
        button65.setPreferredSize(new Dimension(44,44));

        JButton button66 = new JButton();
        button66.setPreferredSize(new Dimension(44,44));

        JButton button67 = new JButton();
        button67.setPreferredSize(new Dimension(44,44));

        JButton button68 = new JButton();
        button68.setPreferredSize(new Dimension(44,44));

        JButton button69 = new JButton();
        button69.setPreferredSize(new Dimension(44,44));

        JButton button70 = new JButton();
        button70.setPreferredSize(new Dimension(44,44));

        JButton button71 = new JButton();
        button71.setPreferredSize(new Dimension(44,44));

        JButton button72 = new JButton();
        button72.setPreferredSize(new Dimension(44,44));

        JButton button73 = new JButton();
        button73.setPreferredSize(new Dimension(44,44));

        JButton button74 = new JButton();
        button74.setPreferredSize(new Dimension(44,44));

        JButton button75 = new JButton();
        button75.setPreferredSize(new Dimension(44,44));

        JButton button76 = new JButton();
        button76.setPreferredSize(new Dimension(44,44));

        JButton button77 = new JButton();
        button77.setPreferredSize(new Dimension(44,44));

        JButton button78 = new JButton();
        button78.setPreferredSize(new Dimension(44,44));

        JButton button79 = new JButton();
        button79.setPreferredSize(new Dimension(44,44));

        JButton button80 = new JButton();
        button80.setPreferredSize(new Dimension(44,44));

        JButton button81 = new JButton();
        button81.setPreferredSize(new Dimension(44,44));

        JButton button82 = new JButton();
        button82.setPreferredSize(new Dimension(44,44));

        JButton button83 = new JButton();
        button83.setPreferredSize(new Dimension(44,44));

        JButton button84 = new JButton();
        button84.setPreferredSize(new Dimension(44,44));

        JButton button85 = new JButton();
        button85.setPreferredSize(new Dimension(44,44));

        JButton button86 = new JButton();
        button86.setPreferredSize(new Dimension(44,44));

        JButton button87 = new JButton();
        button87.setPreferredSize(new Dimension(44,44));

        JButton button88 = new JButton();
        button88.setPreferredSize(new Dimension(44,44));

        JButton button89 = new JButton();
        button89.setPreferredSize(new Dimension(44,44));

        JButton button90 = new JButton();
        button90.setPreferredSize(new Dimension(44,44));

        JButton button91 = new JButton();
        button91.setPreferredSize(new Dimension(44,44));

        JButton button92 = new JButton();
        button92.setPreferredSize(new Dimension(44,44));

        JButton button93 = new JButton();
        button93.setPreferredSize(new Dimension(44,44));

        JButton button94 = new JButton();
        button94.setPreferredSize(new Dimension(44,44));

        JButton button95 = new JButton();
        button95.setPreferredSize(new Dimension(44,44));

        JButton button96 = new JButton();
        button96.setPreferredSize(new Dimension(44,44));

        JButton button97 = new JButton();
        button97.setPreferredSize(new Dimension(44,44));

        JButton button98 = new JButton();
        button98.setPreferredSize(new Dimension(44,44));

        JButton button99 = new JButton();
        button99.setPreferredSize(new Dimension(44,44));

        panel5.add(button0);
        panel5.add(button1);
        panel5.add(button2);
        panel5.add(button3);
        panel5.add(button4);
        panel5.add(button5);
        panel5.add(button6);
        panel5.add(button7);
        panel5.add(button8);
        panel5.add(button9);
        panel5.add(button10);
        panel5.add(button11);
        panel5.add(button12);
        panel5.add(button13);
        panel5.add(button14);
        panel5.add(button15);
        panel5.add(button16);
        panel5.add(button17);
        panel5.add(button18);
        panel5.add(button19);
        panel5.add(button20);
        panel5.add(button21);
        panel5.add(button22);
        panel5.add(button23);
        panel5.add(button24);
        panel5.add(button25);
        panel5.add(button26);
        panel5.add(button27);
        panel5.add(button28);
        panel5.add(button29);
        panel5.add(button30);
        panel5.add(button31);
        panel5.add(button32);
        panel5.add(button33);
        panel5.add(button34);
        panel5.add(button35);
        panel5.add(button36);
        panel5.add(button37);
        panel5.add(button38);
        panel5.add(button39);
        panel5.add(button40);
        panel5.add(button41);
        panel5.add(button42);
        panel5.add(button43);
        panel5.add(button44);
        panel5.add(button45);
        panel5.add(button46);
        panel5.add(button47);
        panel5.add(button48);
        panel5.add(button49);
        panel5.add(button50);
        panel5.add(button51);
        panel5.add(button52);
        panel5.add(button53);
        panel5.add(button54);
        panel5.add(button55);
        panel5.add(button56);
        panel5.add(button57);
        panel5.add(button58);
        panel5.add(button59);
        panel5.add(button60);
        panel5.add(button61);
        panel5.add(button62);
        panel5.add(button63);
        panel5.add(button64);
        panel5.add(button65);
        panel5.add(button66);
        panel5.add(button67);
        panel5.add(button68);
        panel5.add(button69);
        panel5.add(button70);
        panel5.add(button71);
        panel5.add(button72);
        panel5.add(button73);
        panel5.add(button74);
        panel5.add(button75);
        panel5.add(button76);
        panel5.add(button77);
        panel5.add(button78);
        panel5.add(button79);
        panel5.add(button80);
        panel5.add(button81);
        panel5.add(button82);
        panel5.add(button83);
        panel5.add(button84);
        panel5.add(button85);
        panel5.add(button86);
        panel5.add(button87);
        panel5.add(button88);
        panel5.add(button89);
        panel5.add(button90);
        panel5.add(button91);
        panel5.add(button92);
        panel5.add(button93);
        panel5.add(button94);
        panel5.add(button95);
        panel5.add(button96);
        panel5.add(button97);
        panel5.add(button98);
        panel5.add(button99);



        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {

        }
    }
}
