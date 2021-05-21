package Book.JFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ShowCalander extends JFrame {
    ShowCalander(String title){
        setLayout(null);
        setTitle(title);

        CalendarBean cb = new CalendarBean();
        cb.setMonth(5);
        cb.setYear(2021);
        String [] a = cb.getCalendar();
        char [] str = "日一二三四五六".toCharArray();

        JButton button4 = new JButton("显示本月日历");
        Date nowTime = new Date();
        add(button4);
        button4.setBounds(20,10,120,30);
        JLabel label4 = new JLabel();
        add(label4);
        label4.setBounds(160,10,220,30);
        JTextArea text2 = new JTextArea();
        add(text2);
        text2.setBounds(10,60,380,300);
        text2.setEditable(false);
        text2.setOpaque(false);
        text2.setLineWrap(true);
        ActionListener listener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label4.setText(nowTime.toString());
                for (char c : str){
                    text2.append("    "+c+"          ");
                }
                text2.append("\r\n"+"");
                for (int i=0;i<a.length;i++){
                    if(i%7==0) text2.append("\r\n\r\n");
                    if(i<10)  text2.append("        "+a[i]+"        ");
                    else if(i>=10) text2.append("       "+a[i]+"      ");
                }
            }
        };
        button4.addActionListener(listener4);
    }
}
