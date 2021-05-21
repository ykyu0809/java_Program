package Book.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ShowTime extends JFrame{
    ShowTime(String title) {
        setLayout(null);
        setTitle(title);
        JButton button1 = new JButton("点击显示时间");
        Date nowTime = new Date();
        add(button1);
        button1.setBounds(20,10,120,40);
        JLabel label1 = new JLabel("时间会在这出现哦");
        add(label1);
        label1.setBounds(160,10,220,40);
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(nowTime.toString());
            }
        };
        button1.addActionListener(listener1);
    }
}
