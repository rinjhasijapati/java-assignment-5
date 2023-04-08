import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterGUI implements ActionListener {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("1");
    JButton btn1 = new JButton("+");
    JButton btn2 = new JButton("-");

    int count = 1;

    void render(){
        label.setBounds(180, 110, 110, 25);
        label.setFont(new Font("Arial", Font.PLAIN, 30));
        frame.add(label);

        btn1.setBounds(100,150,75,20);
        btn1.setSize(80, 50);
        btn1.setBackground(Color.WHITE);
        btn1.addActionListener(this);
        frame.add(btn1);

        btn2.setBounds(200,150,75,20);
        btn2.setSize(80, 50);
        btn2.setBackground(Color.WHITE);
        btn2.addActionListener(this);
        frame.add(btn2);

        frame.setSize(400,400);
        frame.setTitle("Counter");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setLocationRelativeTo(null);  //places the frame on the center
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btn1){
            count ++;
            label.setText(String.valueOf(count));
        }else if (e.getSource() == btn2){
            count --;
            label.setText(String.valueOf(count));
        }

    }
}
