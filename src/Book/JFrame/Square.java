package Book.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class Square extends JFrame {
    Square(String title){
        JFrame win = new JFrame();
        setLayout(null);
        setTitle(title);
        JTextField text = new JTextField();
        add(text);
        text.setBounds(20,10,120,30);
        JLabel label3 = new JLabel("计算结果在这哦");
        add(label3);
        label3.setBounds(150,10,250,30);
        ActionListener listener3 = new ActionListener() {
            String m = text.getText();
            double n = Math.sqrt(1);
            @Override
            public void actionPerformed(ActionEvent e) {
                label3.setText(m+"开根的值为"+n);
            }
        };
        text.addActionListener(listener3);
    }
}
