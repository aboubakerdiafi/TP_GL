package org.emp.gl.GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GUI {
    JFrame frame ;
    JLabel timeLabel;
    public GUI() {
        frame = new JFrame("Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        timeLabel = new JLabel("clock");
        timeLabel.setFont(new Font(timeLabel.getName(), Font.PLAIN, 30));
        timeLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.getContentPane().add(timeLabel);
        frame.setVisible(true);
    }
   public  void run(String time)
   {
        this.timeLabel.setText(time);
                }






}
